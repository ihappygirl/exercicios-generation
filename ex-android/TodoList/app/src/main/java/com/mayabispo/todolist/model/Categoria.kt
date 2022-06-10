package com.mayabispo.todolist.model

data class Categoria(
    var id: Long,
    var descricao: String?, // ? pois quando atrelamos uma categoria a uma tarefa, só passamos o id
    // o endpoint de Categoria contém um array de tarefas atreladas a categoria especifica
    var tarefas: List<Tarefa>? // ? pois quando criamos uma categoria, a lista de tarefas vem vazia
)