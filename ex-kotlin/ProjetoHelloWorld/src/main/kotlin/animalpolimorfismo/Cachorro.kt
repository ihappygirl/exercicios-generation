package animalpolimorfismo

class Cachorro(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        println("Emitindo som de cachorro.")
    }

    fun correrCachorro(){
        println("Correndo igual a um cachorro.")
    }
}