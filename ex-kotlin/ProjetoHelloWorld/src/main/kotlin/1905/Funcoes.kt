fun main() {
    /*
    * FUNÇÕES - blocos de código que podemos chamar a qualquer momento no nosso
    * código.
    *
    * Com retorno - servem para retornarmos um valor que pode ser armazenado em uma
    * variável ou simplesmente exibir através de, por exemplo, um println()
    *
    * Sem retorno - servem para que a gente execute um bloco de código que vai exibir
    * ou fazer mudanças específicas dentro do nosso código.
    *
    * Estrutura de uma Função
    *   fun nomeDaFuncao(parametros): Tipo{
    *       Bloco de código
    *   }
    *
    * Parâmetros - são informações obrigatórias que precisamos passar no momento em que
    * formos chamar a função
    * */

    //Exemplo de função sem retorno
    //println("Função sem retorno, pois não podemos armazenar seu valor em uma variável, por exemplo.")

    //Exemplo de função com retorno
    //val nome = readln()

    // exemplo sem funcao
    /* var vida = 10

    // Inimigo deu dano
    vida -= 2

    if(vida <= 0){
        println("FALICEU!!!")
    } else if (vida in 1..3){
        println("Tá morrendooooo, vai se curar!!")
    } else if(vida in 4..7){
        println("Você tá de boas.")
    } else if(vida in 8..9){
        println("Você tá ótimo.")
    } else{
        println("Sua vida tá cheia")
    }
    */

    //Exemplo função sem retorno
    /*var vida = 10

    // Inimigo deu dano
    vida -= 2

    // Chamando a função
    vidaPersonagem(vida)
    */

    //Exemplo função com retorno
    println("Digite uma frase para ficar em letras maiúsculas: ")
    val texto = caracteresMaiusculos(readln())

    println(texto)

}

fun vidaPersonagem(vida: Int){
    if(vida <= 0){
    println("FALICEU!!!")
    } else if (vida in 1..3){
    println("Tá morrendooooo, vai se curar!!")
    } else if(vida in 4..7){
    println("Você tá de boas.")
    } else if(vida in 8..9){
    println("Você tá ótimo.")
    } else{
    println("Sua vida tá cheia")
    }
}

fun caracteresMaiusculos(texto: String): String{
    return texto.uppercase()
}