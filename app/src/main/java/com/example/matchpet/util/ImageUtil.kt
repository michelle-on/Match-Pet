package com.example.matchpet.util

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide

object ImageUtils {
    fun setImageGlide(view: ImageView?, @DrawableRes drawable: Int) {
        Glide.with(view!!)
            .load(drawable)
            .centerCrop()
            .into(view)
    }
}