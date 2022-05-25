package classesabstratas

/* Para criar uma classe abstrata, marcamos-a como ABSTRACT. */

abstract class Animal (var orgaos:Boolean, var tipoPele: String, var carnivoro: Boolean) {

    // métodos abstratos - métodos abstratos que não possuem corpo. O corpo é criado quando
    // a classe filha sobrescreve o método abstrato original (usando o override).
    // A ideia é que as classes filhas tenham seu próprio metodo de, por exemplo, pular,
    // pois, no nosso exemplo cada animal pode pular de formas diferentes.
    abstract fun pular()

    open fun correr(){
        println("Correndo")
    }

    fun morder(){
        println("Mordendo")
    }

    fun comer(){
        println("Comendo")
    }



}