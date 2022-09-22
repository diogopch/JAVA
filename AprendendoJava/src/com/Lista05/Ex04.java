package com.Lista05;
/*4. Nas Olimpíadas do IFC estão ocorrendo várias competições, entre elas salto em
distância, nesta competição cada atleta tem direito a cinco saltos, para valorizar o atleta
mais constante é feita a média dos saltos, desprezando o pior salto. Você foi contratado para
implementar um sistema que fará o controle desta competição, utilizando o recurso de Matriz,
resolva os itens abaixo:

• Solicitar os cinco saltos de cada atleta;
• Após o atleta saltar mostrar a média;
• Permitir a utilização do sistema por N atletas (informado no inicio da aplicação);
• Ao final, ou seja, após os N atletas digitarem os saltos o programa deve mostrar:
• Saltos de cada atleta, seguidos de sua média;
• A média dos saltos do campeão e do último lugar;*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n=0;
		
		System.out.print("Informe a quantidade de competidores: ");
		n = entrada.nextInt();
		
		float[][] salto = new float[n][5];
		float[] pior_salto = new float[n];
		float[] media = new float[n];
		String[] atleta = new String[n];
		float soma=0, media_camp=0, media_perd=0;
		String campeao="", perdedor="";
		
		for(int i = 0; i < n; i++) {
			entrada.nextLine();
			System.out.print("Nome do atleta: ");
			atleta[i] = entrada.nextLine();
			
			pior_salto[i]=0;
			soma = 0;
			
			for(int j = 0; j < 5; j++) {
				System.out.print("Informe o " + (j+1) +"º salto: ");
				salto[i][j] = entrada.nextFloat();
				
				soma = soma + salto[i][j];
				
				if(j == 0) {
					pior_salto[i] = salto[i][j];
				}else if(salto[i][j] < pior_salto[i]) {
					pior_salto[i] = salto[i][j];
				}
			}
			
			media[i] = (soma - pior_salto[i]) / 4;
			System.out.println("Media: " + media[i]);
			
			if(i == 0) {
				media_camp = media[i];
				media_perd = media[i];
				campeao = atleta[i];
				perdedor = atleta[i];
			}else if(media[i] > media_camp) {
				media_camp = media[i];
				campeao = atleta[i];
			}else if(media[i] < media_perd) {
				media_perd = media[i];
				perdedor = atleta[i];
			}
			
		}
		
		System.out.println("\n\n");
		for(int i = 0; i < n; i++) {	
			System.out.print("Atleta: " + atleta[i] + " \nSaltos: ");
			for(int j = 0; j < 5; j++) {
				System.out.print(salto[i][j] + " | ");
			}
			System.out.println("Salto desconsiderado: " + pior_salto[i]);
			System.out.println("Média: " + media[i]);
		}
		
		System.out.println("Campeão: " + campeao + " com media: " + media_camp);
		System.out.println("Perdedor: " + perdedor + " com media: " + media_perd);
		
		entrada.close();
	}

}
