import clienteencaps.ClienteCompra
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteCompraTest {

    /*
    * TESTE UNITÁRIOS
    *
    * @Teste - indica que a função abaixo será um teste unitário.
    * Asserts -  Vão verificar o que o método precisa retornar para o teste ser validado.
    *
    * */

    val clienteTest = ClienteCompra("Mayara")

    @Test
    fun totalItensTest() {
        assertEquals(0, clienteTest.totalItens())
    }

    @Test
    fun addProdTest() {
        clienteTest.addProd("Toddy")
        clienteTest.addProd("Macarrão")
        clienteTest.addProd("Papinha")

        // verificar se o size do array listaCompras aumenta em 3
        assertEquals(3, clienteTest.totalItens())
        // se retornar true, de que o toddy ta na lista, o teste passa
        assertTrue(clienteTest.taNaLista("Toddy"))
    }

    @Test
    fun removeProdTest() {
        clienteTest.addProd("Toddy")
        clienteTest.addProd("Macarrão")
        clienteTest.addProd("Papinha")

        clienteTest.removeProd("Macarrão")

        // se retornar false, de que o macarrão não ta na lista, o teste passa
        assertFalse(clienteTest.taNaLista("Macarrão"))
        // verificar se o size do array listaCompras diminui para 2
        assertEquals(2, clienteTest.totalItens())

    }


}