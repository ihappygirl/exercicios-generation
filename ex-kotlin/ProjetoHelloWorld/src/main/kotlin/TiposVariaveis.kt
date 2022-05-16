import java.util.*

fun main() {

    /*
    * Tipos de variáveis
    * var identificador: Tipo = valor
    *
    * Int - valores inteiros (1, 2, 3...).
    * Double - numeros reais (1.1, 2.2...).
    * Char - apenas um caracter (K, L, M...).
    * String - cadeia de caracteres (uma frase, um nome...). Representada por ""
    * Boolean - verdadeiro ou falso.
    *
    * */

    // Declaração padrão de variável:
    // var num: Int = 2
    // var num2: Double = 5.4

    // Type Inference
    // Não precisamos identificar qual o tipo da variável quando vamos declará-la.
    // O kotlin já consegue fazer isso automaticamente ao identificar o tipo através do valor que
    // a variável possui, por exemplo, quando vamos fazer uma leitura do input de dados do usuário.
    // As exceções são variáveis que não precisam ser inicializadas com algum tipo de valor.
    // var num3 = 2.63

    //Exemplo pratico do uso das variáveis
    /* var nome = "Mayara"
    var idade = 23
    var altura = 1.64
    var comidaFavorita = "churrasco"

    println("Oi $nome, você tem $idade anos, $altura de altura e sua comida favorita é $comidaFavorita!")

     */

    // Exemplo usando Scanner
    // precisa declarar primeiro uma variável do tipo Scanner,
    // para depois converter o valor do input para o tipo que vamos precisar
    // também é um método ruim, pois para usar o Scanner em outra função eu
    // precisaria torná-lo global
    /*var leitura = Scanner(System.`in`)

    print("Digite seu nome: ")
    var nome = leitura.next() //.next() retorna String

    print("Digite sua idade: ")
    var idade = leitura.nextInt() //.nextInt() retorna Int

    print("Digite sua altura: ")
    var altura = leitura.nextDouble() //.nextDouble() retorna Double

    println("Oi $nome, você tem $idade anos, $altura de altura.")

     */

    // Exemplo usando readLine() e readln()
    // precisa somente converter o valor do input para o tipo que vamos precisar
    // por padrão readLine() retorna um valor do tipo String? (que guarda String ou null),
    // já readln() retorna uma valor do tipo String, sem aceitar null

    // ? - define que algo poderá ter valor nulo
    // !! - define que algo não terá valor nulo

    /* print("Digite seu nome: ")
    var nome = readln()

    print("Digite sua idade: ")
    var idade = readln().toInt()

    print("Digite sua altura: ")
    var altura = readln().toDouble()

    println("Oi $nome, você tem $idade anos, $altura de altura.")

     */













}
