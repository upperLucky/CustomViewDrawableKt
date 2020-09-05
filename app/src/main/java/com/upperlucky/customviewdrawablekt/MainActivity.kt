package com.upperlucky.customviewdrawablekt

import android.graphics.Bitmap
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* // Drawable 和 Bitmap 的"相互转换"
        val bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ALPHA_8)
        bitmap.toDrawable(resources)

        val drawable = ColorDrawable()
        drawable.toBitmap()*/
    }
}