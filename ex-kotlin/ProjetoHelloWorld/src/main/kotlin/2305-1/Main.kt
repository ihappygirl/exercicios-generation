fun main() {

    /*
    Classes e Objetos
    Classe Cachorro
        Estados (ou Atributos) - Raça, Tamanho, Peso, Humor, Nome, Pelagem, Idade
        Comportametos (as Ações, ou métodos) - Latir, Comer, Beber, Espirrar, Brincar,
        Pular, Morder, Rolar, Destruir
     Objetos - Bob, Tobby, Sonic, Mel, Princesa, Spike
     Todos os objetos gerados dentro do Kotlin terão uma identidade única
     Classes com atributos
     Pessoa
        Atributos - Peso, Nome, Idade, CPF, Altura, RG
     Para criar objetos geraramos o que chamamos de Instâncias de uma classe
     */

    //Gerar uma instância de Pessoa laiosleine
    /*
    val laiosleine = Pessoa()
    laiosleine.nome = "Laiosleine"
    laiosleine.idade = 25
    laiosleine.peso = 65.0
    laiosleine.rg = "000000000000-0"
    laiosleine.cpf = "000.000.000-00"
    println(laiosleine.nome)
    println(laiosleine.idade)
    println(laiosleine.peso)
    println(laiosleine.rg)
    println(laiosleine.cpf)
    laiosleine.nome = "Reginaldo"
    val teste = Pessoa()
    teste.nome = "Laiosleine"
    teste.idade = 25
    teste.peso = 65.0
    teste.rg = "000000000000-0"
    teste.cpf = "000.000.000-00"
     */

    /*
    Comportamentos - Métodos (ou ações) que uma classe poderá executar
    Classe Banco
        Atributos - Saldo, Senha, Conta, Agencia, Tipo, Pix
        Métodos - Saque, Depósito, Transferência, Saldo
    Construtor - Contruir os objetos com informações obrigatórias
     */

    //Instância de conta banco adicionando informações no Construtor
    val contaBanco = ContaBanco(
        "Henrique",
        "0000",
        "000-00",
        2000.00
    )

    contaBanco.saldo()

    println("Digite o valor do saque: ")
    val dindin = readln().toDouble()

    contaBanco.saque(dindin)

    contaBanco.saldo()

    println("Digite o valor do depósito: ")
    val dindindin = readln().toDouble()

    contaBanco.deposito(dindindin)

}