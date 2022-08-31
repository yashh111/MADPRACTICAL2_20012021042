package com.example.madpractical2_20012021042

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate function call: ")
        Toast.makeText(this, "onCreate function call", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onCreate function call",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onstart function call: ")
        Toast.makeText(this, "onstart function call", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onstart function call",Snackbar.LENGTH_LONG).show()
    }

   override fun onResume() {
      super.onResume()
        Log.i(TAG, "onResume function call: ")
       Toast.makeText(this, "onResume function call", Toast.LENGTH_SHORT).show()
       Snackbar.make(mycl,"onResume function call",Snackbar.LENGTH_LONG).show()
   }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause function call: ")
        Toast.makeText(this, "onPause function call", Toast.LENGTH_SHORT).show()
         Snackbar.make(mycl,"onPause function call",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop function call: ")
        Toast.makeText(this, "onStop function call", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop function call",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy function call: ")
        Toast.makeText(this, "onDestroy function call", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy function call",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart function call: ")
        Toast.makeText(this, "onRestart function call", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onRestart function call",Snackbar.LENGTH_LONG).show()
    }
}