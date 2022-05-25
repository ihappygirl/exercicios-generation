package animalpolimorfismo

class Preguica(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        println("Emitindo sons de preguiça.")
    }

    fun subirArvores(){
        println("Subindo árvores como uma preguiça.")
    }
}