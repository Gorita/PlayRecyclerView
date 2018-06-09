package com.mkcode.playrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mkcode.playrecyclerview.cases.RecyclerViewCase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        basicButton.setOnClickListener {
            RecyclerViewContainerActivity.start(this, RecyclerViewCase.BASIC)
        }
        animationButton.setOnClickListener {
            RecyclerViewContainerActivity.start(this, RecyclerViewCase.ANIMATION)
        }
    }
}
