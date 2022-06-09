class Pedido{

    private var pedido = mutableListOf<Any>()

    fun adicionarItem(item:Item, qtd:Int) {
        // Checar se o item já está adicionado ao Pedido e se sim, atualizar a quantidade
        if (pedido.contains(item.codigo)){
            val index = pedido.indexOf(item.codigo)
            pedido[index+3] = qtd // inserir a nova quantidade
            pedido[index+4] = item.valor * qtd // calcular o novo valor total
            println("A quantidade do item foi atualizada com sucesso!")
        } else {
            pedido.addAll(
                listOf(
                    item.codigo, item.nome, item.valor, qtd, (item.valor * qtd)
                )
            )
            println("Item adicionado com sucesso ao seu pedido!")
        }
        print(pedido)
    }

    fun somarPedido() : Double {
        var valorItem: String
        var valorTotal = 0.00

        for(i in 4 until pedido.size step 5){
            valorItem = pedido[i].toString()
            println(valorItem)
            valorTotal += valorItem.toFloat()
        }
        return valorTotal
    }

    fun listarPedido() {
        var numPedido = 0

        println("\n****** Pedido nº ${numPedido++} ******")
        pedido.forEach {
            println(it)
        }

    }
}







