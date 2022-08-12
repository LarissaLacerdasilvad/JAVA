package JavaFamilia57;

import java.util.Scanner;

public class LacosDeRepeticao6 {
	public static void main(String [] args) {
		
		float media;
		int numero,somaMultiplo3=0,contMultiplo3=0;
		
		Scanner ler= new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um numero:");
			
			numero=ler.nextInt();
			if(numero==0) {
				System.out.println("\nVolte sempre!");
			}
			else
			{
				if(numero % 3 ==0) {
					somaMultiplo3 += numero;
					contMultiplo3++;
				}
				}
		}
		while(numero!=0);
		if(contMultiplo3 ==0) {
			System.out.println("\nNão é possivel!");
		}
		else
		{
			media=somaMultiplo3/contMultiplo3;
			System.out.println("\nMédia dos numeros multiplos 3:"+media);
		}
	
	}
}
