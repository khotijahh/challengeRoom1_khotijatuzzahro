package com.example.challengeroom1_khotijatuzzahro.room

import androidx.room.*

@Dao
interface tbSiswaDAO {
    @Insert
     fun addtbSiswa (tbSiswa: tbSiswa)

    @Update
     fun updateSiswa(tbSiswa: tbSiswa)

    @Delete
     fun deleteSiswa(tbSiswa: tbSiswa)

    @Query("select * from tbSiswa")
     fun GettbSiswa():List<tbSiswa>

}