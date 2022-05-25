package heranca

/* Para indicar que a classe pode herdar do pai, reescrevemos o construtor primário do filho,
* instanciando a classe de onde vamos herdar, e quais os atributos DEVEMOS herdar dele, caso
* a classe pai tenha um construtor primário (temos que herdar todos). */

class EstudanteHeranca(nome: String, idade: Int, rg: String, var ra: String) : Pessoa(nome, idade, rg) {

    private var nota = 0.0

    //Métodos de Estudante
    fun mostrarNota() {
        println("A nota do estudante é: $nota.")
    }

    /* Sobrescrita de métodos (funciona para classes) - usar uma função existente, mas executando
    *  coisas diferentes quando ela for chamada. Para sobrescrever um método, eu preciso marcá-lo como OPEN.
    *  Onde eu vou sobrescrevê-lo, eu uso override fun funcaoSobrescrita(){}.
    *  Caso eu queira sobrescrever o método inteiro, eu oculto o super.nomeFuncao(){}.
    *  Caso contrário eu chamo super.nomeFuncao(){} antes de sobrescrever, que vai executar a funcao original
    *  primeiro.
    */
    override fun correr() {
        super.correr() // Executa a função que vou sobrescrever (em Pessoa -> correr())
        println("Correndo como um estudante.")
    }

    override fun toString(): String {
        return "Estudante $nome," +
                "\nde RA $ra," +
                "\nque tem a nota $nota."
    }

}