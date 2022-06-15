package com.mayabispo.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Ciclos de vida de uma activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate()")
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

    // NavComponent - bibliotecas que facilitam a navegação no app

    // Fragments - pedaços de tela que ficam dentro que um container e
    // que são criados apenas em uma unica activity, onde eu posso passar
    // de uma tela para outra sem criar uma pilha.

    // Exemplo de fragments - a tela inicial do whatsapp, onde cada fragment
    // é o Conversas, Status e Chamadas.

    // Adicionar navgraph e criar dois fragmentos: PrimeiroFragment e SegundoFragment.
    // Para não termos problemas de quando eu voltar do segundo para o primeiro ele criar
    // uma nova activity e começar uma pilha desnecessaria de telas, setamos no evento action do
    // segundo fragment, a ação popUpTo(PrimeiroFragment), que mata o processo do SegundoFragment
    // ao inves de jogá-lo para o background.
    // Também queremos que, ao voltar para o primeiro, a lista de tarefas seja atualizada, então
    // também mataremos o processo de PrimeiroFragment, que deve ser recriado com a nova lista.
    // Setamos então no SegundoFragment, a ação popUpToInclusive(true).

    // Para criar a navegação entre esses fragments, na activity_main adicionamos um componente chamado
    // NavHostFragment, que será o container onde chamaremos as duas views (fragments).

    // Em cada class de Fragment, também possuimos metodos de ciclo de vida, como onCreate, onCreateView,
    // onStart, etc.
    // O método principal é o onCreateView, que é onde inflamos (dizemos que a tela vai ter o layout do xml tal)
    // e retornamos o layout da tela

    // RecyclerView - gera listas dinâmicas, como listas simples (com textos) ou cards (listas com imagens, etc).
    // Ele é chamado de recycler por justamente reciclar a view que mostra os dados da lista, não precisando
    // criar todas as views de uma vez (o que deixaria o app pesado ou lento na execução).
    // Por exemplo: se tivermos uma lista com 5 cards, ele mostraria os 3 primeiros e quando o primeiro estivesse
    // fora de cena (quando damos scroll), ele pega esse primeiro card, joga pro fim da fila de cards e atualiza os
    // dados, mostrando agora os dados de um novo index da lista.

    // Itens de um RecyclerView: Item, TarefaAdapter e ViewHolder.
    // Item - o layout do card onde os itens vão ser mostrados. Também possui a classe model, que possui as informações
    // necessárias para criar o item (data class, por exemplo).
    // TarefaAdapter - processar todos os dados que compõem os itens.
    // TarefaViewHolder - pega o layout do card onde mostraremos os itens, junta com os dados do adapter e mostra na tela.

    // ViewBinding - um object que contém todas as referencias por id dos meus itens de layout, pois seria horrivel
    // ter que criar variáveis e chamar o findViewById para referenciar cada uma delas.
    // Podemos habilitá-lo pelo build.gradle (Module) do projeto, setando viewBinding{ enabled=true }

    // Retrofit - lida com requisições de APIs REST
    // Para implementar APIs em nosso projeto, precisamos de:
    // Implementar o Retrofit e as Coroutines em build.gradle
    // Classe de Modelo  - contém os todos os atributos necessários do endpoint de tarefas ou de categorias
    // Classe de Serviço - contém os metodos http (get, post, put e delete) para requests
    // RetrofitInstance - contém a instancia do retrofit
    // Repositório - pega os metodos da interface e junta com o RetrofitInstance
    // e os transforma em métodos propriamente ditos
    // ViewModel - para processar e persistir os dados retornados da API, também os prepara para
    // mostrar na tela

    // Coroutines - funções que rodam de forma assincrona, fazendo com que a UI
    // seja atualizada enquanto ainda pegamos informações da API, por exemplo,
    // evitando que a tela fique congelada por um tempo desnecessário.
    // Para isso, declaramos a função como SUSPEND, que indica que essa função será executada
    // em uma outra thread, sendo jogada para rodar no background.
    // É formada por:
    // Escopo (CoroutineScope) - onde nossa coroutine será criada. Há casos em que queremos que
    // a coroutine seja executada com base em algum ciclo de vida, que pode ser:
    //      GlobalScope - escopo global do projeto (acaba quando fecharmos o app)
    //      ViewModelScope - escopo da ViewModel
    //      LifecycleScope - escopo da Activity ou Fragment (UI)
    // Job - nome unico da coroutine dentro do projeto
    // Contexto (dispatchers) - que tipo de thread usaremos para nossas coroutines
    //      Main - dados pequenos que podem ser processados pela UI
    //      IO - para dados que vem de redes
    //      Default - para operações que exigem mais do processador.


}