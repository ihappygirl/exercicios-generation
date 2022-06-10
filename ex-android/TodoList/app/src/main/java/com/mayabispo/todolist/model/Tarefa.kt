package com.mayabispo.todolist.model

// data class Tarefa é a classe que vai gerar objetos do tipo Tarefa, que contenham
// obrigatoriamente nome, descrição, responsavel, data, status e categoria

data class Tarefa(
    var id: Long,
    var nome:String,
    var descricao:String,
    var responsavel:String,
    var data: String,
    var status:Boolean,
    var categoria: Categoria
)