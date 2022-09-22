package com.Lista03;
/*37. Desenvolver um programa para verificar a nota do aluno em uma prova com 10
questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final
comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1

ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se
outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
a. Maior e Menor Acerto;
b. Total de Alunos que utilizaram o sistema;
c. A Média das Notas da Turma.
Gabarito da Prova:
01  A
02  B
03  C
04  D
05  E
06  E
07  D
08  C
09  B
10  A

Após concluir isto você poderia incrementar o programa permitindo que o professor digite o
gabarito da prova antes dos alunos usarem o programa.*/

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char[] gab = new char[11];
		int op, nota, cont=0, maior=0, menor=0, soma=0;
		char resp;
		
		System.out.println("Para uso do professor - Informe o gabarito: ");
		for(int i=1; i<=10; i++) {
			System.out.print("Informe a resposta da "+i+"ª questão: ");
			gab[i] = entrada.nextLine().charAt(0);
		}
		
		do {
			System.out.println("Para uso dos alunos: Informe as respostas: ");
			cont++;
			nota=0;
			for(int i=1; i<=10; i++) {
				
				System.out.print("Questão "+i+" : ");
				resp = entrada.nextLine().charAt(0);
				if(resp == gab[i]) {
					nota++;
				}
			}
						
			System.out.println("Total de acertos: "+nota);
			
			if(cont == 1) {
				maior=nota;
				menor=nota;
			}else if(nota > maior) {
				maior=nota;
			}else if(nota < menor) {
				menor=nota;
			}
			
			soma=soma+nota;
			
			System.out.println("Mais algum aluno: 1 para não  2 para sim: ");
			op = entrada.nextInt();
			
		}while(op != 1);
		
		System.out.println("Maior nota: "+maior+"\n Menor nota: "+menor);
		System.out.println("Total de alunos: "+cont);
		System.out.println("Media turma: "+(soma/cont));
		
		
		entrada.close();

	}

}
