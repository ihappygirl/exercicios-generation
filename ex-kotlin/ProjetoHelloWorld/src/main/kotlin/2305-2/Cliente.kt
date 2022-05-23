class Cliente (
    //Atributos
    var nome: String,
    val cpf: String,
    val agencia: String,
    val numConta: String,
    var saldo: Double
){

    // métodos:
    // Mostrar Info da Conta, Mostrar Saldo, Fazer Saque

    fun mostrarInfoConta(){
        println("\n***Informações da Conta***")
        println("Titular: $nome")
        println("CPF: $cpf")
        println("Agência: $agencia")
        println("Numero da Conta: $numConta")
    }

    fun mostrarSaldo(){
        println("\n***Saldo da conta***")
        println("R$$saldo")
    }

    fun fazerSaque(saque:Double){
        if(saque > 0.0 && saque <= saldo){
            saldo -= saque
            println("Saque de $saque feito com sucesso!")
        } else {
            println("Transação não autorizada. Valor do saldo da conta é insuficiente.")
        }
    }

}