fun main(){

    /*
    * ESTRUTURAS DE REPETIÇÃO
    *
    * while - Loop através de condição.
    *   while (condicao){
    *       Código que vai ser executado enquanto condição for verdade
    *   }
    *
    *
    * do...while - Executa o codigo pelo menos uma vez e faz loop enquanto a condição for verdade.
    *   do {
    *       Executa o código pelo menos uma vez e depois repete
    *       o código enquanto condição for verdade
    *   } while (condicao)
    *
    *
    * for - Loop através de uma variável auxiliar
    *   for(contador in <range>){ // ex: i in 1..10
    *       repete o código enquanto o contador não sai do range
    *   }
    *
    * */

    //Exemplo while
    /*var soma = 0.0
    var num = 1.0

    while(num != 0.0){
        print("Digite um numero diferente de 0: ")
        num = readln().toDouble()
        soma += num
    }

    println("A soma de todos os números é: $soma")
    */

    //Exemplo do...while
    /* do {
        println("Temos o Pete e o Repete. O Pete morreu, quem sobrou?")
        val resp = readln()

    } while (resp == "Repete" || resp == "repete")
    */

    //Exemplo for
    print("Digite um número para calcularmos a tabuada: ")
    val num = readln().toDouble()

    // step (numero) - indica de quanto em quantos números o for vai incrementar. Precisa ser um número positivo.
    // numero..numero - range de numeros em ordem crescente
    // Caso 1 - ir incrementando
    for (i in 0..10 step 2){
        println("$num x $i =  ${num * i}")
    }

    // downTo - range de numeros em ordem decrescente
    // Caso 2 - ir decrementando
    for (i in 10 downTo 0 step 2){
        println("$num x $i =  ${num * i}")
    }



}

