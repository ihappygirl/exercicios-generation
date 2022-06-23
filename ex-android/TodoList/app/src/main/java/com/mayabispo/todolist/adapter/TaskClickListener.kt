package com.mayabispo.todolist.adapter

import com.mayabispo.todolist.model.Tarefa

interface TaskClickListener {

    fun onTaskClickListener(tarefa: Tarefa)
}