programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Exercício 01 - Calcular o valor e o peso de tomates excedentes.\n\n")

		real P, E, M

		escreva("Digite o peso total dos tomates: ")
		leia(P)

		se (P > 50.00){
			E = P - 50 // calcula o peso excedente
			M = E * 4 // calcula o valor da multa
			escreva("O peso total dos tomates é de: ", P, " kg",
				   "\nGerou um peso a mais de: ", mat.arredondar(E, 2), " kg",
				   "\nGerou uma multa no valor de: R$", mat.arredondar(M, 2)
			)
			
		} senao {
			escreva("O peso total dos tomates é de: ", P, " kg",
				   "\nGerou um peso a mais de: 0 kg",
				   "\nGerou uma multa no valor de: R$0,00\n\n\n"
			)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */