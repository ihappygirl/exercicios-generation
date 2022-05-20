fun main() {

    /*
    * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    * trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    * programa deverá atender as seguintes funcionalidades:
    *
    * Armazenar dados da List
    * Remover dados da list;
    * Atualizar dados da list.
    * Apresentar todos os dados da list.
    *
    * */

    var sair: String
    val listaProdutos = mutableListOf<String>()

    do {
        println("\n********* CONTROLE DE ESTOQUE *********")
        println("1- Cadastrar Produtos")
        println("2- Remover Produtos")
        println("3- Editar Produtos")
        println("4- Mostrar Todos os Produtos")
        println("********* CONTROLE DE ESTOQUE *********\n")

        print("Digite o número correspondente a ação que você quer fazer: ")
        val opcao = readln().toInt()

        when(opcao){
            1 -> { cadastrarProd(listaProdutos) }
            2 -> { removerProd(listaProdutos) }
            3 -> { editarProd(listaProdutos) }
            4 -> { mostrarTodosProdutos(listaProdutos) }
            else -> { print("\nOpção inválida.") }
        }
        print("\nDeseja fechar o programa (S/N)? ")
        sair = readln()

    } while (sair == "n" || sair == "N")
}


fun cadastrarProd(listaProdutos:MutableList<String>): MutableList<String> {
    while(true){
        print("Digite o nome dos produtos: ")
        val nomeProd = readln()

        if (nomeProd != "") {
            listaProdutos.add(nomeProd)
        } else { break }
    }
    return listaProdutos
}

fun removerProd(listaProdutos:MutableList<String>):MutableList<String>{
    // checar primeiro se a listaProdutos tá vazia
    if (listaProdutos.isEmpty()){
        println("Não existem produtos cadastrados para você poder remover.")
    } else {
        while(true){
            print("Digite um produto para deletar da lista: ")
            val nomeProd = readln()

            if(listaProdutos.contains(nomeProd) && nomeProd != ""){
                listaProdutos.remove(nomeProd)
                println("Produto deletado com sucesso!")
                break
            }else {
                println("O nome que você digitou não existe na lista.")
            }
        }
    }
    return listaProdutos
}

fun editarProd(listaProdutos:MutableList<String>):MutableList<String>{
    // checar primeiro se a listaProdutos tá vazia
    if (listaProdutos.isEmpty()){
        println("Não existem produtos cadastrados para você poder editar.")
    } else {
        while(true){

            print("Digite um produto para editar: ")
            val nomeProd = readln()

            if (listaProdutos.contains(nomeProd)) {
                val index = listaProdutos.indexOf(nomeProd)

                print("Digite o novo nome do produto: ")
                val novoNomeProd = readln()

                listaProdutos[index] = novoNomeProd
                println("O produto foi atualizado com sucesso!")

                break
            } else {
                println("O produto $nomeProd não existe na lista.")
            }
        }
    }
    return listaProdutos
}

fun mostrarTodosProdutos(listaProdutos:MutableList<String>): MutableList<String> {
    if (listaProdutos.isEmpty()){
        println("Não existem produtos cadastrados.")
    } else {
        println("****** Produtos Cadastrados: ******")
        listaProdutos.forEach{println(it)}
    }
    return listaProdutos
}