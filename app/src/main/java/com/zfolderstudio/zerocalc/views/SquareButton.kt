package com.zfolderstudio.zerocalc.views

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

class SquareButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.materialButtonStyle
) : MaterialButton(context, attrs, defStyleAttr) {

    companion object {
        var isSquishMode: Boolean = false
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val isLandscape = resources.configuration.orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE
        if (isSquishMode || isLandscape) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        } else {
            // Use the width measure spec for both width and height to force a square aspect ratio.
            super.onMeasure(widthMeasureSpec, widthMeasureSpec)
        }
    }
}
