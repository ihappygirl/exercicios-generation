package `2405`.encapsulamento

class Estudante (private var nome: String, private val ra:Int) {

    private var nota = 0.0
    private val listMateria = mutableListOf<String>()

    // Exceção para ver se declarou nome e ra
    /*init {
        if(nome == "" || ra <= 0){
            ///throw Exception("Instanciou a classe errado!!!!!!!!!!!!!!!!!!!")
        }
    }*/

    fun alterarNota(valor:Double){
        if(valor < 0 || valor > 10){
            println("Nota inválida.")
        } else {
            nota = valor
            println("Nota alterada com sucesso!")
        }
    }

    fun alterarNome(novoNome: String){
        if (novoNome != ""){
            nome = novoNome
            println("Nome alterado com sucesso!")
        } else {
            println("Nome inválido.")
        }
    }

    fun addMateria(materia: String){
        if (materia != ""){
            listMateria.add(materia)
            println("Matéria adicionada com sucesso!")
        } else {
            println("Matéria inválida.")
        }
    }

    fun mostrarMaterias(){
        listMateria.forEach{println(it)}
    }

    fun excluirMateria(materia: String){
        if (listMateria.contains(materia)){
            listMateria.remove((materia))
            println("Matéria excluida com sucesso!")
        } else {
            println("Matéria não existe na lista.")
        }
    }

}