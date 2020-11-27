package com.appycoder.icecreamflavoursapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appycoder.icecreamflavours.IcecreamFlavour

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flavour = IcecreamFlavour.CHOCOLATE
    }
}