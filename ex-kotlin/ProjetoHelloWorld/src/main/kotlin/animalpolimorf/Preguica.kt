package animalpolimorf

class Preguica(nome: String, idade: Int) :AnimalPoli(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("..........")
    }

    // Não interpretei subir árvores como um tipo de deslocamento (do modo que o Henrique colocou
    // na resolução do exercicio), entendi que subir árvores é um método exclusivo da classe Preguica,
    // já correr() é um método da classe pai Animal, que é herdado por Cachorro e Cavalo
    fun subirArvores(){
        println("Subindo árvores como uma preguiça.")
    }
}