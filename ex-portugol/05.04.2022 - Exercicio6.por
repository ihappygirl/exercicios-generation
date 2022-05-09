programa
{
	
	funcao inicio()
	{
		/*

		PARA
		
		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três
		e que se encontram no conjunto dos números de 1 até 500.
		
		*/

		inteiro soma = 0, i

		para (i = 1; i <= 500; i++){
			
			// É IMPAR E MULTIPLO DE 03?
               se (i % 2 != 0 e i % 3 == 0){
				soma +=i
                } 
		}
		
		escreva("\nA soma de todos os números ímpares multiplos de 03 de 1 até 500 é: ", soma, "\n\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */