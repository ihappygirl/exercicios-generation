package com.mayabispo.todolist

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.mayabispo.todolist.databinding.FragmentPrimeiroBinding
import com.mayabispo.todolist.databinding.FragmentSegundoBinding
import com.mayabispo.todolist.fragment.DatePickerFragment
import com.mayabispo.todolist.fragment.TimerPickerListener
import com.mayabispo.todolist.model.Categoria
import com.mayabispo.todolist.model.Tarefa
import java.time.LocalDate


class SegundoFragment : Fragment(), TimerPickerListener {

    // instanciar o viewBinding
    private lateinit var bind: FragmentSegundoBinding

    // criar uma instancia de mainViewModel que sobreviva ao ciclo de todas as activities
    private val mainViewModel: MainViewModel by activityViewModels()

    private var categoriaSelecionada = 0L

    // tem uma tarefa selecionada?
    private var tarefaSelecionada : Tarefa? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bind = FragmentSegundoBinding.inflate(layoutInflater, container, false)

        carregarDados()

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
            adicionarAoBanco()
        }

        // abrir o calendário ao clicar em editData
        bind.editData.setOnClickListener {
            DatePickerFragment(this).show(parentFragmentManager, "Date Picker")
        }

        // retornar o viewBinding, pois ele que trata da view agora
        return bind.root
    }

    // função que usa o array adapter para inserir o array de categorias no spinner
    private fun spinnerCategoria(listaCategoria: List<Categoria>?){
        if(listaCategoria != null){
            bind.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listaCategoria
                )

            // quando o usuario selecionar uma categoria, armazenamos o id dela
            bind.spinnerCategoria.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        // pegar o item selecionado como Categoria
                        val selecionado = bind.spinnerCategoria.selectedItem as Categoria
                        // passar o id da categoria do item selecionado
                        categoriaSelecionada = selecionado.id

                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                }
        }
    }

    private fun validarCampos(
        nome:String, descricao: String, responsavel:String
    ) : Boolean{
        return !(
                (nome == "" || nome.length < 3 || nome.length > 20) ||
                        (descricao == "" || descricao.length < 5 || descricao.length > 200) ||
                        (responsavel == "" || responsavel.length < 3 || responsavel.length > 20)
                )
    }

    private fun adicionarAoBanco(){
        // pegamos os dados digitados
        val nome = bind.editNome.text.toString()
        val desc = bind.editDescricao.text.toString()
        val resp = bind.editResponsavel.text.toString()
        val data = bind.editData.text.toString()
        val status = bind.switchAtivoCard.isChecked
        val categoria = Categoria(categoriaSelecionada, null, null)

        // validamos os campos nome, desc, responsavel
        if (validarCampos(nome, desc, resp)){

            // variavel que guarda a msg mostrada no toast
            val salvar : String

            // verficar se a tarefa existe e caso sim, a gente faz a requisição PUT (metodo editTarefa)
            // caso não exista, a gente faz a requisição POST (metodo addTarefa)
            if(tarefaSelecionada != null) {
                salvar = "Tarefa atualizada com sucesso!"

                // criamos uma instancia de tarefa passando os novos dados digitados, menos o id
                // que pegamos da tarefa já existente
                val tarefa = Tarefa(tarefaSelecionada?.id!!, nome, desc, resp, data, status, categoria)

                // passamos essa instancia como parâmetro da requisição PUT do endpoint de tarefa
                mainViewModel.editTarefa(tarefa)
            } else {
                salvar = "Tarefa adicionada com sucesso!"

                // criamos uma instancia de tarefa passando os dados digitados
                val tarefa = Tarefa(0, nome, desc, resp, data, status, categoria)

                // passamos essa instancia como parâmetro da requisição POST do endpoint de tarefa
                mainViewModel.addTarefa(tarefa)
            }

            // mostramos um toast falando que deu bom
            Toast.makeText(context, salvar, Toast.LENGTH_SHORT).show()

            // Retornamos para a tela de listagem de tarefas
            // buscar onde tá o controller de navegação (no caso, o nav_graph que tá cuidando disso)
            // e setar para onde eu quero navegar (PrimeiroFragment)
            findNavController().navigate(R.id.action_segundoFragment_to_primeiroFragment)


        } else{
            Toast.makeText(context, "Verifique se os dados estão corretos!", Toast.LENGTH_SHORT).show()
        }
    }

    // ver se tem uma tarefa selecionada e carregar os dados dela nos campos
    private fun carregarDados(){
        tarefaSelecionada = mainViewModel.tarefaSelecionada

        if(tarefaSelecionada != null){
            // atribuir os dados da tarefa selecionada aos campos na tela
            bind.editNome.setText(tarefaSelecionada?.nome)
            bind.editDescricao.setText(tarefaSelecionada?.descricao)
            bind.editResponsavel.setText(tarefaSelecionada?.responsavel)
            bind.editData.setText(tarefaSelecionada?.data)
            bind.switchAtivoCard.isChecked =  tarefaSelecionada?.status!!
        }
    }

    // quando o usuário selecionar uma data, pegaremos ela pra jogar na MutableLiveData dataSelecionada
    override fun onDateSelected(data: LocalDate) {
        mainViewModel.dataSelecionada.value = data
    }

}