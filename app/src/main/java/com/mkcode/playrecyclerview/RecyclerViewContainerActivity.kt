package com.mkcode.playrecyclerview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mkcode.playrecyclerview.cases.BasicRecyclerViewFragment
import com.mkcode.playrecyclerview.cases.RecyclerViewCase
import com.mkcode.playrecyclerview.cases.animation.SideAnimationFragment

class RecyclerViewContainerActivity : AppCompatActivity() {

    companion object {
        const val CASE_KEY = "case_key"
        fun start(context: Context, case: RecyclerViewCase) {
            context.startActivity(
                Intent(context, RecyclerViewContainerActivity::class.java).apply {
                    putExtra(CASE_KEY, case)
                }
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_continer)

        val viewCase = intent.getSerializableExtra(CASE_KEY)

        when (viewCase) {
            RecyclerViewCase.BASIC -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, BasicRecyclerViewFragment.newInstance())
                    .commit()
            }
            RecyclerViewCase.ANIMATION -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SideAnimationFragment.newInstance())
                    .commit()
            }
        }
    }
}