package com.project.tasklist.data.repository

import androidx.lifecycle.LiveData
import com.project.tasklist.data.TaskDAO
import com.project.tasklist.data.models.TaskData

// The repository class provides a clean API for data access to the rest of the app as it separates
// data sources from the app
class TaskRepository(private val taskDAO: TaskDAO) {
    val getAllData: LiveData<List<TaskData>> = taskDAO.getAllData()
    val sortByHighPriority: LiveData<List<TaskData>> = taskDAO.sortByHighPriority()
    val sortByLowPriority: LiveData<List<TaskData>> = taskDAO.sortByLowPriority()

    suspend fun insertData(taskData: TaskData) {
        taskDAO.insertData(taskData)
    }

    suspend fun updateData(taskData: TaskData){
        taskDAO.updateData(taskData)
    }

    suspend fun deleteData(taskData: TaskData){
        taskDAO.deleteItem(taskData)
    }

    suspend fun deleteAll(){
        taskDAO.deleteAll()
    }

    fun searchDatabase(searchQuery: String): LiveData<List<TaskData>>{
        return taskDAO.searchDatabase(searchQuery)
    }


}