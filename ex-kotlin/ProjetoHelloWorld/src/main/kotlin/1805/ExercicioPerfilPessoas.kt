fun main() {
    /*
    * 4- Uma empresa desenvolveu uma pesquisa para saber as características
    * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    * pessoas, calcule e mostre: (WHILE)
    *   o número de pessoas calmas;
    *   o número de mulheres nervosas;
    *   o número de homens agressivos;
    *   o número de outros calmos;
    *   o número de pessoas nervosas com mais de 40 anos;
    *   o número de pessoas calmas com menos de 18 anos.
    *
    * ex: 17 / Outros / Calmo
    * ex: 17 / Fem / Calmo
    * ex: 40 / Masc / Calmo
    * */

    // Contador
    var qtdPessoa = 0

    var calmos = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outros = 0
    var mais40 = 0
    var menos18 = 0


    while (qtdPessoa < 3) {

        print("\nDigite a idade: ")
        val idade = readln().toInt()
        print("Sexo: (1- Feminino / 2- Masculino / 3- Outros): ")
        val sexo = readln().toInt()
        print("Perfil psicológico (1- Pessoa calma / 2- Pessoa nervosa / 3- Pessoa agressiva):")
        val perfilPsi = readln().toInt()

        when (perfilPsi) {
            1 -> {
                calmos++
                if (idade <= 18) menos18++
                if (sexo == 3) outros++
            }
            2 -> {
                if (idade >= 40) mais40++
                if (sexo == 1) mulheresNervosas++
            }
            3 -> {
                if (sexo == 2) homensAgressivos++
            }
        }
        qtdPessoa++
    }

    println("\n--- DADOS ---")
    println("Número de pessoas calmas   : $calmos")
    println("Número de mulheres nervosas: $mulheresNervosas")
    println("Número de homens agressivos: $homensAgressivos")
    println("Número de outros calmos: $outros")
    println("Número de pessoas nervosas com mais de 40 anos: $mais40")
    println("Número de pessoas calmas com menos de 18 anos: $menos18")
}
