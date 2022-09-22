/*12. Embaralha palavra. Construa uma função que receba uma string como parâmetro
e devolva outra string com os carateres embaralhados. Por exemplo: se função
receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra
combinação possível, de forma aleatória. Padronize em sua função que todos os
caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de
como foram digitados.*/

package com.Lista06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a palavra: ");
		String palavra = entrada.nextLine();
		
		System.out.println(embaralhaPalavra(palavra));
		
		
		
		entrada.close();
	}
	
	public static String embaralhaPalavra(String plvr) {
	    char[] caracteres = plvr.toCharArray();
	    String resultado;
	   
	    //Collections.shuffle(caracteres);
	    
	    resultado = ArrayList.toString(caracteres);  //verificar erro!!!!
	    resultado.toUpperCase();
	    return resultado;

	}

}