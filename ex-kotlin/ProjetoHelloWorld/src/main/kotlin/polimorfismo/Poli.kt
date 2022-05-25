package polimorfismo

import heranca.EstudanteHeranca

fun main(){

    /*
    * POLIMORFISMO
    *
    * Polimorfismo - métodos com o mesmo nome, mas que executam coisas diferentes.
    *   Sobrecarga de métodos - usar a mesma função recebendo parâmetros diferentes.
    *   Ao mudarmos o tipo de parâmetros recebidos, podemos mudar a função completamente.
    *
    *   Sobrescrita de métodos (funciona para classes) - usar uma função existente, mas executando
    *   coisas diferentes quando ela for chamada. Para sobrescrever um método, eu preciso marcá-lo como OPEN.
    *   Onde eu vou sobrescrevê-lo, eu uso override fun funcaoSobrescrita(){}.
    *   Caso eu queira sobrescrever o método original inteiro, eu oculto o super.nomeFuncao(){}.
    *   Caso contrário eu chamo super.nomeFuncao(){} antes de sobrescrever, que vai executar a funcao original
    *   primeiro e depois sobrescrevê-la em override.
    *
    *   Quando declaramos uma classe como "data class", queremos sobrescrever alguns métodos, por exemplo,
    *   o toString() e o equals().
    * */


    val estu = EstudanteHeranca(
        "Mayara",
        23,
        "65464646",
        "1236545"
    )

    estu.corCabelo = "Loiro"
    estu.andar()
    estu.mostrarNota()
    estu.mostrarCorCabelo()
    estu.mostrarCorPele()

    // Exemplo de polimorfismo
    // Método pow -> pode ser usado para Double ou para Int
    println(somaPoli(1,1)) // função soma que recebe e retorna Int
    println(somaPoli(2.0,2.0)) // função soma que recebe e retorna Double

    //Exemplo de override para mostrar os dados de estudante
    println(estu)

}

// Sobrecarga de métodos
fun somaPoli(n1:Int, n2:Int): Int{
    return n1 + n2
}

fun somaPoli(n1:Double, n2:Double): Double{
    return n1 + n2
}