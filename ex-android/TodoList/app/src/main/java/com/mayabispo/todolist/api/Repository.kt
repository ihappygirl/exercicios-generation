package com.mayabispo.todolist.api

import com.mayabispo.todolist.model.Categoria
import com.mayabispo.todolist.model.Tarefa
import retrofit2.Response

class Repository {

    // retornar a lista de categorias através de ApiService
    suspend fun listarCategorias() : Response<List<Categoria>>{
        return RetrofitInstance.api.listarCategorias()
    }

    // retornar a lista de tarefas através de ApiService
    suspend fun addTarefa(tarefa:Tarefa) : Response<Tarefa>{
        return RetrofitInstance.api.addTarefa(tarefa)
    }

    // retornar a lista de tarefas cadastradas na API
    suspend fun listarTarefas() : Response<List<Tarefa>>{
        return RetrofitInstance.api.listarTarefas()
    }




}