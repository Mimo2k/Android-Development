package com.project.tasklist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.project.tasklist.data.models.TaskData

// this class is responsible for defining the methods to access the database
@Dao
interface TaskDAO {
    // it will return list of TaskData wrapped inside live data so we can update in realtime
    @Query("SELECT * FROM task_table ORDER BY id ASC")
    fun getAllData(): LiveData<List<TaskData>>

    // OnConflictStrategy handles the situation when same data is entered again
    // here we just ignore that
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(taskData: TaskData)

    @Update
    suspend fun updateData(taskData: TaskData)

    @Delete
    suspend fun deleteItem(taskData: TaskData)

    @Query("DELETE FROM task_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM task_table WHERE title LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): LiveData<List<TaskData>>

    @Query("SELECT * FROM task_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 " +
            "WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END")
    fun sortByHighPriority(): LiveData<List<TaskData>>

    @Query("SELECT * FROM task_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 " +
            "WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): LiveData<List<TaskData>>
}