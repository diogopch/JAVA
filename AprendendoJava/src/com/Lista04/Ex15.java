package com.Lista04;
/*15. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
(inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
e 1)
4: ####
2:##
1:#*/

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int N = 5;
		int[] vet = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			do {
				System.out.print("Informe um número entre 0 e 20: ");
				vet[i] = entrada.nextInt();
				
				if((vet[i] < 0) || (vet[i] > 20)) {
					System.out.println("Errado. Digite novamente....\n");
				}
			}while((vet[i] < 0) || (vet[i] > 20));
			
		}
		
		for(int i = 0; i < N; i++) {
			
			System.out.print("\n" + vet[i] + ": ");
			for(int j = 0; j < vet[i]; j++)
				System.out.print("#");
			
		}
		
		
		entrada.close();

	}

}
