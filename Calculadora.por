programa
{
	
	funcao inicio(){
		cadeia soma, divisao, subtracao, multiplicacao, a, d, d2
		real multiplicacao1, divisao1, soma1, subtracao1, b, c
		
		escreva("Escolha a opera��o desejada: \n\n")
		escreva("Digite (1) para soma: \n")
		escreva("Digite (2) para divis�o: \n")
		escreva("Digite (3) para subtra��o: \n")
		escreva("Digite (4) para multiplica��o: \n")
			leia(a)
			limpa()
		escreva("Insira o primeiro n�mero: ")
			leia(b)
			limpa()
		escreva("Insira o segundo n�mero: ")
			leia(c)
			limpa()
		
		soma1 = b + c
		divisao1 = b/c
		subtracao1 = b - c
		multiplicacao1 = b * c
		
		se(a=="1"){
			escreva("A soma �: ", soma1)
		}
		senao se(a=="2"){
			escreva("A divis�o �: ", divisao1)
		}
		senao se(a=="3"){
			escreva("A subtra��o �: ", subtracao1)
		}
		senao se(a=="4"){
			escreva("A multiplica��o �: ", multiplicacao1)
		}
		senao{
			escreva("Opera��o inv�lida")
		}
		escreva("\n\nPara repetir a opera��o digite 'R'ou  ")
		escreva("\ncaso n�o queira, clique em 'outra letra': ")
			leia(d)
		enquanto(d=="R" ou d=="r"){
			escreva("Escolha a opera��o desejada: \n\n")
		escreva("Digite (1) para soma: \n")
		escreva("Digite (2) para divis�o: \n")
		escreva("Digite (3) para subtra��o: \n")
		escreva("Digite (4) para multiplica��o: \n")
			leia(a)
			limpa()
		escreva("Insira o primeiro n�mero: ")
			leia(b)
			limpa()
		escreva("Insira o segundo n�mero: ")
			leia(c)
			limpa()
		
		soma1 = b + c
		divisao1 = b/c
		subtracao1 = b - c
		multiplicacao1 = b * c
		
		se(a=="1"){
			escreva("A soma �: ", soma1)
		}
		senao se(a=="2"){
			escreva("A divis�o �: ", divisao1)
		}
		senao se(a=="3"){
			escreva("A subtra��o �: ", subtracao1)
		}
		senao se(a=="4"){
			escreva("A multiplica��o �: ", multiplicacao1)
		}
		senao{
			escreva("Opera��o inv�lida")
		}
		escreva("\n\nPara repetir a opra��o digite 'R': ")
			leia(d)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1855; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */