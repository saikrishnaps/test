package com.datstorm.imageviews.utils

import android.app.Activity
import android.app.Application
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.Gravity
import android.view.View
import android.view.Window
import android.widget.TextView
import android.widget.Toast
import com.datstorm.imageviews.R
import com.wang.avi.AVLoadingIndicatorView
import com.wang.avi.indicators.BallSpinFadeLoaderIndicator


class Utils(private val context: Activity) {
    private var toast: Toast? = null
    private var progressDialog: Dialog? = null

    init {

    }

    fun showToast(message: String?) {
        val layout = context.layoutInflater.inflate (
            R.layout.custom_toast,
            context.findViewById(R.id.linearLayout)
        )
        val textView = layout.findViewById<TextView>(R.id.custom_toast_message)
        textView.text = message
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.setGravity(Gravity.CENTER, 0, 0)
        try {
            toast?.view = layout
            if (!toast?.view?.isShown!!) {
                toast?.show()
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            toast?.show()
        }


    }

    fun showLongToast(color: Int, view: View?, message: String?) {
        toast = Toast.makeText(context, message, Toast.LENGTH_LONG)

        try {
            if (!toast?.view?.isShown!!) {
                toast?.show()
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            toast?.show()
        }

    }

    fun showProgress() {
        progressDialog = Dialog(context)
        progressDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        progressDialog?.setContentView(R.layout.dialog_progress)
        progressDialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        progressDialog?.setCancelable(false)
        progressDialog?.show()
        val progressLoading: AVLoadingIndicatorView? =
            progressDialog?.findViewById(R.id.progressLoading)
        val ballSpinFadeLoaderIndicator = BallSpinFadeLoaderIndicator()
        progressLoading?.indicator = ballSpinFadeLoaderIndicator
        progressLoading?.smoothToShow()
    }

    fun dismissProgress() {
        if (progressDialog != null) {
            if (progressDialog?.isShowing!!) {
                progressDialog?.dismiss()
            }
        }
    }

    fun generateOTP(): String? {
        val randomPin: Int = ((Math.random() * 9000) + 1000).toInt();
        val otp = randomPin.toString()
        return otp
    }


    companion object {
        fun isNetworkConnected(application: Application): Boolean {
            val cm =
                application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (cm != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    val ni = cm.activeNetworkInfo
                    if (ni != null) {
                        return ni.isConnected && (ni.type == ConnectivityManager.TYPE_WIFI || ni.type == ConnectivityManager.TYPE_MOBILE)
                    }
                } else {
                    val n = cm.activeNetwork
                    if (n != null) {
                        val nc = cm.getNetworkCapabilities(n)
                        return nc!!.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || nc.hasTransport(
                            NetworkCapabilities.TRANSPORT_WIFI
                        ) || nc.hasTransport(
                            NetworkCapabilities.TRANSPORT_VPN
                        )
                    }
                }
            }
            return false
        }
    }

}
