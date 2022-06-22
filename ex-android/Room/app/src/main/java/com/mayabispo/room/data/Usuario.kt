package com.mayabispo.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// 1 - criar entidade Usuario
@Entity(tableName = "user_table")
data class Usuario(
    // 3 - definir id como chave primária que auto incrementa
    @PrimaryKey(autoGenerate = true)
    // 2 - definir atributos de usuario
    val id: Long,
    var nome: String,
    var sobrenome: String,
    var idade: Int
){

}