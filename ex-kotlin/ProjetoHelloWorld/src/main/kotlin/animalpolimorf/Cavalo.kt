package animalpolimorf

class Cavalo(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("HIHIHIHIHIHIIIIIIIII")
    }

    override fun correr() {
        super.correr()
        println("Igual a um cavalo.")
    }

}