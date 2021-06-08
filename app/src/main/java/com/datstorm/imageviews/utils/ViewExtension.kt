package com.datstorm.imageviews.utils

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import kotlin.math.roundToInt

fun View.setColor(
    color: String?
) {
    val splitStr = color?.substring(
        color.indexOf('(') + 1,
        color.indexOf(')')
    )
    val splitString = splitStr?.split(",".toRegex())?.toTypedArray()
    val colorValues = IntArray(splitString!!.size)
    for (i in splitString.indices) {
        colorValues[i] = splitString[i].trim().toInt()
    }
    val color = Color.rgb(colorValues[0], colorValues[1], colorValues[2])
    this.setBackgroundColor(color)
}
fun Activity.makeStatusBarTransparent() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            }
            statusBarColor = Color.TRANSPARENT
        }
    }
}

fun View.setMarginTop(marginTop: Int) {
    val menuLayoutParams = this.layoutParams as ViewGroup.MarginLayoutParams
    menuLayoutParams.setMargins(0, marginTop, 0, 0)
    this.layoutParams = menuLayoutParams
}

fun View.setGradient(gradientStartColor: String?, gradientEndColor: String?, cornerRadius: Float?) {
    try {
        val splitStr = gradientStartColor?.substring(
            gradientStartColor?.indexOf('(') + 1,
            gradientStartColor?.indexOf(')')
        )
        val splitString = splitStr?.split(",".toRegex())?.toTypedArray()
        val colorValues = IntArray(splitString!!.size)
        for (i in splitString.indices) {
            colorValues[i] = splitString[i].trim().toInt()
        }
        val startColor = Color.rgb(colorValues[0], colorValues[1], colorValues[2])


        val splitStr1 = gradientEndColor?.substring(
            gradientEndColor.indexOf('(') + 1,
            gradientEndColor.indexOf(')')
        )
        val splitString1 = splitStr1?.split(",".toRegex())?.toTypedArray()
        val colorValues1 = IntArray(splitString1!!.size)
        for (i in splitString1.indices) {
            colorValues1[i] = splitString1[i].trim().toInt()
        }
        val endColor = Color.rgb(colorValues1[0], colorValues1[1], colorValues1[2])
        val colors = intArrayOf(
            startColor,
            endColor
        )
        val gradientDrawable = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM, colors
        )
        gradientDrawable.cornerRadius = cornerRadius!!
        this.background = gradientDrawable
    } catch (ex: Exception) {
    }
}
fun View.setGradient(
    gradientStartColor: String?,
    gradientEndColor: String?,
    cornerRadius: Float?,
    angle: String?
) {
    try {
        val splitStr = gradientStartColor?.substring(
            gradientStartColor.indexOf('(') + 1,
            gradientStartColor.indexOf(')')
        )
        val splitString = splitStr?.split(",".toRegex())?.toTypedArray()
        val colorValues = IntArray(splitString!!.size)
        for (i in splitString.indices) {
            colorValues[i] = splitString[i].trim().toInt()
        }
        val startColor = Color.rgb(colorValues[0], colorValues[1], colorValues[2])

        val splitStr1 = gradientEndColor?.substring(
            gradientEndColor.indexOf('(') + 1,
            gradientEndColor.indexOf(')')
        )
        val splitString1 = splitStr1?.split(",".toRegex())?.toTypedArray()
        val colorValues1 = IntArray(splitString1!!.size)
        for (i in splitString1.indices) {
            colorValues1[i] = splitString1[i].trim().toInt()
        }
        val endColor = Color.rgb(colorValues1[0], colorValues1[1], colorValues1[2])
        val colors = intArrayOf(
            startColor,
            endColor
        )
        val roundedAngle = 45 * ((angle?.toDouble()!! / 45).roundToInt())
        var orientation: GradientDrawable.Orientation? = null
        when (roundedAngle) {
            0 -> orientation = GradientDrawable.Orientation.LEFT_RIGHT
            45 -> orientation = GradientDrawable.Orientation.BL_TR
            90 -> orientation = GradientDrawable.Orientation.BOTTOM_TOP
            135 -> orientation = GradientDrawable.Orientation.BR_TL
            180 -> orientation = GradientDrawable.Orientation.RIGHT_LEFT
            225 -> orientation = GradientDrawable.Orientation.TR_BL
            270 -> orientation = GradientDrawable.Orientation.TOP_BOTTOM
            315 -> orientation = GradientDrawable.Orientation.TL_BR
        }
        val gradientDrawable = GradientDrawable(
            orientation, colors
        )
        gradientDrawable.cornerRadius = cornerRadius!!
        this.background = gradientDrawable
    } catch (ex: Exception) {
    }
}
fun Activity.setStatusBarTranslucent(makeTranslucent: Boolean) {
    if (makeTranslucent) {
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//            window.setStatusBarColor(Color.TRANSPARENT)
//        }
    } else {
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    }

}
fun getColor(
    color: String?
): Int {
    val splitStr = color?.substring(
        color.indexOf('(') + 1,
        color.indexOf(')')
    )
    val splitString = splitStr?.split(",".toRegex())?.toTypedArray()
    val colorValues = IntArray(splitString!!.size)
    for (i in splitString.indices) {
        colorValues[i] = splitString[i].trim().toInt()
    }
    return Color.rgb(colorValues[0], colorValues[1], colorValues[2])
}