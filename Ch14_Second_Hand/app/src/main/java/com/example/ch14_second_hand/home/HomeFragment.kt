package com.example.ch14_second_hand.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ch14_second_hand.R
import com.example.ch14_second_hand.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null
    private lateinit var articleAdapter: ArticleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentHomeBinding = FragmentHomeBinding.bind(view)
        binding = fragmentHomeBinding

        articleAdapter = ArticleAdapter()
        articleAdapter.submitList(mutableListOf<ArticleModel>().apply {
            add(ArticleModel("0", "aaaa", 1000000, "5000원", ""))
            add(ArticleModel("0", "bbbb", 2000000, "10000원", ""))
        })

        fragmentHomeBinding.articleRecyclerView.layoutManager = LinearLayoutManager(context)
        fragmentHomeBinding.articleRecyclerView.adapter = articleAdapter
    }
}