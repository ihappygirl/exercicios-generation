fun main() {
     /*
     * ESTRUTURAS CONDICIONAIS
     * Operadores relacionais
     * == - igual
     * != - diferente
     * > - maior
     * < - menor
     * >= - maior e igual
     * <= - menor e igual
     *
     * Operadores Lógicos
     * && - e
     * || - ou
     * ! - não
     *
     * Tabela Verdade
     * && - ficar triste só se os dois estiverem tristes
     * VV - true
     * FV - false
     * VF - false
     * FF - false
     *
     * || - ficar triste só se os dois estiverem tristes
     * VV - true
     * FV - true
     * VF - true
     * FF - false
     *
     * */

    // Comparando strings
    /* println("Seu nome é Mayara?")
    print("Resposta: ")
    val resp = readln()

    if (resp == "Sim" || resp == "sim"){
        println("Bem vinda <3")
    } else {
        println("Acesso negado.")
    }*/

    //Criação de senha
    /* println("Crie a sua senha:")
    val senha = readln()

    if (senha.length < 8){
        println("Senha inválida!")
    } else {
        println("Senha criada com sucesso!")
    }*/

    //Programa - Ver se o cliente tem desconto na compra
    //Compras menores que 50 = 0%
    //Compras entre 50 e 100 = 10%
    //Compras entre 101 e 200 = 20%
    //Compras acima de 200 = 30%
    //Mostrar o valor da compra do usuário já com desconto

    /* print("Informe o valor total da compra:")
    val compra = readln().toDouble()

    var desconto = 0.00

    /*
    * Ranges - comparar de um valor até outro
    * in valor..valor
    * */

    if(compra < 50.00){
        desconto = 0.0
    } else if (compra in 50.00..101.00){
        desconto = 0.1
    } else if (compra in 101.00..200.00){
        desconto = 0.2
    } else {
        desconto = 0.3
    }

    val compraDesconto = compra * desconto

    println("O valor total da compra, com ${desconto * 100}% de desconto, é de R$${compra - compraDesconto}.")

    */

    /*
    * when - quando um valor for tal, executar uma ação
    *
    * when (variável){
    *   condição 1 -> Código executado quando a variável for de um valor específico.
    *   condição 2 -> Código executado quando a variável for de um valor específico.
    *   ...
    *   else -> É o default do switch case. Executa algo caso todas as outras condições não sejam verdadeiras.
    * }
    *
    *

    // Exemplo usando when
    println("Digite um valor entre 1 e 12 para descobrir o mês correspondente: ")
    val mes = readln().toInt()

    when(mes){

        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else-> println("Valor inválido")

    }
    */

    // Exemplo usando range e blocos de código no when
    print("Digite um valor entre 1 e 12 para descobrir se o mês é frio ou quente: ")
    val mes = readln().toInt()

    when(mes){

        in 1..3 -> {
            println("Mês quente. (Verão)")
            println("Melhores meses.")
        }
        in 4..6 -> {
            println("Mês mais ou menos. (Outono)")
            println("Melhores meses.")
        }
        in 7..9 -> {
            println("Mês frio. (Inverno)")
            println("Melhores meses.")
        }
        in 10..12 -> {
            println("Mês com clima legal. (Primavera)")
            println("Melhores meses.")
        }
        else-> println("Valor inválido!")

    }






}