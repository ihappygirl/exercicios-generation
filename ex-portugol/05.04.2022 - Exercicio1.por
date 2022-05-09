programa
{
	
	funcao inicio()
	{
		
		/*
		 * ENQUANTO
		 * 
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final
		 * o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos
		 * valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar
		 * quando o usuário fornecer um valor negativo.
		 * 
		*/
		
		real num = 0.0, i = 0, soma = 0.0, media = 0.0

		enquanto (num >= 0){
			escreva("\n\nDigite um numero:\n")
			leia(num)

			se (num >= 0) {
				i++ // contar quantos numeros eu digitei
				soma += num // fazer a soma dos valores digitados
				media = soma / i // calcular a media

				escreva("\nA soma até agora é: ", soma)
				escreva("\nA quantidade de números digitados até agora é de: ",i)
				escreva("\nA média dos números digitados até agora é de: ", media)
				
			} senao {
				escreva("\nVocê digitou um valor negativo. O programa teve que fechar.")
			}

		} 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */