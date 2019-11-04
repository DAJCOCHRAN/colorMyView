package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(Box_One, Box_Two, Box_Three, Box_Four, Box_Five, Constraint_Layout)

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it)}
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.Box_One -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_Two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.Box_Three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_Four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_Five -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
