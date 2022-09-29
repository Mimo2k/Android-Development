package com.project.tasklist.fragments

import android.app.Application
import android.text.TextUtils
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.project.tasklist.R
import com.project.tasklist.data.models.Priority
import com.project.tasklist.data.models.TaskData


class SharedViewModel(application: Application) : AndroidViewModel(application) {

    // we are using mutable live data so that we can modify data later
    // if we don't want to change the data later, we use live data
    // we set default value to false so we don't see the no_data views when the app starts
    val emptyDatabase: MutableLiveData<Boolean> = MutableLiveData(false)

    // function to check if database is empty
    fun checkIfDatabaseEmpty(taskData: List<TaskData>){
        emptyDatabase.value = taskData.isEmpty()
    }

    // listener to change the color of listener according to the priority chosen
    val listener: AdapterView.OnItemSelectedListener = object :
        AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            when (position) {
                0 -> {
                    (parent?.getChildAt(0) as TextView)
                        .setTextColor(ContextCompat.getColor(application, R.color.red))
                }

                1 -> {
                    (parent?.getChildAt(0) as TextView)
                        .setTextColor(ContextCompat.getColor(application, R.color.yellow))
                }

                2 -> {
                    (parent?.getChildAt(0) as TextView)
                        .setTextColor(ContextCompat.getColor(application, R.color.green))
                }
            }
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }
    }

    // function to check whether the text fields are empty or not
    fun verifyDataFromUser(title: String, description: String): Boolean {
        return if (TextUtils.isEmpty(title) || TextUtils.isEmpty(description)) {
            false
        } else !(title.isEmpty() || description.isEmpty())
    }

    // function to convert string to priority object
    fun parsePriority(priority: String): Priority {
        return when (priority) {
            "High Priority" -> {
                Priority.HIGH
            }
            "Medium Priority" -> {
                Priority.MEDIUM
            }
            "Low Priority" -> {
                Priority.LOW
            }
            else -> Priority.LOW
        }
    }

    // function to parse the priority into Integer value in order to set the value using safe args
    fun parsePriorityToInt(priority: Priority): Int {
        return when (priority) {
            Priority.HIGH -> 0
            Priority.MEDIUM -> 1
            Priority.LOW -> 2
        }
    }

}