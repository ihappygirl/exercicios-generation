fun main(){

    /*
    * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    * idade for =-99.
    * */

    var idade = 0
    var menos21 = 0
    var mais50 = 0

    while (idade != -99){

        print("Digite uma idade:")
        idade = readln().toInt()

        if (idade < 21 && idade != -99){
            menos21++
        }

        if (idade > 50){
            mais50++
        }

    }

    println("\nO total de pessoas com menos de 21 anos é $menos21 e o de pessoas com mais de 50 anos é $mais50")

}

