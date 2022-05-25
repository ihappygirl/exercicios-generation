package animalpolimorf

open class AnimalPoli (var nome:String, var idade:Int) {

    open fun emitirSom(){
        println("Emitindo som!")
    }
    open fun correr(){
        println("Correndo!")
    }

}