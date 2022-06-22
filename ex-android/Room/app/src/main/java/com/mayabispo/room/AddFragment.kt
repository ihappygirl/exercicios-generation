package com.mayabispo.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.mayabispo.room.data.Usuario
import com.mayabispo.room.databinding.FragmentAddBinding


class AddFragment : Fragment() {

    // 25 - instanciar o viewBinding
    private lateinit var bind : FragmentAddBinding

    // 29 - chamar a viewmodel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 25 - instanciar o viewBinding
        bind = FragmentAddBinding.inflate(layoutInflater, container, false)

        // 30 -
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // 26 - criar ação do botão Salvar
        bind.buttonAdd.setOnClickListener {
            inserirNoBanco()
        }

        // 25 - instanciar o viewBinding
        return bind.root
    }

    // 27 - funcao verificarCampos
    fun verificarCampos(nome: String, sobrenome: String, idade:String) : Boolean{
        return !(nome == "" || sobrenome == "" || idade == "")
    }

    // 28 - funcao inserirNoBanco
    fun inserirNoBanco(){
        val nome = bind.editNome.text.toString()
        val sobrenome = bind.editSobrenome.text.toString()
        val idade = bind.editIdade.text.toString()

        if(verificarCampos(nome, sobrenome, idade)){
            val usuario = Usuario(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUsuario(usuario)
            Toast.makeText(context, "Usuário adicionado com sucesso!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        } else {
            Toast.makeText(context, "Verifique todos os campos!", Toast.LENGTH_LONG).show()
        }
    }
}