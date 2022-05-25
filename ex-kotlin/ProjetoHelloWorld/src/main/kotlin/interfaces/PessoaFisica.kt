package interfaces

interface PessoaFisica {

    var nome : String
    var idade: Int
    var cpf: String

    //Métodos abstratos de PessoaFisica
    fun andar()
    fun correr()
    fun dormir()

}