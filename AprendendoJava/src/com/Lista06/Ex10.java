/*10. Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes
de tirar este Ponto novamente.*/

package com.Lista06;

import java.util.Scanner;
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean controle = true;
		int cont=0, soma=0, ponto=0;
		
		
		while(controle) {
			cont++;
			
			System.out.print("Enter para jogar dados... ");
			entrada.nextLine();
			soma = jogaDados();
			System.out.println("\nSoma dos dados: " + soma);
	
			if(cont == 1 && (soma == 7 || soma == 11)) {
				System.out.println("Você ganhou!!! É um natural...");
				controle = false;
			}else if(cont == 1 && (soma == 2 || soma == 3 || soma == 12)){
				System.out.println("Você perdeu!!! É um Craps...");
				controle = false;
			}else if(cont == 1 && (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10)){
				System.out.println("Este é o seu Ponto: " + soma);
				ponto = soma;
			}else if(cont != 1 && soma == 7) {
				System.out.println("Você perdeu!!! Tirou um sete...");
				controle = false;
			}else if(cont != 1 && soma == ponto) {
				System.out.println("Você ganhou! Tirou um número igual ao da primeira rodada...");
				controle = false;
			}else {
				System.out.println("Jogando o dado novamente...");
			}
		}
		
		entrada.close();
	}
	
	public static int jogaDados() {
		Random random = new Random();
		int x, y;		
		x = random.nextInt(6) + 1;
		y = random.nextInt(6) + 1;
		
		return x+y;		
	}

}
