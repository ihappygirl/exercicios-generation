fun main(){

    val func = Funcionario(
        codigoFunc = 0,
        departamento = "Marketing",
        nomeFunc = "Mayara Bispo"
    )


   // Mostrar info funcionário
    func.mostrarInfoFuncionario()

    //Calcular o VT
    print("Digite o salário do funcionário: ")
    val salario = readln().toDouble()

    func.calcularVT(salario)



}

