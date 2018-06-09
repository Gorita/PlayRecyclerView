package com.mkcode.playrecyclerview.cases

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mkcode.playrecyclerview.R
import kotlinx.android.synthetic.main.fragment_basic_recycler_view.*

class BasicRecyclerViewFragment : Fragment() {
    companion object {
        fun newInstance(): BasicRecyclerViewFragment = BasicRecyclerViewFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_basic_recycler_view, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = BasicRecyclerViewAdapter(
                1.rangeTo(10).map {
                    DummyItem(
                        "Title $it"
                    )
                }
            )
        }
    }
}