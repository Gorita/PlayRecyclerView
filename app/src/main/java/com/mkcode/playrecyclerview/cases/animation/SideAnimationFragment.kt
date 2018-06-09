package com.mkcode.playrecyclerview.cases.animation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.mkcode.playrecyclerview.R
import com.mkcode.playrecyclerview.cases.BasicRecyclerViewAdapter
import com.mkcode.playrecyclerview.cases.DummyItem
import kotlinx.android.synthetic.main.fragment_basic_recycler_view.*

/**
 * https://proandroiddev.com/enter-animation-using-recyclerview-and-layoutanimation-part-1-list-75a874a5d213
* */
class SideAnimationFragment : Fragment() {
    companion object {
        fun newInstance(): SideAnimationFragment = SideAnimationFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_basic_recycler_view, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recyclerView) {
            layoutManager = LinearLayoutManager(context)
            layoutAnimation = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_slide_from_right)
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