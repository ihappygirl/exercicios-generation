package com.mayabispo.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mayabispo.todolist.adapter.TarefaAdapter
import com.mayabispo.todolist.databinding.FragmentPrimeiroBinding
import com.mayabispo.todolist.model.Tarefa


class PrimeiroFragment : Fragment() {

    // instanciar o viewBinding
    private lateinit var bind: FragmentPrimeiroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflar o viewBinding
        // layoutInflater - passar onde é que que ele vai inflar o layout (no caso o container onde
        // colocaremos os fragments)
        bind = FragmentPrimeiroBinding.inflate(layoutInflater, container, false)

        // Armazenamos o inflate do layout em uma variável, pois precisamos usá-lo para
        // criar as interações dos botões, e ai depois retornamos o inflate junto com elas.
        // E também pois o metodo findViewById só funciona dentro de uma view.
        // old: FAREMOS PELO BIND
        // val view = inflater.inflate(R.layout.fragment_primeiro, container, false)

        // Criar a variável que vai guardar a lista de tarefas, instanciando a data class Tarefa
        var listaTarefas = listOf(
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia"),
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia"),
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia")
        )

        // Configurar o RecyclerView
        // criar uma variável para guardar um objeto do tipo TarefaAdapter
        val adapter = TarefaAdapter()

        // definir quem vai ser o layoutManager de recyclerTarefa, isto é, definir qual vai ser o
        // tipo de container que conterá todos os cards de tarefas
        // como queremos que um card fique embaixo do outro, definimos como LinearLayout.
        bind.recyclerTarefa.layoutManager = LinearLayoutManager(context)

        bind.recyclerTarefa.adapter = adapter

        // dizer que todos os cards (itens de recyclerView) tem um tamanho fixo
        bind.recyclerTarefa.setHasFixedSize(true)

        // atribuir a matriz lista de tarefas (listaTarefa) ao adapter
        adapter.setLista(listaTarefas)

        // Referenciar o floatingButton (aquele que adiciona uma nova tarefa) - old: FAREMOS PELO BIND
        // var floatingAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)

        bind.floatingAdd.setOnClickListener{
            // buscar onde tá o controller de navegação (no caso, o nav_graph que tá cuidando disso)
            // e setar para onde eu quero navegar (SegundoFragment)
            findNavController().navigate(R.id.action_primeiroFragment_to_segundoFragment)

        }

        // retornar o viewBinding, pois ele que trata da view agora
        return bind.root
    }


}