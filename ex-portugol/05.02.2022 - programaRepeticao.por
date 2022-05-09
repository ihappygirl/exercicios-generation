programa
{
	
	funcao inicio()
	{
		/*	
			Estruturas de Repetição

			Enquanto - repete o bloco enquanto a condição for verdadeira

				enquanto (condição){
					código que vai repetir enquanto for verdade
				}


			Faca...enquanto - executa o bloco pelo menos uma vez e repete enquanto a condição
			for verdadeira

				faca{
					código que vai ser executado pelo menos uma vez
				} enquanto(condição)


			Para - repete o código por meio de uma condição controlada por uma variável

				para (variavel de controle; condição; comportamento da variavel de controle){
					código que vai repetir enquanto for verdade
				}

				
		*/

		//Exemplo de enquanto
		/*inteiro num = 0

		enquanto (num <= 10){
			escreva("\nDigite um numero menor ou igual a 10: ")
			leia(num)
		}*/

		//Exemplo de faca...enquanto
		/*cadeia texto
		faca {
			escreva("\nExiste o Pete e o Repete. O Pete morreu, quem sobrou?\n")
			leia(texto)
		} enquanto (texto == "repete" ou texto == "Repete")
		*/

		//Exemplo de para
		inteiro num

		escreva("Digite um número para calcular a tabuada:\n")
		leia(num)

		para(inteiro contador = 1; contador <= 10; contador++){
			escreva("\n", num, "X", contador, " = ", num * contador)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */