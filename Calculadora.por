programa
{
	
	funcao inicio(){
		cadeia soma, divisao, subtracao, multiplicacao, a, d, d2
		real multiplicacao1, divisao1, soma1, subtracao1, b, c
		
		escreva("Escolha a operação desejada: \n\n")
		escreva("Digite (1) para soma: \n")
		escreva("Digite (2) para divisão: \n")
		escreva("Digite (3) para subtração: \n")
		escreva("Digite (4) para multiplicação: \n")
			leia(a)
			limpa()
		escreva("Insira o primeiro número: ")
			leia(b)
			limpa()
		escreva("Insira o segundo número: ")
			leia(c)
			limpa()
		
		soma1 = b + c
		divisao1 = b/c
		subtracao1 = b - c
		multiplicacao1 = b * c
		
		se(a=="1"){
			escreva("A soma é: ", soma1)
		}
		senao se(a=="2"){
			escreva("A divisão é: ", divisao1)
		}
		senao se(a=="3"){
			escreva("A subtração é: ", subtracao1)
		}
		senao se(a=="4"){
			escreva("A multiplicação é: ", multiplicacao1)
		}
		senao{
			escreva("Operação inválida")
		}
		escreva("\n\nPara repetir a operação digite 'R'ou  ")
		escreva("\ncaso não queira, clique em 'outra letra': ")
			leia(d)
		enquanto(d=="R" ou d=="r"){
			escreva("Escolha a operação desejada: \n\n")
		escreva("Digite (1) para soma: \n")
		escreva("Digite (2) para divisão: \n")
		escreva("Digite (3) para subtração: \n")
		escreva("Digite (4) para multiplicação: \n")
			leia(a)
			limpa()
		escreva("Insira o primeiro número: ")
			leia(b)
			limpa()
		escreva("Insira o segundo número: ")
			leia(c)
			limpa()
		
		soma1 = b + c
		divisao1 = b/c
		subtracao1 = b - c
		multiplicacao1 = b * c
		
		se(a=="1"){
			escreva("A soma é: ", soma1)
		}
		senao se(a=="2"){
			escreva("A divisão é: ", divisao1)
		}
		senao se(a=="3"){
			escreva("A subtração é: ", subtracao1)
		}
		senao se(a=="4"){
			escreva("A multiplicação é: ", multiplicacao1)
		}
		senao{
			escreva("Operação inválida")
		}
		escreva("\n\nPara repetir a opração digite 'R': ")
			leia(d)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1855; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */