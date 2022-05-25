package interfaces

class Mayara
    (override var nome: String,
     override var idade: Int,
     override var cpf: String,
     override var cod: Int,
     override var bonus: Double,
     override var pisoSal: Double,
     override var sal: Double, //var pastel:String
) : PessoaFisica, FuncInterface {

    /*fun mostrarPastel(){
        println("$pastel")
    }*/

    override fun andar() {
        println("Andando como Mayara")
    }

    override fun correr() {
        println("Correndo como Mayara")
    }

    override fun dormir() {
        println("Dormindo como Mayara")
    }

    fun jogarVideogame(){
        println("Jogando videogame")
    }

    override fun calcularSalario() {
        sal = pisoSal + bonus
    }

}