programa
{
	
	funcao inicio()
	{
		escreva("Exercício 03 - Ler 04 números e mostrar seus quadrados\n\n")

		inteiro n1, n2, n3, n4, q1, q2, q3, q4

		escreva("Digite o 1º número: ")
		leia(n1)

		escreva("Digite o 2º número: ")
		leia(n2)

		escreva("Digite o 3º número: ")
		leia(n3)

		escreva("Digite o 4º número: ")
		leia(n4)

		q1 = n1 * n1
		q2 = n2 * n2
		q3 = n3 * n3
		q4 = n4 * n4

		se (q3 >= 1000){
			escreva("\nO valor do quadrado do 3º numero é: ", q3)
		} senao {
			escreva("\nO valor do quadrado do 1º numero é: ", q1,
				   "\nO valor do quadrado do 2º numero é: ", q2,
				   "\nO valor do quadrado do 3º numero é: ", q3,
				   "\nO valor do quadrado do 4º numero é: ", q4
			)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */