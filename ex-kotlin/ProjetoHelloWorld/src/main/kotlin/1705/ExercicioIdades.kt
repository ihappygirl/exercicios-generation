fun main(){

    /* 3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra */
    print("Digite a idade: ")
    val idade = readln().toInt()

    when(idade){

        in 10..14 -> {
            println("Categoria - Infantil.")
        }
        in 15..17 -> {
            println("Categoria - Juvenil.")
        }
        in 18..25 -> {
            println("Categoria - Adulto.")
        }

        else-> println("A idade informada não está em nenhuma categoria.")

    }
}



