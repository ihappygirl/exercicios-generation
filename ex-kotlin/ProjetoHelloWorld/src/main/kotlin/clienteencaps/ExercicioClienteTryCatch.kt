import clienteencaps.ClienteCompra

fun main() {
    /*
    * Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos
    * mais duas opções de construtores conforme sua percepção, com os atributos: nome (String),
    * endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    * A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    * Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    * Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try...catch.
    *
    * */

    println("******* Lojinha da Maya *******")

    while (true){

        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu endereço: ")
        val end = readln()

        print("Digite o seu telefone: ")
        val tel = readln()

        try {
            val cliente = ClienteCompra(nome, end, tel)

            while(true){
                println("\n********* Menu *********")
                println("1 - Adicionar Produtos")
                println("2 - Remover Produtos")
                println("3 - Mostrar Lista de Compras")
                println("0 - Sair")

                print("Digite a opção desejada: ")
                val opcao = readln().toInt()

                when(opcao){
                    1 -> {
                        print("Digite o nome do produto: ")
                        val prod = readln()
                        cliente.addProd(prod)
                    }
                    2 -> {
                        cliente.listaProd()
                        print("\nDigite o nome do produto que deseja remover da lista: ")
                        val removerProd = readln()
                        cliente.removeProd(removerProd)
                    }
                    3 -> {
                        cliente.listaProd()
                    }
                    0 -> break
                    else -> println("Valor inválido.")
                }
            }
            break

        } catch (e: Exception) {
            println(e.message)
        }
    }

}

