fun main() {

    // Exercicio `objetokotlin`.Calculadora
    var sair: String

    do {

        println("********* CALCULADORA *********")
        println("Menu:")
        println("1- Adição")
        println("2- Subtração")
        println("3- Multiplicação")
        println("4- Divisão")
        println("********* CALCULADORA *********\n")

        println("Digite o número correspondente a operação que você quer fazer: ")
        val opcao = readln().toInt()

        print("\nDigite o 1º número: ")
        val num1 = readln().toDouble()
        print("Digite o 2º número: ")
        val num2 = readln().toDouble()

        when(opcao){
            1 -> { println("Total da soma: ${soma(num1,num2)}") }
            2 -> { println("Total da subtração: ${subtracao(num1,num2)}") }
            3 -> { println("Total da multiplicação: ${multiplicacao(num1,num2)}") }
            4 -> { println("Total da divisão: ${divisao(num1,num2)}") }
            else -> { print("\nOpção inválida.") }
        }

        print("\nDeseja sair do programa (S/N)? ")
        sair = readln()

    } while (sair == "n" || sair == "N")
}

fun soma(n1: Double, n2: Double): Double {
    return n1 + n2
}

fun subtracao(n1: Double, n2: Double): Double {
    return n1 - n2
}

fun multiplicacao(n1: Double, n2: Double): Double {
    return n1 * n2
}

fun divisao(n1: Double, n2: Double): Double {
    return n1 / n2
}