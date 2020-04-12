package com.digitaleg.loglibrary.Photos

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.digitaleg.loglibrary.Logs.LogDebug

object Photo {
    fun load(url:String , imageView: ImageView){
        Glide.with(imageView.context).load(url).listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: com.bumptech.glide.request.target.Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                LogDebug.d("Error : ${e?.message}")
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: com.bumptech.glide.request.target.Target<Drawable>?,
                dataSource: com.bumptech.glide.load.DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                LogDebug.d("ResourceReady")
                return false
            }
        }).into(imageView)
    }
}