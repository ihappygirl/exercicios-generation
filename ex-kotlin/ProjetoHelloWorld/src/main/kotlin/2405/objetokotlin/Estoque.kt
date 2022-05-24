package `2405`.objetokotlin

object Estoque{
    val nome = "`objetokotlin`.Estoque da Loja do Joshua"
    var listProdutos = mutableListOf<String>()

    fun mostrarLista(){
        listProdutos.forEach{ println(it)}
    }
}