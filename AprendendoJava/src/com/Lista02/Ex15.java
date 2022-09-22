package com.Lista02;
/*15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
um código de origem, emita o preço junto de sua procedência. Caso o código não seja
nenhum dos especificados, o produto deve ser classificado como importado. Código de
origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.*/

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		float preco;
		int cod;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o preço: ");
		preco = entrada.nextFloat();
		System.out.println("Informe o código: ");
		cod = entrada.nextInt();
		
		System.out.println("Preço: R$ "+preco);
		switch(cod) {
		case 1:
			System.out.println("Sul");
		break;
		case 2:
			System.out.println("Norte");
		break;
		case 3:
			System.out.println("Leste");
		break;
		case 4:
			System.out.println("Oeste");
		break;
		case 5:
		case 6:
			System.out.println("Nordeste");
		break;
		case 7:
		case 8:
			System.out.println("Centro-oeste");
		break;
		default:
			System.out.println("Importado");
		}
		
		
		entrada.close();

	}

}
