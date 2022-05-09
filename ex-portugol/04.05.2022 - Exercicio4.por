programa
{
	
	funcao inicio()
	{
		escreva("Exercício 04 - leia um número inteiro e indique 'é par ou impar' e 'é positivo ou negativo'.\n\n")

		inteiro n1

		escreva("Digite um número: ")
		leia(n1)

		se (n1 % 2 == 0){
			escreva("\nÉ um numero par.")
		} senao {
			escreva("\nÉ um numero impar.")
		}

		se (n1 > 0){
			escreva("\nÉ um numero positivo.")
		} senao se (n1 == 0){
			escreva("\nZero não é positivo nem negativo.")
		} senao {
			escreva("\nÉ um numero negativo.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */