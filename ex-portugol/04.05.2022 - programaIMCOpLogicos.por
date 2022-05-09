programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, altura, resultadoIMC, imcArredondado

		// solicita o peso
		escreva("Digite o peso: ")
		leia(peso)

		//solicita a altura
		escreva("Digite a altura: ")
		leia(altura)

		// faz o cálculo do IMC
    	     resultadoIMC = peso / (altura * altura)
    	     imcArredondado = mat.arredondar(resultadoIMC, 1)

    	    // verificações de IMC
    	    se (resultadoIMC < 18.5){
    	    		escreva ("Seu IMC é ", imcArredondado, ", ABAIXO DO NORMAL.")
    	    } senao se (resultadoIMC >= 18.5 e resultadoIMC < 25){
    	    		escreva ("Seu IMC é ", imcArredondado, ", NORMAL.")
    	    } senao se (resultadoIMC >= 25 e resultadoIMC < 30){
    	    		escreva ("Seu IMC é ", imcArredondado, ", SOBREPESO.")
    	    } senao se (resultadoIMC >= 30 e resultadoIMC < 40){
    	    		escreva ("Seu IMC é ", imcArredondado, ", OBESIDADE.")
    	    } senao {
    	     	escreva ("Seu IMC é ", imcArredondado, ", OBESIDADE GRAVE.")
    	    }
    	    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */