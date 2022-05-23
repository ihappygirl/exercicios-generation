data class ContaBanco(
    var titular: String, val agencia: String,
    val conta: String, var saldo: Double
) {

    var limite = 0.0
    var chequeEspecial = false
    var seguroCartao = false

    /*
    Estrutura contrutor secundário
    constructor (todas os valores do contrutor secundário)
        : this(referenciar as variaveis do construtor primario){
        Indicar onde armazenaremos os valores do contrutor que estamos criando
   }
     */

    //Declarando construtor secundário
    constructor(
        titular: String, agencia: String, conta: String, saldo: Double,
        limite: Double
    ): this(titular, agencia, conta, saldo){
        this.limite = limite
    }

    constructor(
        titular: String, agencia: String, conta: String, saldo: Double,
        limite: Double, chequeEspecial: Boolean
    ): this(titular, agencia, conta, saldo, limite){
        this.chequeEspecial = chequeEspecial
    }

    constructor(
        titular: String, agencia: String, conta: String, saldo: Double,
        limite: Double, chequeEspecial: Boolean, seguroCartao: Boolean
    ): this(titular, agencia, conta, saldo, limite, chequeEspecial){
        this.seguroCartao = seguroCartao
    }

    /*
    Declarar os métodos da classe
    Por exemplo:
    fun saque(){
    }
    Métodos de uma conta de Banco
    Saldo, Saque, Deposito
     */

    //Método saldo()
    fun saldo() {
        println("\n***Saldo da conta***\n")
        println("R$$saldo")
    }

    //Método Saque
    fun saque(valor: Double) {
        if (valor > 0.0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso!\n")
        } else {
            println("Saque de R$$valor impossível de ser realizado!\n")
        }
    }

    //Depósito
    fun deposito(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso!\n")
        } else {
            println("Depósito de R$$valor impossível de ser realizado!\n")
        }
    }

}