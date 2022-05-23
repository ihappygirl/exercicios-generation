fun main(){


    val mayara = Cliente(
        nome = "Mayara Bispo",
        cpf = "464.336.758.96",
        agencia = "0228",
        numConta = "86658-9",
        saldo = 3500.00
    )

    // mostrar info da conta
    mayara.mostrarInfoConta()

    //mostrar saldo
    mayara.mostrarSaldo()

    //Fazer saque
    print("Digite o valor do saque: ")
    val saque = readln().toDouble()

    mayara.fazerSaque(saque)

    mayara.mostrarSaldo()



}

