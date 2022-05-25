import heranca.FuncHeranca

fun main() {

    /*
    * HERANÇA
    *
    * Herança - conseguir reutilizar código de classes pais dentro de classes filhas.
    * Herdar atributos de uma classe para outra.
    *
    * Exemplo que criamos:
    * Pessoa - Classe pai
    * Funcionário e Estudante - Classes filhas
    *
    */

    //Exemplo de Herança
    val func = FuncHeranca(
        "Mayara",
        21,
        "06654160",
        123,
        "Desenvolvedora"
    )

    func.corCabelo = "Preto"
    func.correr()
    func.mostrarSalario()
    func.mostrarCorCabelo()
    func.mostrarCorPele()

}
