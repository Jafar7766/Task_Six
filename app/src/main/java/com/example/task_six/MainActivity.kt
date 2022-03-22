package com.example.task_six

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        val textView = findViewById<TextView>(R.id.textView)
        val text = "I would like to do something similar to the https://twitter.com app"
        val spannable: Spannable = SpannableString(text)
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            44,
            64,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView.text = spannable
    }
}
