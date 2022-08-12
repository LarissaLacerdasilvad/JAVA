package JavaFamilia57;

import java.util.Scanner;

public class LacoDecisao4 {
	public static void main(String[]args) {
		
		int numero;
		double resultado;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("\nColoque um numero");
		numero=ler.nextInt();
		
		if(numero % 2 ==0) {
			resultado=Math.sqrt(numero);
		}
		else {
			resultado=Math.pow(numero, 2);
		}
		System.out.println("\nResultado+resultado");
		System.out.println("\nResultado=%.2f,resultado");
		
		
		
	}

}
