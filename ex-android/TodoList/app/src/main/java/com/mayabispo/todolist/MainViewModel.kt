package com.mayabispo.todolist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mayabispo.todolist.api.Repository
import com.mayabispo.todolist.model.Categoria
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

    // guarda o retorno da fun listarCategorias como um dado observável e uma lista mutável
    private var _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    // recebe a lista mutável anterior, como uma lista imutável (somente leitura), pois
    // não podemos ter acesso a lista mutável diretamente para mudar seus valores
    val myCategoriaResponse : LiveData<Response<List<Categoria>>> = _myCategoriaResponse

    // guardar a data selecionada
    val dataSelecionada = MutableLiveData<LocalDate>()

    fun listarCategorias(){
        // criar uma coroutine
        viewModelScope.launch(Dispatchers.IO) {
            // guardamos a resposta de categoria num try catch caso o usuario não tenha acesso a internet,
            // então ele vai tentar fazer a requisição e se não conseguir criamos um log de erro de requisição
            // + a msg
            try {
                // a resposta da requisição get de listarCategoria
                val response = repository.listarCategorias()
                // atribuimos essa resposta ao mutableLiveData de _myCategoriaResponse
                _myCategoriaResponse.value = response
            } catch (e:Exception){
                Log.d("ErroRequisição", e.message.toString())
            }
        }
    }
}