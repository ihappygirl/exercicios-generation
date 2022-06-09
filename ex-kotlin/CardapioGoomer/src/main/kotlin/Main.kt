fun main() {

    /*
    * Liste os itens de um cardápio com (Código, nome e preço) e permita que o usuário selecione através do
    * código o item que ele quer. Na sequência, permita que o usuário escolha a quantidade de itens. Depois,
    * pergunte se o usuário deseja mais algum outro item, caso positivo, repetir o processo, senão, liste todos
    * os itens selecionados (Código, nome e preço) e pergunte ao usuário se ele confirma o pedido no valor
    * total de R$ X,XX? Caso positivo, mostrar a mensagem “Pedido enviado para a cozinha com sucesso!“,
    * senão, mostrar a mensagem ”Pedido cancelado”.
    * */

    val listaItens = mutableListOf(
        Item(1, "X-Burguer", 11.50),
        Item(2, "X-Salada", 12.50),
        Item(3, "X-Bacon", 13.00),
        Item(4, "X-Tudo", 16.00),
        Item(5, "Fritas Pequena (1 pessoa)", 6.00),
        Item(6, "Fritas Média (1 pessoa)", 7.50),
        Item(7, "Fritas Grande (1 pessoa)", 9.00),
        Item(8, "Coca Cola (600ml)", 7.00),
        Item(9, "Suco de Laranja", 8.50),
        Item(10, "Coca Cola (1l)", 11.00),
    )

    //Instanciar classe pedido uma unica vez
    val pedido = Pedido()

    while (true) {

        // Cardápio
        println("\n****** Maya's Burgers ******")
        println("Bem vindo ao Maya's Burgers! Este é o nosso cardápio: ")
        mostrarCardapio(listaItens)

        // Pegar código do item
        print("\nPor favor, digite o código do item que deseja: ")
        val cod = readln().toInt()

        // Pegar quantidade que deseja
        print("Quantos desse produto você deseja?: ")
        val qtd = readln().toInt()

        // Pegar as informações sobre o produto e retornar para item
        var item = pegarInfoItem(cod, listaItens)

        //Adicionar itens ao pedido
        pedido.adicionarItem(item, qtd)

        print("\nDeseja mais algum outro item? (S ou N): ")
        val voltarAoMenu = readln().uppercase()

        if (voltarAoMenu == "N"){
            //pedido.listarPedido()
            pedido.somarPedido()
            println("Você confirma o pedido no valor total de R$300,00? (S/N)")
            val confirmar = readln().uppercase()

            if (confirmar == "S"){
                println("Pedido enviado para a cozinha com sucesso!")
            } else {
                println("Pedido cancelado.")
            }
        }
    }
}

// listar itens do cardápio
fun mostrarCardapio(listaItens: MutableList<Item>) {
    listaItens.forEach {
        println("${it.codigo} - ${it.nome} - ${it.valor}")
    }
}

// pegar informações de um item só através do código digitado
fun pegarInfoItem(codigo: Int, listaItens: MutableList<Item>): Item {
    var item = listaItens[codigo - 1]
    return item
}




