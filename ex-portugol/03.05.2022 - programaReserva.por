programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia servico
		inteiro dia
		cadeia horario
		cadeia formaPagamento

		// mensagem de boas vindas
		escreva("\n************************************************************************************")
		escreva("\n***   Olá, eu sou a Maya, vou te ajudar no agendamento aqui no salão Fiqbella!   ***")
		escreva("\n************************************************************************************\n")

		// solicitar nome
		escreva("\nZoe: Por favor, digite o nome completo de quem vai reservar:\n")
		leia(nome)

		// solicitar nome do serviço que quer fazer
		escreva("\nZoe: Neste mês de maio temos os seguintes serviços disponíveis:",
				"\n**************************",
				"\n** Manicure e Pedicure  **",
				"\n** Corte e Finalização  **",
				"\n** Progressiva e Escova **",
				"\n** Tintura              **",
				"\n**************************",
				"\nQual(is) o(s) serviço(s) que deseja agendar? (pode escrever mais de um)\n"
			   )
		leia(servico)

		// qual o dia para agendar?
		escreva("\nZoe: Qual o dia do mês de maio que você quer agendar o procedimento?\n")
		leia(dia)

		// qual o horário para agendar?
		escreva("\nZoe: No dia ", dia, ", temos os seguintes horários:",
				"\n***********",
				"\n** 09h35 **",
				"\n** 10h45 **",
				"\n** 12h00 **",
				"\n** 13h30 **",
				"\n** 14h55 **",
				"\n** 16h00 **",
				"\n** 17h20 **",
				"\n***********",
				"\nQual o horário que deseja agendar?\n"
			  )
		leia(horario)

		// qual a forma de pagamento?
		escreva("\nZoe: Temos as formas de pagamento abaixo:",
				"\n**********************",
				"\n** Pix              **",
				"\n** Débito/Crédito   **",
				"\n** Dinheiro físico  **",
				"\n**********************",
				"\nQual será a forma de pagamento?\n"
			  )
		leia(formaPagamento)

		// mensagem de agendado com sucesso
		escreva("\n\n*************************************************************")
		escreva("\n***           Agendamento marcado com sucesso!            ***")
		escreva("\n***       O salão Fiqbella agradece a preferência! :)     ***")
		escreva("\n*************************************************************")

		// resumo do agendamento
		escreva("\n\n****************   Resumo do Agendamento    *****************")
		escreva("\nCliente: ", nome)
		escreva("\nServiço(s) agendado(s): ", servico)
		escreva("\nDia: ", dia, "/05/2022")
		escreva("\nHorário: ", horario)
		escreva("\nForma de Pagamento: ", formaPagamento)
		escreva("\n*************************************************************\n\n\n\n\n")


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */