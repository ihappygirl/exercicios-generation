import `2405`.encapsulamento.Estudante

fun main () {
    /*
    * Companion Object - atributos e métodos acessados sem precisar instanciar uma classe.
    * Chamamos o que precisamos diretamente, sem precisar criar uma variável para isso desnecessariamente.
    *
    * Objetos anônimos - "Classe" que só vai criar apenas um objeto (uma instância).
    * Não aceita construtores, pois é um objeto só (não existindo outros dele).
    * Podemos movê-los para um pacote que precisa ser importado para uso (usar lá em cima como
    * import etc.etc.etc ou importar diretamente)
    *
    * Encapsulamento - deixar os dados protegidos estabelecendo tipos de privacidade de uma classe, variável ou método.
    *   1 - public - todos os atributos e métodos da classe serão publicos para qualquer arquivo (classe ou método, como
    *   o main ())
    *   2 - private - atributos ou métodos da classe serão privados para qualquer arquivo, ou seja, não poderão
    *   ser acessados.
    *
    * Exceção - soltar exceções personalizadas para casos como instanciar uma classe de forma errada.
    * Em cada classe, usar o método init(), que executa a cada instancia dela. Dentro de init(), colocar
    * as condições para que o erro aconteça e para mostrar o erro, usar throw Exception (mensagem).
    *
    * Try...Catch - método para tratarmos erros no nosso código, mas de forma amigável.
    *   try{
    *       código que nós tentaremos executar
    *   } catch() {
    *       código que executa caso aconteça um erro
    *   }
    * */

    // Companion Object
    /* objetokotlin.Calculadora.n1 = 5.0
    objetokotlin.Calculadora.n2 = 6.0
    objetokotlin.Calculadora.soma(1.0,2.0)
    */

    // Objeto anônimo
    /*println(objetokotlin.Estoque.nome)
    print("Digite um produto para jogar no estoque: ")
    val prod = readln()
    objetokotlin.Estoque.listProdutos.add(prod)
    objetokotlin.Estoque.mostrarLista()
    */

    // Encapsulamento
    /* val mayara = Estudante("Mayara", 1005)

    // Processo para alterar nota normalmente
    mayara.alterarNota(8.0)

    // Não é certo que o usuario tenha acesso a variavel nota desse jeito,
    // portanto usamos o encapsulamento para forçar que o usuário use alterarNota()
    // e não possa acessar nota
    // mayara.nota = -5.0

    print("Digite o novo nome: ")
    val novoNome = readln()
    mayara.alterarNome(novoNome)

    print("Digite a matéria: ")
    val materia = readln()
    mayara.alterarNome(materia)

    mayara.mostrarMaterias()

    print("Digite a matéria para excluir: ")
    val excMateria = readln()
    mayara.excluirMateria(excMateria)
    */

    // Exceção
    // val mayara = Estudante("Mayara", 0)

    // Try...Catch
    /*while (true) {
        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu RA: ")
        val ra = readln().toInt()

        try {
            val mayara = Estudante(nome, ra)
            break
        } catch (e: Exception) {
            println(e.message)
        }
    }*/

    // Exemplo do dia a dia com try...catch
    try {
        val idade = readln().toInt()
    } catch (e: Exception) {
        println(e.message)
    }





}







