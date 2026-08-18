package com.zfolderstudio.zerocalc.views

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageButton

class SquareImageButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = androidx.appcompat.R.attr.imageButtonStyle
) : AppCompatImageButton(context, attrs, defStyleAttr) {

    companion object {
        var isSquishMode: Boolean = false
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val isLandscape = resources.configuration.orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE
        if (isSquishMode || isLandscape) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        } else {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec)
        }
    }
}
