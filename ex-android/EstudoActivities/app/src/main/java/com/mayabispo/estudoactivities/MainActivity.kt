package com.mayabispo.estudoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // onCreate - cria os componentes da tela xml que eu quero mostrar
    // onStart - mostra os componentes para o usuario
    // onResume - libera a tela para inputs e outras ações
    // onPause - quando abrirmos outra tela do app, ele coloca a tela anterior em pause e rodando no background
    //           quando voltarmos para a tela anterior, ele volta para o metodo onResume
    // onStop - quando minimizamos o app (sem fechar), a tela atual fica como onStop
    // onRestart -
    // onDestroy - quando fechamos o app, onDestroy destroi a tela e o app


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate()")

        // achar o botão pelo id
        val buttonProx = findViewById<Button>(R.id.buttonProx)

        // criar uma intent da segunda tela
        val segundaTela = Intent(this, SegundaActivity::class.java)

        // setar evento onClick no botão
        buttonProx.setOnClickListener {
            // chamar a intent pelo startActivity
            Log.d("Ciclo", "Chamando nova activity")
            startActivity(segundaTela)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo", "onRestart()")
    }



}