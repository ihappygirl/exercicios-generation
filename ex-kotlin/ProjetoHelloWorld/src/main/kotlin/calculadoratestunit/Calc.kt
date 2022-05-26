package calculadoratestunit

import kotlin.math.pow
import kotlin.math.sqrt

class Calc {

    companion object{

        fun soma(n1: Double, n2: Double): Double {
            return n1 + n2
        }

        fun subtracao(n1: Double, n2: Double): Double {
            return n1 - n2
        }

        fun multiplicacao(n1: Double, n2: Double): Double {
            return n1 * n2
        }

        fun divisao(n1: Double, n2: Double): Double {
            return n1 / n2
        }

        fun potencia(n1:Double, n2:Double): Double{
            return n1.pow(n2)
        }

        fun radiciacao(n1:Double):Double{
            return sqrt(n1)
        }


    }
}