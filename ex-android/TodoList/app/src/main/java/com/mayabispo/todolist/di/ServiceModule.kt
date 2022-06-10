package com.mayabispo.todolist.di

import com.mayabispo.todolist.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // gerar um singleton
object ServiceModule {

    // singleton que contém a função que instancia o Repository
    @Singleton
    @Provides
    fun retornaRepository() : Repository{
        return Repository()
    }
}