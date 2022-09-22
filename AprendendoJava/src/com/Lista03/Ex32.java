package com.Lista03;
/*32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
de trânsito. Foram obtidos os seguintes dados:
a. Código da cidade;
b. Número de veículos de passeio (em 1999);
c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
e. Qual a média de veículos nas cinco cidades juntas;
f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.*/

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod, car, acid, maior_acid=0, cod_maior=0, menor_acid=0, cod_menor=0;
		int soma_car=0, soma_acid=0, cont=0;
		
		for(int i=1; i<=5; i++) {
			
			System.out.print("Informe o cód da cidade: ");
			cod = entrada.nextInt();
			System.out.print("Informe o nº de carros: ");
			car = entrada.nextInt();
			System.out.print("Informe o nº de acidentes: ");
			acid = entrada.nextInt();
			
			if(i == 1) {
				maior_acid=acid;
				menor_acid=acid;
				cod_maior=cod;
				cod_menor=cod;
			}else if(acid > maior_acid) {
				maior_acid=acid;
				cod_maior=cod;
			}else if(acid < menor_acid) {
				menor_acid=acid;
				cod_menor=cod;
			}
			
			soma_car=soma_car+car;
			
			if(car < 2000) {
				soma_acid=soma_acid+acid;
				cont++;
			}
			
		}
		
		System.out.println("Maior acidente: "+maior_acid+" na cidade cod: "+cod_maior);
		System.out.println("Menor acidente: "+menor_acid+" na cidade cod: "+cod_menor);
		System.out.println("Media de veiculos nas 5 cidades: "+(soma_car/5));
		System.out.println("Média de acidentes nas cidades com menos de 2.000 veículos: "+(soma_acid/cont));
		
		entrada.close();
	}

}
