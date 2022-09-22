package com.Lista02;
/*23. Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem
"Turma Jovem";
◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem
"Turma Adulta";
◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a
mensagem "Turma Idosa".*/

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		int id1, id2, id3;
		float media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a idade 1: ");
		id1 = entrada.nextInt();
		System.out.println("Informe a idade 2: ");
		id2 = entrada.nextInt();
		System.out.println("Informe a idade 3: ");
		id3 = entrada.nextInt();
		media=(id1+id2+id3)/3;
		if(media<25) {
			System.out.println("Turma jovem");
		}else if(media>=25 && media<40) {
			System.out.println("Turma Adulta");
		}else {
			System.out.println("Turma idosa");
		}
		
		entrada.close();

	}

}
