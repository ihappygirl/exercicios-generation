import calculadoratestunit.Calc
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalcTest{

    @Test
    fun somaTest(){
        assertEquals(6.0, Calc.soma(1.0, 5.0))
    }

    @Test
    fun subtracaoTest(){
        assertEquals(15.0, Calc.subtracao(100.0, 85.0))
    }

    @Test
    fun multiplicacaoTest(){
        assertEquals(100.0, Calc.multiplicacao(10.0, 10.0))
    }

    @Test
    fun divisaoTest(){
        assertEquals(5.0, Calc.divisao(100.0, 20.0))
    }

    @Test
    fun potenciaTest(){
        assertEquals(125.0, Calc.potencia(5.0, 3.0))
    }

    @Test
    fun radiciacaoTest(){
        assertEquals(3.0, Calc.radiciacao(9.0))
    }


}