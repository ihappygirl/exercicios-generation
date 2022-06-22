package com.mayabispo.room

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mayabispo.room.data.Usuario
import com.mayabispo.room.data.UsuarioDatabase
import com.mayabispo.room.data.UsuarioRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// 17 - criar a view model
class MainViewModel(application: Application) : AndroidViewModel(application) {

    // 18 - criar variavel que vai guardar o retorno de selectUsuarios()
    val selectUsuarios : LiveData<List<Usuario>>
    // 19 - criar variavel do tipo UsuarioRepository
    val repository : UsuarioRepository

    // 20 - inicializar variavies
    init{
        val usuarioDao = UsuarioDatabase.getDatabase(application).usuarioDao()
        repository = UsuarioRepository(usuarioDao)
        selectUsuarios = repository.selectUsuarios
    }

    // 21 - função addUsuarios()
    fun addUsuario(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUsuario(usuario)
        }
    }

}