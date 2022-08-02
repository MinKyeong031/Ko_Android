package com.example.ch07_recorder

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import kotlin.math.min

class CountUpView(context: Context, attrs: AttributeSet? = null) : AppCompatTextView(context, attrs) {

    private  var startTimestamp: Long = 0L

    private val countUpAction: Runnable = object :Runnable {
        override fun run() {
            val currentTimeStamp = SystemClock.elapsedRealtime()

            val currentTimeSeconds = ((currentTimeStamp - startTimestamp) / 1000L).toInt()
            updateCountTime(currentTimeSeconds)

            handler?.postDelayed(this, 1000L)
        }
    }

    fun startCountUp() {
        startTimestamp = SystemClock.elapsedRealtime()
        handler?.post(countUpAction)
    }

    fun stopCountUp() {
        handler?.removeCallbacks(countUpAction)
    }

    fun clearCountTime() {
        updateCountTime(0)
    }

    private fun updateCountTime(countTimeSeconds: Int) {
        val minutes = countTimeSeconds / 60
        val seconds = countTimeSeconds % 60

        text = "%02d:%02d".format(minutes, seconds)
    }
}