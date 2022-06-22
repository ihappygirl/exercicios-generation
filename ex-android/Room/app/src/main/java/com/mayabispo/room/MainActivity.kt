package com.mayabispo.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*
    * Room - biblioteca para criação e gerenciamento de banco de dados local.
    * Possui:
    * - Entities (entidades, ou tabelas)
    * - DAO (Data Access Object), que usamos para fazer as consultas (queries).
    *
    * Criamos o banco de dados local (Sqlite)
    * Criamos o Room (com a Entity e o DAO)
    * Processamos os dados trazidos pelo DAO na ViewModel, que os mostra na UI (Activity ou Fragment).
    *
    *
    *
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}