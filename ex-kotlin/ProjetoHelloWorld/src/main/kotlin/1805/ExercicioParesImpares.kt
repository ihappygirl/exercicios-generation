fun main(){

    /*
    * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    * */

    var par = 0
    var impar = 0

    for (i in 1..10){

        print("Digite o ${i}º numero:")
        val num = readln().toInt()

        if(num % 2 == 0){
            par++
        } else {
            impar++
        }
    }

    println("\nO total de números pares é $par e o de números impares é $impar")

}

