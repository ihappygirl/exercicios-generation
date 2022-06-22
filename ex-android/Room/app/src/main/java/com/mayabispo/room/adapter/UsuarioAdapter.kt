package com.mayabispo.room.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mayabispo.room.data.Usuario
import com.mayabispo.room.databinding.UsuariosCardLayoutBinding

// 31 - criar a classe do adapter
// 33 - herdar a viewHolder no UsuarioAdapter
class UsuarioAdapter : RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

    // 35 - variavel que receberá a lista de usuarios
    private var listaUsuarios = emptyList<Usuario>()

    // 32 - criar a viewHolder
    class UsuarioViewHolder(val binding: UsuariosCardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    // 34 - implementar os metodos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        // 35 - inflar e retornar o layout do card
        return UsuarioViewHolder(UsuariosCardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        // 36 - pegar a lista de usuários
        val usuarios = listaUsuarios[position]

        // 37 - setar na UI os atributos de um Usuário
        holder.binding.textId.text = usuarios.id.toString()
        holder.binding.textNome.text = usuarios.nome
        holder.binding.textSobrenome.text = usuarios.sobrenome
        holder.binding.textIdade.text = usuarios.idade.toString()
    }

    override fun getItemCount(): Int {
        // 38 - retornar o tamanho da lista
        return listaUsuarios.size
    }

    fun setLista(lista : List<Usuario>){
        // 39 - pegar a lista atualizada e setar em listaUsuarios
        listaUsuarios = lista
        notifyDataSetChanged()
    }
}