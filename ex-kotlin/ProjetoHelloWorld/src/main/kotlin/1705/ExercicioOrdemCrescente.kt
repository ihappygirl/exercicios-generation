fun main() {

    /* 2 - Faça um programa que entre com três números e coloque em ordem crescente. */

    print("Digite o 1º numero: ")
    val num1 = readln().toInt()

    print("Digite o 2º numero: ")
    val num2 = readln().toInt()

    print("Digite o 3º numero: ")
    val num3 = readln().toInt()

    var a = 0
    var b = 0
    var c = 0

    if ((num1 < num2) && (num1 < num3)) { // caso o menor seja o num1
        a = num1

        if (num2 < num3) {
            b = num2
            c = num3
        } else {
            b = num3
            c = num2
        }

    } else if ((num2 < num3) && (num2 < num1)) { // caso o menor seja o num2
        a = num2

        if (num1 < num3) {
            b = num1
            c = num3
        } else {
            b = num3
            c = num1
        }

    } else if ((num3 < num1) && (num3 < num2)) { // caso o menor seja o num3
        a = num3

        if (num2 < num1) {
            b = num2
            c = num1
        } else {
            b = num1
            c = num2
        }

    } else{ // caso haja numeros iguais (num1 = num2, num2 = num3 ou num3 = num1)

        if((num1 == num2) && num1 < num3){
            a = num1
            b = num2
            c = num3
        } else if(num2 == num3 && num2 < num1){
            a = num2
            b = num3
            c = num1
        } else {
            a = num1
            b = num3
            c = num2
        }
    }

    print("A ordem dos números é: $a, $b, $c")


}