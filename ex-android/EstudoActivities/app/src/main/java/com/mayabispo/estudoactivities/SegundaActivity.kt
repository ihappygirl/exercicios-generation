package com.mayabispo.estudoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        // achar o botão pelo id
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        // setar evento onClick no botão
        buttonVoltar.setOnClickListener{
            // não precisamos criar uma intent da mainActivity, pois ela ainda está rodando no background
            // para isso, precisamos somente dizer que quando clicarmos em Voltar, a SegundaActivity será finalizada

            Log.d("Ciclo", "Finalizando SegundaActivity")
            finish()
        }


    }
}