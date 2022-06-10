package com.mayabispo.todolist.api

import com.mayabispo.todolist.model.Categoria
import retrofit2.Response

class Repository {

    // retornar a lista de categorias através de ApiService
    suspend fun listarCategorias() : Response<List<Categoria>>{
        return RetrofitInstance.api.listarCategorias()
    }



}