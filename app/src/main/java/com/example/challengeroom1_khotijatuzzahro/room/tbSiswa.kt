package com.example.challengeroom1_khotijatuzzahro.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
 data class tbSiswa (
    @PrimaryKey(autoGenerate = true)
    val nis :Int,
    val nama: String,
    val kelas: String,
    val alamat : String
    )