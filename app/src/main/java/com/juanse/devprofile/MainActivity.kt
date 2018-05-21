package com.juanse.devprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.* // Allows to access UI without declaring UI element variables

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        // Use BitmapFactory to update UI appearance (corners)
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)

        rounded.cornerRadius = 15f // Must be a float
//        rounded.isCircular = true // Set Image to be round

        logo.setImageDrawable(rounded)

//        val dataTileBitmap = BitmapFactory.decodeResource(resources, R.drawable.dataimage)
//        val dataTileRounded = RoundedBitmapDrawableFactory.create(resources, dataTileBitmap)
//
//        dataTileRounded.cornerRadius = (data_imageView.width / 2).toFloat()
//        data_imageView.setImageDrawable(dataTileRounded)


    }
}
