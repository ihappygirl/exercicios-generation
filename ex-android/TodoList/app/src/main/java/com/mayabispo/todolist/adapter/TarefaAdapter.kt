package com.mayabispo.todolist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mayabispo.todolist.databinding.CardLayoutBinding
import com.mayabispo.todolist.model.Tarefa

// para herdar o adapter de RecyclerView, precisamos referenciar um ViewHolder primeiro
class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    // a principio usamos uma lista de tarefas vazia
    private var listaTarefa = emptyList<Tarefa>()

    // precisamos referenciar cada item que temos dentro de card_layout
    // então usaremos o viewBinding
    class TarefaViewHolder(val bind:CardLayoutBinding) : RecyclerView.ViewHolder(bind.root)

    // Também herdamos os metodos sobrescritos onCreateViewHolder, onBindViewHolder e getItemCount
    // onCreateViewHolder - cria o card, onde serão jogadas as informações da tarefa
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    // onBind - relaciona os dados de uma tarefa inserida lá na listaTarefa com cada um dos
    // componentes de card_layout que devem receber essas informações
    // processa os dados dentro das views


    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

        // pegamos os dados da tarefa através do position recebido por onBindViewHolder,
        // que é o index que passaremos para a listaTarefa nos retornar uma unica tarefa,
        // criando um novo array, só que com uma tarefa em especifico
        val tarefa = listaTarefa[position]

        // relacionar os dados do array tarefa com cada um dos itens do card_layout
        holder.bind.txtNome.text = tarefa.nome
        holder.bind.txtDescricao.text = tarefa.descricao
        holder.bind.txtResponsavel.text = tarefa.responsavel
        holder.bind.txtData.text = tarefa.data
        holder.bind.txtDescricao.text = tarefa.descricao
        holder.bind.swtAndamento.isChecked = tarefa.status
        holder.bind.txtCategoria.text = tarefa.categoria

    }

    // getItemCount - diz quantas vezes o recyclerview vai ter que loopar
    // (é a quantidade de cards a serem criados)
    override fun getItemCount(): Int {
        return listaTarefa.size
    }

    // criar um metodo para setar os itens de listaTarefa, que recebe uma lista do tipo Tarefa como
    // parâmetro e atribui ela a listaTarefa
    fun setLista(lista: List<Tarefa>){

        //matriz recebe mais um array
        listaTarefa = lista

        // avisar o adapter que a listaTarefa atualizou
        notifyDataSetChanged()
    }

}