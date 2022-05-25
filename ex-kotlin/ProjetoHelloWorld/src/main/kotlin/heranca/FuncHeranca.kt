package heranca

/* Para indicar que a classe pode herdar do pai, reescrevemos o construtor primário do filho,
* instanciando a classe de onde vamos herdar, e quais os atributos DEVEMOS herdar dele, caso
* a classe pai tenha um construtor primário (temos que herdar todos). */

class FuncHeranca (nome:String, idade:Int, rg:String, var cod: Int, var funcao: String)
    : Pessoa(nome, idade, rg) {

    private var salario = 0.0

    // Métodos de Funcionário
    fun mostrarSalario(){
        println("O salário do funcionário é: $salario.")
    }
}