package com.mayabispo.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mayabispo.todolist.databinding.FragmentPrimeiroBinding
import com.mayabispo.todolist.databinding.FragmentSegundoBinding


class SegundoFragment : Fragment() {

    // instanciar o viewBinding
    private lateinit var bind: FragmentSegundoBinding

    // criar uma instancia de mainViewModel que sobreviva ao ciclo de todas as activities
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bind = FragmentSegundoBinding.inflate(layoutInflater, container, false)

        // observamos a var myCategoriaResponse e criamos um logcat que contém o
        // corpo da requisição (a resposta)
        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            Log.d("Requisicao", it.body().toString())
        }

        // Armazenamos o inflate do layout em uma variável, pois precisamos usá-lo para
        // criar as interações dos botões, e ai depois retornamos o inflate junto com elas.
        // E também pois o metodo findViewById só funciona dentro de uma view.
        //val view = inflater.inflate(R.layout.fragment_segundo, container, false)

        // Referenciar o buttonSalvar (que salva uma tarefa e retorna para o primeiro fragment)
        //val btnSalvar = view.findViewById<Button>(R.id.buttonSalvar)

        bind.buttonSalvar.setOnClickListener {
            // buscar onde tá o controller de navegação (no caso, o nav_graph que tá cuidando disso)
            // e setar para onde eu quero navegar (PrimeiroFragment)
            findNavController().navigate(R.id.action_segundoFragment_to_primeiroFragment)
        }

        // retornar o viewBinding, pois ele que trata da view agora
        return bind.root
    }

}