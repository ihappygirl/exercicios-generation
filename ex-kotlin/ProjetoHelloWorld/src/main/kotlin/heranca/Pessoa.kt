package heranca

/* Para indicar que a classe pode ter filhas, marcaremos a classe como OPEN */

open class Pessoa (var nome: String, var idade: Int, var rg: String){

    var corCabelo = ""

    private var corPele = "Pardo"

    // Métodos de Pessoa
    fun andar(){
        println("Andando")
    }

    /* Sobrescrita de métodos (funciona para classes) - usar uma função existente, mas executando
    *  coisas diferentes quando ela for chamada. Para sobrescrever um método, eu preciso marcá-lo como OPEN.
    *  Onde eu vou sobrescrevê-lo, eu uso override fun funcaoSobrescrita(){}.
    *  Caso eu queira sobrescrever o método inteiro, eu oculto o super.nomeFuncao(){}.
    *  Caso contrário eu chamo super.nomeFuncao(){} antes de sobrescrever, que vai executar a funcao original
    *  primeiro.
    */
    open fun correr(){
        println("Correndo")
    }

    fun mostrarCorCabelo(){
        println("A cor do cabelo é: $corCabelo")
    }

    fun mostrarCorPele(){
        println("A cor da pele é: $corPele")
    }


}