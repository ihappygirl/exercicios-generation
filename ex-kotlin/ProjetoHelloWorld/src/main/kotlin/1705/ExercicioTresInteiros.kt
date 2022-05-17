fun main() {


    /* 1 - Faça um programa que receba três inteiros e diga qual deles é o maior. */

    print("Digite o 1º numero: ")
    val num1 = readln().toInt()

    print("Digite o 2º numero: ")
    val num2 = readln().toInt()

    print("Digite o 3º numero: ")
    val num3 = readln().toInt()

    var maiorNum = 0

    if (num1 > maiorNum){
        maiorNum = num1
    } else if(num2 > maiorNum){
        maiorNum = num2
    } else {
        maiorNum = num3
    }

    print("O maior numero é: $maiorNum")


}