package com.example.shekhar.testingcoverage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnfare.setOnClickListener({
            tvresult.text = calfare(etkm.text.toString().toFloat(), etmin.text.toString().toInt()).toString()
        })

    }

     companion object {
        @JvmStatic fun calfare(km : Float, min: Int ) :Float =
                50f + (if(km>5)(km-5)*12 else 0f) + (if(min >15)(min-15) else 0)
    }
}
