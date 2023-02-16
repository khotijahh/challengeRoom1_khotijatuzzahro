package com.example.challengeroom1_khotijatuzzahro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun CreatetbSiswa (view: View){
        val pindah = Intent(this,editActivity2::class.java)
        startActivity(pindah)
    }
}
