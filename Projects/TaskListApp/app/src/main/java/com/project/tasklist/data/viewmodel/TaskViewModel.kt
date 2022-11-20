package com.project.tasklist.data.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.project.tasklist.data.TaskDatabase
import com.project.tasklist.data.models.TaskData
import com.project.tasklist.data.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModel(application: Application) : AndroidViewModel(application) {
    private val toDoDAO = TaskDatabase.getDatabase(application).taskDao()
    val sortByHighPriority: LiveData<List<TaskData>>
    val sortByLowPriority: LiveData<List<TaskData>>
    private val repository: TaskRepository

    val getAllData: LiveData<List<TaskData>>

    init {
        repository = TaskRepository(toDoDAO)
        getAllData = repository.getAllData
        sortByHighPriority = repository.sortByHighPriority
        sortByLowPriority = repository.sortByLowPriority
    }

    fun insertData(taskData: TaskData) {
        // we launch a coroutine in order to add data in the background thread
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertData(taskData)
        }
    }

    fun updateData(taskData: TaskData){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateData(taskData)
        }
    }

    fun deleteData(taskData: TaskData){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteData(taskData)
        }
    }

    fun deleteAll(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
        }
    }

    fun searchDatabase(searchQuery: String): LiveData<List<TaskData>>{
        return repository.searchDatabase(searchQuery)
    }
}