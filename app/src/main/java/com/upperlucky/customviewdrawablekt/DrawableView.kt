package com.upperlucky.customviewdrawablekt

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

/**
 * created by yunKun.wen on 2020/9/4
 * desc:
 */
class DrawableView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {


    private val drawable = MeshDrawable()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawable.setBounds(50.dp.toInt(), 50.dp.toInt(), width, height)
        drawable.draw(canvas)
    }
}