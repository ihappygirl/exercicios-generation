package com.mayabispo.dado

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnD6 = findViewById<Button>(R.id.btnD6)
        val btnD12 = findViewById<Button>(R.id.btnD12)
        val btnD20 = findViewById<Button>(R.id.btnD20)

        btnD6.setOnClickListener { rolarDados(6,1) }
        btnD12.setOnClickListener { rolarDados(12,2) }
        btnD20.setOnClickListener { rolarDados(20,3) }
    }

    private fun rolarDados(lados:Int, tipoDado:Int){
        val qtdLados = (1..lados).random()

        val ladoAtual:TextView
        val imagemDado:ImageView

        when(tipoDado){
            1 -> {
                ladoAtual = findViewById(R.id.textD6)
                ladoAtual.text = qtdLados.toString()

                imagemDado = findViewById(R.id.imgD6)
                imagemDado.setImageResource(R.drawable.d1)

                when(qtdLados){
                    1 -> imagemDado.setImageResource(R.drawable.d1)
                    2 -> imagemDado.setImageResource(R.drawable.d2)
                    3 -> imagemDado.setImageResource(R.drawable.d3)
                    4 -> imagemDado.setImageResource(R.drawable.d4)
                    5 -> imagemDado.setImageResource(R.drawable.d5)
                    6 -> imagemDado.setImageResource(R.drawable.d6)
                }
            }
            2 -> {
                ladoAtual = findViewById(R.id.textD12)
                ladoAtual.text = qtdLados.toString()

                imagemDado = findViewById(R.id.imgD12)
                imagemDado.setImageResource(R.drawable.d1_d12)

                when(qtdLados){
                    1 -> imagemDado.setImageResource(R.drawable.d1_d12)
                    2 -> imagemDado.setImageResource(R.drawable.d2_d12)
                    3 -> imagemDado.setImageResource(R.drawable.d3_d12)
                    4 -> imagemDado.setImageResource(R.drawable.d4_d12)
                    5 -> imagemDado.setImageResource(R.drawable.d5_d12)
                    6 -> imagemDado.setImageResource(R.drawable.d6_d12)
                    7 -> imagemDado.setImageResource(R.drawable.d7_d12)
                    8 -> imagemDado.setImageResource(R.drawable.d8_d12)
                    9 -> imagemDado.setImageResource(R.drawable.d9_d12)
                    10 -> imagemDado.setImageResource(R.drawable.d10_d12)
                    11 -> imagemDado.setImageResource(R.drawable.d11_d12)
                    12 -> imagemDado.setImageResource(R.drawable.d12_d12)
                }
            }
            3 -> {
                ladoAtual = findViewById(R.id.textD20)
                ladoAtual.text = qtdLados.toString()

                imagemDado = findViewById(R.id.imgD20)
                imagemDado.setImageResource(R.drawable.d1_d20)

                when(qtdLados){
                    1 -> imagemDado.setImageResource(R.drawable.d1_d20)
                    2 -> imagemDado.setImageResource(R.drawable.d2_d20)
                    3 -> imagemDado.setImageResource(R.drawable.d3_d20)
                    4 -> imagemDado.setImageResource(R.drawable.d4_d20)
                    5 -> imagemDado.setImageResource(R.drawable.d5_d20)
                    6 -> imagemDado.setImageResource(R.drawable.d6_d20)
                    7 -> imagemDado.setImageResource(R.drawable.d7_d20)
                    8 -> imagemDado.setImageResource(R.drawable.d8_d20)
                    9 -> imagemDado.setImageResource(R.drawable.d9_d20)
                    10 -> imagemDado.setImageResource(R.drawable.d10_d20)
                    11 -> imagemDado.setImageResource(R.drawable.d11_d20)
                    12 -> imagemDado.setImageResource(R.drawable.d12_d20)
                    13 -> imagemDado.setImageResource(R.drawable.d13_d20)
                    14 -> imagemDado.setImageResource(R.drawable.d14_d20)
                    15 -> imagemDado.setImageResource(R.drawable.d15_d20)
                    16 -> imagemDado.setImageResource(R.drawable.d16_d20)
                    17 -> imagemDado.setImageResource(R.drawable.d17_d20)
                    18 -> imagemDado.setImageResource(R.drawable.d18_d20)
                    19 -> imagemDado.setImageResource(R.drawable.d19_d20)
                    20 -> imagemDado.setImageResource(R.drawable.d20_d20)
                }
            }

        }
    }
}