package com.mayabispo.todolist.api

import com.mayabispo.todolist.model.Categoria
import com.mayabispo.todolist.model.Tarefa
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    // qual o endpoint?
    @GET("categoria")
    // suspend - uma função que roda no background e pode ser suspensa a qualquer momento
    // Response - é o código da resposta a requisição (se deu bom, se deu ruim, etc), guardando em si
    // também a lista de categorias
    suspend fun listarCategorias() : Response<List<Categoria>>

    // qual o endpoint?
    @POST("tarefa")
    suspend fun addTarefa(
        // passar o corpo da requisição (no caso, os itens de Tarefa)
        @Body tarefa: Tarefa
    ) : Response<Tarefa>

    // qual o endpoint?
    @GET("tarefa")
    suspend fun listarTarefas() : Response<List<Tarefa>>

    // qual o endpoint?
    @PUT("tarefa")
    suspend fun editTarefa(
        // passar o corpo da requisição (no caso, os itens de Tarefa)
        @Body tarefa: Tarefa
    ) : Response<Tarefa>

    @DELETE("tarefa/{id}")
    suspend fun deletarTarefa(
        @Path("id") id: Long
    ) : Response<Tarefa>











}