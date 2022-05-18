fun main(){

    /*
    * 6- Escrever um programa que receba vários números inteiros no teclado. E no
    * final imprimir a média dos números múltiplos de 3. Para sair digitar
    * 0(zero).(DO...WHILE)
    * */

    var soma = 0
    var qtdMult = 0

    do {
        print("Digite um número: ")
        val num = readln().toInt()

        if (num % 3 == 0 && num != 0) {
            soma += num
            qtdMult++
        }

    } while (num != 0)

    println("\nA média dos números multiplos de 3 que você digitou é: ${soma/qtdMult}")

}




