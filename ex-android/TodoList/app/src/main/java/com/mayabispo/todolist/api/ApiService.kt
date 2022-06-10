package com.mayabispo.todolist.api

import com.mayabispo.todolist.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    // qual o endpoint?
    @GET("categoria")
    // suspend - uma função que roda no background e pode ser suspensa a qualquer momento
    // Response - é o código da resposta a  (se deu bom, se deu ruim, etc), guardando em si
    // também a lista de categorias
    suspend fun listarCategorias() : Response<List<Categoria>>









}