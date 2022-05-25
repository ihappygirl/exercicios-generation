package animalpolimorf

class Preguica(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("..........")
    }

    fun subirArvores(){
        println("Subindo árvores como uma preguiça.")
    }
}