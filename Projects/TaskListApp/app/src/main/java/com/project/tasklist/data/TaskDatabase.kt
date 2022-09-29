package com.project.tasklist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.project.tasklist.data.models.TaskData

@Database(entities = [TaskData::class], version = 1, exportSchema = true)
@TypeConverters(Converter::class)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDAO

    // we create this as companion object because we do not want to create more than one instance
    // for our application
    companion object {
        // volatile annotation specifies that the variable is immediately made visible to other
        // threads
        @Volatile
        private var INSTANCE: TaskDatabase? = null

        fun getDatabase(context: Context): TaskDatabase {
            val tempInstance = INSTANCE
            // check if instance is not null then return the instance
            if (tempInstance != null) {
                return tempInstance
            }
            // if there is no instance then we create instance inside synchronized block
            // this block is used because we don't want multiple threads to create multiple instances
            // hence only one thread can access this block at once
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaskDatabase::class.java,
                    "task_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}