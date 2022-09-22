package com.Lista04;
/*8. Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere uma senha para
o usuário. Para isto o usuário deve informar o tamanho da senha que deseja, este tamanho
deve ser menor que a quantidade de letras no vetor. A senha gerada deve seguir o padrão
consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
tamanhos ímpares.*/

import java.util.Scanner;
import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int tam;		
		char[] consoa = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vogal = {'a', 'e', 'i', 'o', 'u'};
		
		do {
			System.out.print("Informe o tamanho da senha: ");
			tam = entrada.nextInt();
			
			if(tam > 26) {
				System.out.println("Inválido. Informe menor igual que 26.");
			}
		}while(tam > 26);
		
		char[] senha = new char[tam];
		
		for( int i = 0; i < tam; i++) {
			
			if( (i % 2) == 0 ) {
				int x = random.nextInt(20);
				senha[i] = consoa[x];
			}else {
				int y = random.nextInt(4);
				senha[i] = vogal[y];
			}
			
		}
		
		System.out.println("Senha: ");
		for( int i = 0; i < tam; i++)
			System.out.print(senha[i]);
		
		entrada.close();

	}

}
