import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    println("Qual o peso?")
    val peso = readLine()!!.toDouble()

    println("Qual a altura?")
    val altura = readLine()!!.toDouble()

    val imc = peso / (altura.pow(2)) //ou altura*altura

    println("O seu imc é: $imc.")

    //"%.4f".format(nomevariavel) para arredondar o imc
    println("Arredondando com format direto no print: " + "%.2f".format(imc))

    //usar format atribuindo a uma variável
    val imcF = "%.2f".format(imc)
    println("Arredondando com format(), mas atribuido a uma val: $imcF")

    //Math.round(nomevariavel) para arredondar o imc
    println("Arredondando com roundToInt(): " + imc.roundToInt())

    if(imc < 18.50){
        println("Abaixo do normal.")
    } else if(imc > 18.50 && imc <= 24.99){
        println("Normal.")
    } else if(imc > 25 && imc <= 29.99){
        println("Sobrepeso.")
    } else if(imc > 30 && imc <= 39.99){
        println("Obesidade Tipo 1.")
    } else{
        println("Obesidade Tipo 2.")
    }

}