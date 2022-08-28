package com.example.practical_2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val Tag="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate is called")
    }
    private fun showMessage(msg:String){
        Log.i(Tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart is Called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume is Called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause is Called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop is Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy is Called")
    }
}