programa
{
	
	funcao inicio()
	{
		/*

		FAÇA...ENQUANTO
		
		2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números de 1 até ele.
		Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		
		*/

		inteiro num = 0, soma = 0, i = 0

		escreva("Digite um numero para somarmos até ele:\n")
		leia(num)

		faca{
			i++ // soma +1 a i
			
			soma += i // soma + i
		} enquanto (i < num)
		
		escreva ("\nA soma dos numeros até ", num, " é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */