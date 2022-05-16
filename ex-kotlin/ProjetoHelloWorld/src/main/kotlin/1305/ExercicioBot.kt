fun main() {

    // val - constante
    // var - variavel

    println("Qual o seu nome?")
    val nome = readLine()

    /*
        readline por padrão lê e converte para String, por isso usamos
        .toInt() pra converter para inteiro, caso eu queira usar
        essa variável idade em outro lugar
    */
    println("Qual a sua idade?")
    val idade = readLine()!!.toInt()

    println("Qual o seu peso?")
    val peso = readLine()

    println("Qual a sua altura?")
    val altura = readLine()!!.toDouble()

    println("Seu nome: $nome")
    println("Idade: $idade")
    println("Peso: $peso")
    println("Altura: $altura")

    //mostrar o tipo da variável
    println("Tipo da variável altura: " + altura.javaClass.name)

}