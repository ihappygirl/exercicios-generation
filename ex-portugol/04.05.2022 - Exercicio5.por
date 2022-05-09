programa
{
	
	funcao inicio()
	{
		real indice

		escreva("Digite o índice de poluição: ")
		leia(indice)

		se (indice < 0.3){
			escreva("\nTodas as industrias continuam trabalhando.")
		} senao se (indice >= 0.3 e indice < 0.4){
			escreva("\nGrupo 01 - Suspenda as atividades.")
		} senao se (indice >= 0.4 e indice < 0.5){
			escreva("\nGrupo 01 e Grupo 02 - Suspendam as atividades.")
		} senao {
			escreva("\nTodos os grupos - Suspendam as atividades.")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */