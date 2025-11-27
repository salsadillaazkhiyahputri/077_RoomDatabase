package com.example.a077_roomdatabase.room

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface SiswaDao {
    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

}