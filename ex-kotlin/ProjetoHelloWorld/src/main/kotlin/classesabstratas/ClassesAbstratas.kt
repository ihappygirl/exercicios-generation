package classesabstratas

fun main(){

    /*
    * CLASSES ABSTRATAS
    *
    * Classes Abstratas - classes pais que não podem ser instanciadas
    * apenas seus filhos que podem.
    * Além disso conseguimos implementar métodos abstratos dentro da classe abstrata.
    *
    * Métodos abstratos - métodos abstratos que não possuem corpo. O corpo é criado quando
    * a classe filha sobrescreve o método abstrato original (usando o override).
    * A ideia é que as classes filhas tenham seu próprio metodo de, por exemplo, pular,
    * pois, no nosso exemplo cada animal pode pular de formas diferentes.
    *
    * Exemplo que criamos:
    * Animal - Classe pai abstrata
    * Cachorro - Classes filhas
    *
    */

    val cachorro = Cachorro(
        true,
        "Pele macia",
        true,
        false,
        true
    )

    cachorro.correr()
    cachorro.latir()
    cachorro.pular()
    cachorro.afiarUnhas()
    cachorro.proteger()

}

