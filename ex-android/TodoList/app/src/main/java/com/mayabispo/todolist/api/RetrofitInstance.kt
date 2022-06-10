package com.mayabispo.todolist.api

import com.mayabispo.todolist.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    // by lazy: dá uma prioridade maior as coisas que estão dentro dele
    // quando instanciamos o RetrofitInstance
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL) // url base da api
            .addConverterFactory(GsonConverterFactory.create()) // converter para algo legivel pelo Kotlin
            .build() // vai buildar esse app SIM
    }

    // criar uma instancia do Retrofit que acesse os metodos da interface ApiService, a convertendo para
    // algo legivel pelo Kotlin também
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }


}