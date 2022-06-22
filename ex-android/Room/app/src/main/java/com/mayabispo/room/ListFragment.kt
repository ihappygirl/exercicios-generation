package com.mayabispo.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mayabispo.room.adapter.UsuarioAdapter
import com.mayabispo.room.databinding.FragmentListBinding


class ListFragment : Fragment() {

    private lateinit var bind : FragmentListBinding
    // 44
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentListBinding.inflate(layoutInflater, container, false)

        // 45
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // 40 - instanciar UsuarioAdapter
        val adapter = UsuarioAdapter()

        // 41 - setar o layout do recyclerView (como um linearLayout)
        bind.recyclerUsuarios.layoutManager = LinearLayoutManager(context)

        // 42
        bind.recyclerUsuarios.adapter = adapter

        // 43
        bind.recyclerUsuarios.setHasFixedSize(true)

        // 46 - observar a var selectUsuarios e pegar a resposta (response)
        mainViewModel.selectUsuarios.observe(viewLifecycleOwner){
            // 47 - passar response como parâmetro de setLista
            response -> adapter.setLista(response)
        }

        bind.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        return bind.root
    }

}