package com.project.tasklist.fragments.list

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.*
import com.google.android.material.snackbar.Snackbar
import com.project.tasklist.R
import com.project.tasklist.data.models.TaskData
import com.project.tasklist.data.viewmodel.TaskViewModel
import com.project.tasklist.fragments.SharedViewModel
import com.project.tasklist.fragments.list.adapter.ListAdapter
import jp.wasabeef.recyclerview.animators.ScaleInAnimator
import kotlinx.android.synthetic.main.fragment_list.view.*


class ListFragment : Fragment(), SearchView.OnQueryTextListener {

    // access to view model
    private val mTaskViewModel: TaskViewModel by viewModels()

    // variable for shared view model
    private val mSharedViewModel: SharedViewModel by viewModels()

    // list adapter for recycler view
    private val adapter: ListAdapter by lazy { ListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        // setting the adapter and layout manager of recycler view
        val recyclerView = view.recyclerView
        setupRecyclerView(recyclerView)

        // we use the view model to get data from database and then observe it and send the data
        // received to the adapter to update the layout
        mTaskViewModel.getAllData.observe(viewLifecycleOwner, Observer { data ->
            mSharedViewModel.checkIfDatabaseEmpty(data)
            adapter.setData(data)
        })
        // using the shared view model to observe whether the data is empty or not
        mSharedViewModel.emptyDatabase.observe(viewLifecycleOwner, Observer {
            showEmptyDatabaseViews(it)
        })

        // onClick listener for the fab
        view.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        // Set Menu
        setHasOptionsMenu(true)

        return view
    }

    // function to setup the recycler view
    private fun setupRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = adapter
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        // setting delete functionality
        swipeToDelete(recyclerView)
        // setting the animation
        recyclerView.itemAnimator = ScaleInAnimator().apply {
            addDuration = 300
        }
    }

    // function which sets the menu in the fragment
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_fragment_menu, menu)

        // setting up the search view
        val search = menu.findItem(R.id.menu_search)
        val searchView = search.actionView as? SearchView
        searchView?.isSubmitButtonEnabled = true
        searchView?.setOnQueryTextListener(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_delete_all -> confirmRemoval()

            R.id.menu_priority_high -> mTaskViewModel.sortByHighPriority.observe(
                this,
                Observer { adapter.setData(it) })

            R.id.menu_priority_low -> mTaskViewModel.sortByLowPriority.observe(
                this,
                Observer { adapter.setData(it) })
        }
        return super.onOptionsItemSelected(item)
    }

    // function to confirm the removal of all items from database
    private fun confirmRemoval() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setPositiveButton("Yes") { _, _ ->
            mTaskViewModel.deleteAll()
            Toast.makeText(
                requireContext(),
                "Successfully Removed Everything!",
                Toast.LENGTH_SHORT
            ).show()
        }
        builder.setNegativeButton("No") { _, _ -> }
        builder.setTitle("Delete Everything?")
        builder.setMessage("Are you sure you want to remove everything?")
        builder.create().show()
    }

    // function which shows empty database views
    private fun showEmptyDatabaseViews(emptyDatabase: Boolean) {
        if (emptyDatabase) {
            view?.no_data_imageView?.visibility = View.VISIBLE
            view?.no_data_textView?.visibility = View.VISIBLE
        } else {
            view?.no_data_imageView?.visibility = View.INVISIBLE
            view?.no_data_textView?.visibility = View.INVISIBLE
        }
    }

    // function for delete with swipe
    private fun swipeToDelete(recyclerView: RecyclerView) {
        val swipeToDeleteCallback = object : SwipeToDelete() {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                // delete item
                val deletedItem = adapter.dataList[viewHolder.adapterPosition]
                mTaskViewModel.deleteData(deletedItem)
                adapter.notifyItemRemoved(viewHolder.adapterPosition)
                // call the restore deleted data
                restoreDeletedData(viewHolder.itemView, deletedItem)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }

    // function to restore deleted data
    private fun restoreDeletedData(view: View, deletedItem: TaskData) {
        val snackBar =
            Snackbar.make(view, "Deleted: '${deletedItem.title}'", Snackbar.LENGTH_SHORT)

        snackBar.setAction("Undo") {
            mTaskViewModel.insertData(deletedItem)
        }
        snackBar.show()
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            searchThroughDatabase(query)
        }
        return true
    }

    override fun onQueryTextChange(query: String?): Boolean {
        if (query != null) {
            searchThroughDatabase(query)
        }
        return true
    }

    private fun searchThroughDatabase(query: String) {
        // query is passed between % signs (SQL syntax)
        val finalQuery = query.trim()
        val searchQuery = "%$finalQuery%"

        // as we receive live data, hence we use observer to observe the live data and then
        // update the adapter
        mTaskViewModel.searchDatabase(searchQuery).observe(this, Observer { list ->
            list?.let {
                // setting the data in the adapter according to the search query
                adapter.setData(it)
            }
        })
    }

}