package com.ahmed.sharedpref

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pref : SharedPreferences = this.getSharedPreferences("idf" , MODE_PRIVATE)
        val editor : SharedPreferences.Editor = pref.edit()

        editor.putString("token" , "Ahmed").apply()
        editor.putInt("age" , 25 ).apply()
        val token : String ?= pref.getString("token","")
        val age : Int =pref.getInt("age" , 0)
        Log.i("MainActivity" , token.toString())
        Log.i("MainActivity" , "$age")

    }
}