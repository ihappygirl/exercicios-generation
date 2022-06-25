package com.mayabispo.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mayabispo.todolist.adapter.TarefaAdapter
import com.mayabispo.todolist.adapter.TaskClickListener
import com.mayabispo.todolist.databinding.FragmentPrimeiroBinding
import com.mayabispo.todolist.model.Tarefa

class PrimeiroFragment : Fragment(), TaskClickListener {

    // instanciar o viewBinding
    private lateinit var bind: FragmentPrimeiroBinding

    // criar uma instancia de mainViewModel que sobreviva ao ciclo de todas as activities
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflar o viewBinding
        // layoutInflater - passar onde é que que ele vai inflar o layout (no caso o container onde
        // colocaremos os fragments)
        bind = FragmentPrimeiroBinding.inflate(layoutInflater, container, false)

        // chamar a listarTarefas()
        mainViewModel.listarTarefas()

        // Armazenamos o inflate do layout em uma variável, pois precisamos usá-lo para
        // criar as interações dos botões, e ai depois retornamos o inflate junto com elas.
        // E também pois o metodo findViewById só funciona dentro de uma view.
        // old: FAREMOS PELO BIND
        // val view = inflater.inflate(R.layout.fragment_primeiro, container, false)

        // Criar a variável que vai guardar a lista de tarefas, instanciando a data class Tarefa
        // old: VAI SER UMA LISTA VINDA DA API
        /*var listaTarefas = listOf(
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia"),
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia"),
            Tarefa("Limpar a estante", "Limpar a estante e reorganizar os trecos",
                "Mayara", "2022-06-09", false, "Dia a dia")
        )*/

        // Configurar o RecyclerView
        // criar uma variável para guardar um objeto do tipo TarefaAdapter
        val adapter = TarefaAdapter(this, mainViewModel, requireContext())

        // definir quem vai ser o layoutManager de recyclerTarefa, isto é, definir qual vai ser o
        // tipo de container que conterá todos os cards de tarefas
        // como queremos que um card fique embaixo do outro, definimos como LinearLayout.
        bind.recyclerTarefa.layoutManager = LinearLayoutManager(context)

        bind.recyclerTarefa.adapter = adapter

        // dizer que todos os cards (itens de recyclerView) tem um tamanho fixo
        bind.recyclerTarefa.setHasFixedSize(true)

        // atribuir a matriz lista de tarefas (listaTarefa) ao adapter
        // adapter.setLista(listaTarefas)

        // Referenciar o floatingButton (aquele que adiciona uma nova tarefa) - old: FAREMOS PELO BIND
        // var floatingAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)

        bind.floatingAdd.setOnClickListener{
            // setar para que não exista uma tarefa selecionada quando quisermos criar uma nova tarefa
            // (pra não chamar os dados desnecessariamente)
            mainViewModel.tarefaSelecionada = null

            // buscar onde tá o controller de navegação (no caso, o nav_graph que tá cuidando disso)
            // e setar para onde eu quero navegar (SegundoFragment)
            findNavController().navigate(R.id.action_primeiroFragment_to_segundoFragment)

        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            // checamos se o corpo da resposta é nulo, e caso não seja, chamamos
            // a função setLista do adapter, que receberá esse corpo (a lista de tarefas)
            response -> if(response.body() != null) {
                adapter.setLista(response.body()!!)
            }

        }

        // retornar o viewBinding, pois ele que trata da view agora
        return bind.root
    }

    // função para ver qual task eu quero editar
    override fun onTaskClickListener(tarefa: Tarefa) {
        // tarefaSelecionada recebe uma tarefa específica
        mainViewModel.tarefaSelecionada = tarefa
        // navegar para a tela de criar uma tarefa
        findNavController().navigate(R.id.action_primeiroFragment_to_segundoFragment)
    }

}