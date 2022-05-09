programa
{
	
	funcao inicio()
	{
		/*
		 * ENQUANTO
		 * 
		 * 2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três 
		 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5, 
		 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
		 * 
		*/

		real num, result

		escreva("Digite um número: \n")
		leia(num)

		escreva("\n", num)
		
		result = num // criei uma variável pra guardar o resultado da multiplicação
		
		enquanto (result < 100){
			result = result * 3 // multiplico o valor antigo de result por 3 para obter um novo result
			escreva("\n",result)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */