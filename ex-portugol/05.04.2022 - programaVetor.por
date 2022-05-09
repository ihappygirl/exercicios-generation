programa
{
	
	funcao inicio()
	{
		/*
		 * Vetor (array) - variáveis que armazenam muitos valores de tipo definido
		 * 
		 * Estrutura:
		 * tipo identificador[tamanho]
		 * inteiro vetor[10]
		 * ou
		 * inteiro vetor[] = {1, 2, 3, 4, 5}
		 * 
		 * Quando declaramos um vetor com tamanho, seu tamanho não pode ser alterado,
		 * somente os valores guardados dentro dele.
		 * 
		 * As posições dentro de um vetor são chamadas de INDEX.
		 * 
		 * 
		 * 
		*/

		//como inserir num array (forma errada)
		/*inteiro vetor[3]
		
		vetor[0] = 5
		vetor[1] = 15
		vetor[2] = 69

		escreva(vetor[0])
		*/


		//como inserir num array (forma correta)
		/*cadeia nomes[5]

		//para inserir no array
		para (inteiro i = 0; i < 5; i++){
			escreva("Digite um nome: ")
			leia(nomes[i])
		}

		//para mostrar na tela
		para (inteiro i = 0; i < 5; i++){
			escreva(nomes[i], "\n")
		}*/


		inteiro numeros[5], menorNumero

		para (inteiro i = 0; i < 5; i++){
			escreva("Digite um numero: ")
			leia(numeros[i])
		}

		menorNumero = numeros[0] 
		// atribui a menorNumero o valor da 1ª posição do array
		// pra podermos verificar os valores do array

		para (inteiro i = 0; i < 5; i++){

			// ve se o valor na posição i é menor que o valor atual de menorNumero
			// se sim, atribui o valor da posicao i a menorNumero e repete o loop e a verificação
			se (numeros[i] < menorNumero){
				menorNumero = numeros[i]
			}
		}

		escreva("O menor numero do vetor é: ", menorNumero)

		



		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */