package com.project.tasklist.fragments.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.project.tasklist.R
import com.project.tasklist.data.models.Priority
import com.project.tasklist.data.models.TaskData
import com.project.tasklist.fragments.list.ListFragmentDirections
import kotlinx.android.synthetic.main.row_layout.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    var dataList = emptyList<TaskData>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.title_txt.text = dataList[position].title
        holder.itemView.description_txt.text = dataList[position].description

        // click listener for the tasks
        holder.itemView.row_background.setOnClickListener {
            // passing the data to the update fragment using safe args of navigation graph
            val action =
                ListFragmentDirections.actionListFragmentToUpdateFragment(dataList[position])
            // starting the transition of fragments
            holder.itemView.findNavController().navigate(action)
        }

        val priority = dataList[position].priority
        when (priority) {
            Priority.HIGH -> holder.itemView.priority_indicator.setCardBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context,
                    R.color.red
                )
            )

            Priority.MEDIUM -> holder.itemView.priority_indicator.setCardBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context,
                    R.color.yellow
                )
            )

            Priority.LOW -> holder.itemView.priority_indicator.setCardBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context,
                    R.color.green
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    // this function will be accessed from UI when user adds the data
    fun setData(taskData: List<TaskData>) {
        // using the diff util to calculate the difference and storing it in a variable
        val taskDiffUtil = TaskDiffUtil(dataList, taskData)
        val taskDiffResult = DiffUtil.calculateDiff(taskDiffUtil)
        this.dataList = taskData
        // updating the adapter using the diff result
        taskDiffResult.dispatchUpdatesTo(this)
    }
}