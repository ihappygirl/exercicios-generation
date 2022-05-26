package clienteencaps

class ClienteCompra (private var nome: String) {

    private var endereco = ""
    private var telefone = ""
    private val listaCompras = mutableListOf<String>()

    init {
        if(nome == ""){
            throw Exception("Instanciou a classe errado! Nome está vazio.")
        }
    }

    // Constructor secundário - para atributos não-obrigatórios
    constructor(nome: String, endereco:String): this(nome){
        this.endereco = endereco
    }

    constructor(nome: String, endereco:String, telefone:String): this(nome, endereco){
        this.telefone = telefone
    }

    //métodos para adicionar, remover e listar os itens do atributo listaDeCompras
    fun addProd(prod:String){
        if (prod != ""){
            listaCompras.add(prod)
            println("Produto adicionado a lista com sucesso!")
        } else {
            println("Produto inválido.")
        }
    }

    fun removeProd(prod:String){
        if (listaCompras.contains(prod) && listaCompras.isNotEmpty()){
            listaCompras.remove(prod)
            println("Produto removido da lista com sucesso!")
        } else {
            println("Produto não existe na lista.")
        }
    }

    fun listaProd(){
        println("******* Lista de Compras *******")
        listaCompras.forEach{
            println(it)
        }
    }

    fun totalItens():Int{
        return listaCompras.size
    }

    fun taNaLista(item:String):Boolean{
        return listaCompras.contains(item)
    }

}