programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		escreva("Exercício 02 - Calcular o valor do salário e das horas excedentes de um funcionário.\n\n")

		inteiro C, N, horasExcedentes
		real salario, E, salarioTotal

		escreva("Digite o código do operário: ")
		leia(C)

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(N)

		se (N > 50){
			horasExcedentes = N - 50 // calcula quantidade de horas extras
			
			salario = 50 * 10.00 // calcula salário base (pois trabalhou mais do que 50)

			E = horasExcedentes * 20.00 //calcula o valor da horas extras

			salarioTotal = salario + E // soma salario base e horas extras

			escreva(
				   "\nCódigo do operário: ", C,
				   "\nHoras Extras: R$", mat.arredondar(E, 2),
				   "\nValor total a receber: R$", mat.arredondar(salarioTotal, 2)
			)
			
		} senao {

			salario = N * 10.00 // calcula salario
			
			escreva(
				"\nCódigo do operário: ", C,
				"\nHoras Extras: R$0,00",
				"\nValor total a receber: R$", mat.arredondar(salario, 2)
			)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */