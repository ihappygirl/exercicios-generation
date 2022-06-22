package com.mayabispo.room.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

// 4 - declarar interface como DAO, para rodarmos as queries
@Dao
interface UsuarioDao {

    // 5 - insert usuario no banco
    // caso haja usuario duplicado, usar a estrategia de conflitos "ignore"
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUsuario(usuario: Usuario)

    // 6 - selecionar todos os usuarios da tabela_usuarios, ordenando por id de forma crescente
    // e retornando-os como uma lista imutavel observavel
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun selectUsuarios() : LiveData<List<Usuario>>
}