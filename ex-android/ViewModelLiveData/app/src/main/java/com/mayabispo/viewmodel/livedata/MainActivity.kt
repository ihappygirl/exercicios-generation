package com.mayabispo.viewmodel.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mayabispo.viewmodel.livedata.databinding.ActivityMainBinding

// Modo 1: setar a mudança de dados na MainActivity
// O problema é que ao mudar a orientação do dispositivo, os dados são perdidos
// pois a tela é destruida e recriada.

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // Modo 1 - sem ViewModel
        /*var contador = 0
        bind.txtContador.text = contador.toString()

        bind.btnClick.setOnClickListener {
            contador++
            bind.txtContador.text = contador.toString()
        }*/

        //Modo 2 - com ViewModel
        // Instanciar a viewModel com o ViewModelProvider, que diz onde vamos instanciar o obj
        // MainViewModel (this) e o ciclo de vida de qual model ele vai seguir.
        /*mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        bind.txtContador.text = mainViewModel.cont.toString()

        bind.btnClick.setOnClickListener {
            mainViewModel.addNumero()
            bind.txtContador.text = mainViewModel.cont.toString()
        }*/

        // LiveData - um tipo de model que administra dados de ViewModel a serem
        // observados pela UI (activity/fragment), e que pode notificar se houveram
        // mudanças nesses dados, em tempo real.
        // A UI então, recebendo essa notificação, atualiza os dados na tela.

        // Modo 3 - com LiveData
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.cont.observe(this){
            bind.txtContador.text = it.toString()
        }

        bind.btnClick.setOnClickListener {
            mainViewModel.addNumero()
            Toast.makeText(this, "LiveData fofocouuuuu!", Toast.LENGTH_SHORT).show()
        }


    }
}