import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    /* 4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
    */

    print("Digite um número: ")
    val num = readln().toDouble()

    if (num % 2.0 == 0.0){
        println("O número $num é par. A raiz quadrada dele é: ${"%.2f".format(sqrt(num))}.")
    } else {
        println("O número $num é ímpar. Ele elevado ao quadrado é: ${"%.2f".format(num.pow(2.0))}.")
    }

}