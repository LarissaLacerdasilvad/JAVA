package JavaFamilia57;

import java.util.Scanner;

public class LacoDecisao2 {

	public static void main(String[]args) {
		/*
		 * menor meio maior
		 * A     B    C
		 * A     C    B
		 * B     A    C
		 * B     C    A
		 * C     A    B
		 * C     B    A    
		 */
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o A:");
		
		a= ler.nextInt();
		System.out.println("\nEntre com o B:");
		
		b= ler.nextInt();
		System.out.println("\nEntre com o c:");
		
		c= ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("\nOrdem crescente:"+a+","+b+","+c);
		}
		else if(a<=c && c<=b) {
			System.out.println("\nOrdem crescente:"+a+","+c+","+b);
		}
		else if(b<=a && a<=c) {
			System.out.println("\nOrdem crescente: "+b+","+a+","+c);
		}
		else if(b<=c && c<=a) {
			System.out.println("\nOrdem crescente:"+b+","+c+","+a);
		}
		else if(c<=a && a<=b) {
			System.out.println("\nOrdem crescente: "+c+","+a+","+b);
		}
		else {
			System.out.println("\nOrdem crescente:"+c+","+b+","+a);
			
			
		
		}
		
					
		}
		
		
	}

