class Funcionario (

    //Atributos
    var codigoFunc: Int,
    var departamento: String,
    var nomeFunc: String,

) {

    // Métodos:
    // Mostrar Info do Funcionario, Calcular VT

    fun mostrarInfoFuncionario(){
        println("\n***Informações do Funcionario***")
        println("Código: $codigoFunc")
        println("Departamento: $departamento")
        println("Nome: $nomeFunc")
    }

    fun calcularVT(salarioFunc: Double){
        // usei como base 6% do salário
        var valeTransp = 0.0

        valeTransp = salarioFunc * 0.06

        println("O valor do VT a ser pago esse mês é: R$$valeTransp.")
    }

}