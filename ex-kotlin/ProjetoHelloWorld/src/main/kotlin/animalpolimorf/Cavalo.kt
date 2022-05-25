package animalpolimorf

class Cavalo(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        println("Emitindo sons de cavalo.")
    }

    fun correrCavalo(){
        println("Correndo igual a um cavalo.")
    }

}