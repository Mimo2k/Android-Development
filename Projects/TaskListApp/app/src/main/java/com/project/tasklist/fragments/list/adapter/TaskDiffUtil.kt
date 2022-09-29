package com.project.tasklist.fragments.list.adapter

import androidx.recyclerview.widget.DiffUtil
import com.project.tasklist.data.models.TaskData

class TaskDiffUtil(private val oldList: List<TaskData>, private val newList: List<TaskData>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        // === means strict equal to which is used to strictly compare. 2 == "2" is true
        // but 2 === "2" isn't
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
                && oldList[oldItemPosition].title == newList[newItemPosition].title
                && oldList[oldItemPosition].description == newList[newItemPosition].description
                && oldList[oldItemPosition].priority == newList[newItemPosition].priority
    }

}