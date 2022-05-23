fun main() {


    /*
    * Collections - variáveis que armazenam mais de um valor.
    * Principais tipos collections: Array, List, Set, Map.
    * */

    /*
    * Array - armazena mais de um valor e tem tamanho fixo.
    *
    * Estrutura
    *    val num = arrayOf(valores)
    * */

    //Exemplo usando arrays
    /* val num = arrayOf(5, 7, 9, 11)

    // printar um valor especifico do array
    println(num[1])

    //substituir um valor especifico do array manualmente
    num[2] = 8

    // iterar num array: forma 1 (for) - usar com range
    for (i in 0..3){
        println(num[i]) // tenho que declarar aqui qual array e qual posição eu quero usar
    }

    // iterar num array: forma 2 (for) - pega o array como um só e itera nos seus valores
    for (i in num){
        println(i)
    }

    // iterar num array: forma 3 (for each) - possui um auxiliar diferente (it),
    // pega o array como um só e itera nos seus valores
    num.forEach {
        println(it)
    }

    // cria um array de tamanho fixo e de valores nulos, que vou declarar depois
    val nomes = arrayOfNulls<String>(10)
    */

    /*
    * List - lista valores tendo um tamanho variável.
    *   Lista Imutável - não podemos mudar os valores internos nem o tamanho
    *   MutableList - podemos alterar os valores internos e o tamanho.
    * */

    // Exemplo de Lista Imutavel
    /*val nomes = listOf("Mayara", "Guilherme")

    // para printar, não precisamos usar o for para iterar, nem definir qual a posição que quero mostrar
    // (somente se eu precisar)
    println(nomes)
    */

    // Exemplo de Lista Mutável
    /* val nomes = mutableListOf<String>()

    while (true) {
        print("Digite alguns nomes:")
        val valor = readln()

        //exemplo add - Adicionar itens a mutableList
        if (valor != "") {

            nomes.add(valor)
        } else {
            break
        }
    }
    println("\nO tamanho da lista é: ${nomes.size}")
    println(nomes)

    // Exemplo remove - exclui um item da lista
    // Exemplo contains - verifica se um valor existe na lista
    while(true){
        print("\nDigite um nome para deletar da lista: ")
        val valor = readln()

        if (nomes.contains(valor)) {
            nomes.remove(valor)
            break
        } else {
            println("O nome que você digitou não existe na lista.")
        }
    }

    println("\nO tamanho da lista é: ${nomes.size}")
    println(nomes)

    // Exemplo indexOf - mostra a posição do item com base em seu valor
    print("Digite um nome que você queira editar: ")
    val edit = readln()

    if (nomes.contains(edit)) {
        val index = nomes.indexOf(edit)

        print("Digite o novo nome: ")
        val valor = readln()
        nomes[index] = valor
        println("O nome foi atualizado com sucesso!")
    } else {
        println("O nome $edit não existe na lista.")
    }

    println("\nO tamanho da lista é: ${nomes.size}")
    println(nomes)

     */

    /*
    * Set - faz o mesmo que o list, mas ignora valores duplicados.
    *
    * Set - Imutável
    * MutableSet - Mutável
    *
    * */

    // Exemplo de Set Imutável
    /*val num = setOf(1,2,3,3,4,2)

    println(num.size)
    println(num)

    // Exemplo de Set Mutável
    val num2 = mutableSetOf(1,2,3,3,4,2)

    println(num2.size)
    println(num2)
    */

    /*
    * Map (dicionario) - através de um par de valores ele consegue armazenar os dados.
    * Construido através de chave e valor.
    *
    * Pair<K,V> -> Key e Value.
    *
    * Map - Imutável
    * MutableMap - Mutável
    *
    *
    *
    * */

    val usuarios = mutableMapOf(
        36 to "Henrique",
        55 to "Mayara"
    )

    // Iterar sobre os valores de Map
    usuarios.forEach(){
        println("${it.key} - ${it.value}")
        // mudar o nome de it
        // valores -> println("${valores.key} - ${valores.value}")
    }

    // Exemplo de map
    val usuarios2 = mutableMapOf<Int,String>()

    println("Digite um id para o usuário: ")
    val id = readln().toInt()
    println("Digite um nome para o usuário: ")
    val user = readln()

    // Adicionar valores ao map
    usuarios2[id] = user

    println(usuarios2)

    // somente posso remover um valor pela chave, pois podemos ter mais de um valor igual dentro de um map
    usuarios2.remove(50)
    // checar se um map possui tal chave (caso não possa ter key repetida)
    usuarios2.containsKey(50)
    // checar se um map possui tal valor (caso não possa ter value repetida)
    usuarios2.containsValue("Guilherme")



    /*fun main() {


        /*for(i in 1..100){

            if (i % 3 == 0 && i % 5 == 0){

                print("Fizzbuzz, ")

            } else if (i % 3 == 0){

                print("Fizz, ")

            } else if (i % 5 == 0) {

                print("Buzz, ")

            } else { print("$i, ") }

        } */

        /*print("Digite uma operação: ")
        val texto = readln()

        when (texto) {
            "+", "soma" -> print("Você digitou + ou soma!")
            "-", "subtração" -> print("Você digitou - ou subtração!")
        }*/


        /*val codigo = mutableListOf(1,2,3,4)
        val nome = mutableListOf("Pastel", "Coxinha", "Marmita", "Suco")

        val tam = codigo.size - 1
        // codigo.size -1 pq o tamanho é calculado a partir de 1 e não de 0

        for (i in 0..tam){
            print("${codigo[i]} - ")
            print("${nome[i]} \n")
        }

        */






    }*/



}
