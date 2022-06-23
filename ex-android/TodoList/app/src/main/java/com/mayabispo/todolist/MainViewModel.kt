package com.mayabispo.todolist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mayabispo.todolist.api.Repository
import com.mayabispo.todolist.model.Categoria
import com.mayabispo.todolist.model.Tarefa
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
// injetar em MainViewModel a instancia de Repository que criamos como singleton
class MainViewModel @Inject constructor(
    private val repository: Repository
    ) : ViewModel() {

    // ver se existe uma tarefa selecionada
    var tarefaSelecionada : Tarefa? = null

    // guarda o retorno da fun listarCategorias como um dado observável e uma lista mutável
    private var _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    // guarda o retorno da fun listarTarefas como um dado observável e uma lista mutável
    private var _myTarefaResponse = MutableLiveData<Response<List<Tarefa>>>()

    // recebe a lista mutável anterior, como uma lista imutável (somente leitura), pois
    // não podemos ter acesso a lista mutável diretamente para mudar seus valores
    val myCategoriaResponse : LiveData<Response<List<Categoria>>> = _myCategoriaResponse

    // lista imutavel de tarefas cadastradas
    val myTarefaResponse : LiveData<Response<List<Tarefa>>> = _myTarefaResponse


    // guardar a data selecionada
    val dataSelecionada = MutableLiveData<LocalDate>()

    fun listarCategorias(){
        // criar uma coroutine
        viewModelScope.launch {
            // guardamos a resposta de categoria num try catch caso o usuario não tenha acesso a internet,
            // então ele vai tentar fazer a requisição e se não conseguir criamos um log de erro de requisição
            // + a msg
            try {
                // a resposta da requisição get de listarCategoria
                val response = repository.listarCategorias()
                // atribuimos essa resposta ao mutableLiveData de _myCategoriaResponse
                _myCategoriaResponse.value = response
            } catch (e:Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun addTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            try{
                repository.addTarefa(tarefa)
                listarTarefas()
            } catch (e:Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun listarTarefas(){
        viewModelScope.launch {
            try{
                // a resposta da requisição get de listarTarefas
                val response = repository.listarTarefas()
                // atribuimos essa resposta ao mutableLiveData de _myTarefaResponse
                _myTarefaResponse.value = response

            } catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun editTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            try {
                repository.editTarefa(tarefa)
                listarTarefas()
            } catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

}