package com.mayabispo.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mayabispo.todolist.databinding.FragmentPrimeiroBinding
import com.mayabispo.todolist.databinding.FragmentSegundoBinding
import com.mayabispo.todolist.fragment.DatePickerFragment
import com.mayabispo.todolist.fragment.TimerPickerListener
import com.mayabispo.todolist.model.Categoria
import java.time.LocalDate


class SegundoFragment : Fragment(), TimerPickerListener {

    // instanciar o viewBinding
    private lateinit var bind: FragmentSegundoBinding

    // criar uma instancia de mainViewModel que sobreviva ao ciclo de todas as activities
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bind = FragmentSegundoBinding.inflate(layoutInflater, container, false)

        mainViewModel.listarCategorias()

        // seleciona a data atual
        mainViewModel.dataSelecionada.value = LocalDate.now()

        // observamos a var myCategoriaResponse e criamos um logcat que contém o
        // corpo da requisição (a resposta)
        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            response -> Log.d("Requisicao", response.body().toString())
            // chamar spinnerCategoria passando o corpo da requisição como parâmetro (a lista de
            // categorias)
            spinnerCategoria(response.body())
        }

        // observamos a data selecionada caso mude
        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> bind.editData.setText(selectedDate.toString())
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

        // abrir o calendário ao clicar em editData
        bind.editData.setOnClickListener {
            DatePickerFragment(this).show(parentFragmentManager, "Date Picker")
        }

        // retornar o viewBinding, pois ele que trata da view agora
        return bind.root
    }

    // função que usa o array adapter para inserir o array de categorias no spinner
    fun spinnerCategoria(listaCategoria: List<Categoria>?){
        if(listaCategoria != null){
            bind.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listaCategoria
                )
        }
    }
    // quando o usuário selecionar uma data, pegaremos ela pra jogar na MutableLiveData dataSelecionada
    override fun onDateSelected(data: LocalDate) {
        mainViewModel.dataSelecionada.value = data
    }

}