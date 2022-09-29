package com.project.tasklist.data

import androidx.room.TypeConverter
import com.project.tasklist.data.models.Priority

class Converter {
    // TypeConverter annotation is added here to tell ROOM that this function is used for type
    // conversion. Only primitive data types are allowed hence we use type converters
    @TypeConverter
    fun fromPriority(priority: Priority): String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}