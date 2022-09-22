package com.Lista02;
/*9. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
o peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
(h = altura)
Ao final o algoritmo deve mostrar:
- Altura, peso e sexo;
- Peso Ideal;
- Mensagem se está acima, abaixo ou no peso ideal;*/

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		double alt, peso, ideal;
		char sexo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe altura: ");
		alt = entrada.nextDouble();
		System.out.println("Informe peso");
		peso = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Informe sexo f/m: ");
		sexo = entrada.nextLine().charAt(0);
		if(sexo=='m' || sexo=='M') {
			ideal=(72.7*alt)-58;
			if(peso>ideal) {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está acima do peso ideal.");
			}else if(peso==ideal) {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está no peso ideal.");
			}else {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está abaixo do peso ideal.");
			}
		}else if(sexo=='f' || sexo=='F') {
			ideal=(62.1*alt)-44.7;
			if(peso>ideal) {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está acima do peso ideal.");
			}else if(peso==ideal) {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está no peso ideal.");
			}else {
				System.out.println("Altura: "+alt+" Peso: "+peso+" Sexo: "+sexo);
				System.out.println("Peso ideal: "+ideal+". Está abaixo do peso ideal.");
			}
		}
		
		
		
		entrada.close();

	}

}
