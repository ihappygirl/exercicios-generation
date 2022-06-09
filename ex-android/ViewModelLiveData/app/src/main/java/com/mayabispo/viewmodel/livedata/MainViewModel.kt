package com.mayabispo.viewmodel.livedata

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// Modo 2: Criar uma classe ViewModel para tratar os dados do contador,
// de forma que eles não sejam perdidos caso a Activity seja morta e recriada.

class MainViewModel : ViewModel() {

    // LiveData - um tipo de model que administra dados de ViewModel a serem
    // observados pela UI (activity/fragment), e que pode notificar se houveram
    // mudanças nesses dados, em tempo real.
    // A UI então, recebendo essa notificação, atualiza os dados na tela.
    // Por padrão, o LiveData é imutável, sendo necessário usar um componente
    // chamado MutableLiveData.

    // Aqui precisamos declarar quais são as variáveis que a ViewModel
    // precisa persistir, bem como os metodos que adicionam mais valores a esses dados

    // sem LiveData
    // var cont = 0

    // com MutableLiveData
    var cont = MutableLiveData(0)

    // sem LiveData
    /*fun addNumero(){
        cont++
    }*/

    // Já na MainActivity, instanciamos a ViewModel e fazemos com que ela sobreviva ao
    // ciclo de vida da MainActivity.

    //com LiveData
    fun addNumero(){
        // forma de adicionar que aceita valores nulos
        // cont.value = cont.value?.plus(1)

        // forma de adicionar que não aceita valores nulos
        cont.value = cont.value!! + 1
    }
}