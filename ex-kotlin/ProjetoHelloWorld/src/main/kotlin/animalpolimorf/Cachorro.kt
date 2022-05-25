package animalpolimorf

class Cachorro(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("AUAUAUUUUUUU")
    }

    override fun correr() {
        super.correr()
        println("Igual a um cachorro.")
    }
}