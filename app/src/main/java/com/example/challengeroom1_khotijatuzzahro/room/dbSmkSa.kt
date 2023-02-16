package com.example.challengeroom1_khotijatuzzahro.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.locks.Lock


@Database(
    entities = [tbSiswa::class],
    version = 1
)
abstract class dbSmkSa : RoomDatabase(){

    abstract fun tbSiswaDao() : tbSiswaDAO

    companion object {

        @Volatile private var instance : dbSmkSa? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            dbSmkSa::class.java,
            "note12345.db"
        ).build()

    }
}