package interfaces

fun main(){

    /*
    * INTERFACES
    *
    * Interface - Interfaces que vão servir como um contrato entre elas e suas filhas.
    * Não podemos gerar um construtor, pois seus atributos não podem ter valores iniciais.
    * Seus métodos são abstratos, e não possuem corpo.
    * As classes filhas são OBRIGADAS a herdar e sobrescrever todos os atributos e métodos
    * da interface pai e elas podem herdar mais de uma interface.
    *
    * Exemplo que criamos:
    * PessoaFisica - Interface pai
    * Mayara - classe filha
    *
    */

    val maya = Mayara(
        "Mayarinha",
        23,
        "56521132232",
        123,
        100.00,
        1500.00,
        0.0
    )

    maya.correr()
    maya.andar()
    maya.dormir()
    maya.jogarVideogame()
    maya.calcularSalario()


}

