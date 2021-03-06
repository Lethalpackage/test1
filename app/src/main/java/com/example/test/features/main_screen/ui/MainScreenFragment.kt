package com.example.test.features.main_screen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.features.main_screen.ui.adapter.GiphyAdapter
import com.google.android.material.snackbar.Snackbar
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainScreenFragment : Fragment() {

    private val viewModel by viewModel<MainScreenViewModel>()
    private val adapter by lazy { GiphyAdapter(listOf()) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerView = view.findViewById<RecyclerView>(R.id.gif)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.viewState.observe(viewLifecycleOwner, Observer(::render))
    }

    private fun render(viewState: ViewState) {
        adapter.updateArticle(viewState.giphyList)
        viewState.errorMessage?.let { showSnackbar(it) }


    }

    private fun showSnackbar(message: String) {
        Snackbar.make(requireActivity().findViewById(R.id.container), message, Snackbar.LENGTH_LONG)
            .show()
    }
}


