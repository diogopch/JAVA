package com.Lista02;
/*32. Tendo em uma prova com 10 questões o seguinte gabarito (a,a,b,b,c,c,d,d,e,e) crie uma
página que peça os resultados das questões assinaladas pelo candidato e ao final mostre as
respostas dadas e o resultado conforme o exemplo abaixo:
Q1 : a : Correto
Q2: b : Errada, resposta correta (a)*/

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		char q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
		char r1='a', r2='a', r3='b', r4='b', r5='c', r6='c', r7='d', r8='d', r9='e', r10='e';
		int pont=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe alternativa q1: ");
		q1 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q2: ");
		q2 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q3: ");
		q3 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q4: ");
		q4 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q5: ");
		q5 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q6: ");
		q6 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q7: ");
		q7 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q8: ");
		q8 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q9: ");
		q9 = entrada.nextLine().charAt(0);
		System.out.println("Informe alternativa q10: ");
		q10 = entrada.nextLine().charAt(0);
		if(r1 == q1) {
            System.out.println("Q1:"+r1+": Correto");
            pont++;
        } else {
            System.out.println("Q1:"+r1+" : Errada, resposta: "+q1);
        }
        if (r2==q2) {
            System.out.println("Q2:"+r2+" : Correto");
            pont++;
        } else {
            System.out.println("Q2:"+ r2+": Errada, resposta: "+q2);
        }
        if (r3==q3) {
            System.out.println("Q3:"+r3+": Correto");
            pont++;
        } else {
            System.out.println("Q3:"+r3+": Errada, resposta: " +q3);
        }
        if (r4==q4) {
            System.out.println("Q4:"+r4+": Correto");
            pont++;
        } else {
            System.out.println("Q4:"+r4+": Errada, resposta: "+q4);
        }
        if (r5==q5) {
            System.out.println("Q5:"+r5+": Correto");
            pont++;
        } else {
            System.out.println("Q5:"+r5+": Errada, resposta: "+q5);
        }
        if (r6==q6) {
            System.out.println("Q6:"+r6+": Correto");
            pont++;
        } else {
            System.out.println("Q6:"+r6+": Errada, resposta: "+q6);
        }
        if (r7==q7) {
            System.out.println("Q7:"+r7+": Correto");
            pont++;
        } else {
            System.out.println("Q7:"+r7+": Errada, resposta: "+q7);
        }
        if (r8==q8) {
            System.out.println("Q8:"+r8+": Correto");
            pont++;
        } else {
            System.out.println("Q8:"+r8+": Errada, resposta: "+q8);
        }
        if (r9==q9) {
            System.out.println("Q9:"+r9+": Correto");
            pont++;
        } else {
            System.out.println("Q9:"+r9+": Errada, resposta: "+q9);
        }
        if (r10==q10) {
            System.out.println("Q10:"+r10+": Correto");
            pont++;
        } else {
            System.out.println("Q10:"+r10+": Errada, resposta: "+q10);
        }
        System.out.println("Pontuação final: "+pont);
        
		entrada.close();

	}

}
