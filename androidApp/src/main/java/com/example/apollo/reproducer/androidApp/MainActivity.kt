package com.example.apollo.reproducer.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.apollo.reproducer.shared.Greeting
import android.widget.TextView
import com.example.apollo.reproducer.shared.Platform
import kotlinx.android.parcel.Parcelize

fun greet(): String {
    return Platform.platformString()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }


    @Parcelize
    data class A(
        val a: String,
        val b: B
    ) : Parcelable

    @Parcelize
    data class B(
        val b: String
    ) : Parcelable
}
