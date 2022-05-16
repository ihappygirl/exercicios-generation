import java.util.*

fun main() {

    /*
    * Operadores Aritméticos
    * Adição +
    * Subtração -
    * Divisão /
    * Multiplicação *
    * Módulo %
    *
    * */

    //Exemplo usando Op. Aritméticos
    print("Digite o nome do funcionário: ")
    var nome = readln()

    print("Digite o salário do funcionário: R$")
    var salario = readln().toDouble()

    var bonus = salario * 0.2

    // Concatenação mais completa, aceitando dentro de ${}
    // algum tipo de expressão matemática ou juntar strings
    println("O salário do funcionário $nome, com 20% de bônus é: R$${salario + bonus}")


}
