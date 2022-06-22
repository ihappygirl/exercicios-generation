package com.mayabispo.room.data

// 14 - criar o repositorio
class UsuarioRepository (private val usuarioDao: UsuarioDao) {

    // 15 - criar variavel que recebe o return de live data imutavel da função selectUsuarios()
    val selectUsuarios = usuarioDao.selectUsuarios()

    // 16 - função que insere um usuario no banco
    fun addUsuario(usuario: Usuario){
        usuarioDao.addUsuario(usuario)
    }


}