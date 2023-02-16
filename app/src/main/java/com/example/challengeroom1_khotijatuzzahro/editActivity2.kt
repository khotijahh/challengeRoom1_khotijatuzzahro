package com.example.challengeroom1_khotijatuzzahro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class editActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit2)
    }
    fun CreatetbSiswa1 (view: View){
        val pindah = Intent(this,MainActivity::class.java)
        startActivity(pindah)

    }
}