package JavaFamilia57;

import java.util.Scanner;

public class LacoRepeticao4 {
	public static void main(String[] args) {
		
		int idade, genero, fp, contpc=0, contMnervosa=0, contHagressivo=0,contOcalmo=0,contPnervosa40=0,contPc18=0,p=1;
		
		Scanner ler = new Scanner(System.in);
	
		
		while(p<=5) {
			
			System.out.println("\nColoque sua idade:");
			
			idade=ler.nextInt();
			System.out.println("\nEntre com o seu genero: \n1-Feminino\n2-Masculino\n3-Outros");
			
			genero=ler.nextInt();
			System.out.println("\nColoque o fato psicologico: \n1-Calma\n2-Nervosa\n3-Agressiva");
			
			fp=ler.nextInt();
			
			if(fp==1) {
				contpc++;
			}
			if(genero == 1 && fp ==2) {
				contMnervosa++;
			}
			if(genero ==2 && fp ==1) {
				contHagressivo++;
			}
			if(genero ==3 && fp ==1) {
				contOcalmo++;
			}
			if(fp== 2 && idade>40) {
				contPnervosa40++;
			}
			if(fp ==1 && idade<18) {
				contPc18++;
			}
			p++;
			}
		System.out.println("\nNumero de pessoas calmas:+contPc");
		System.out.println("\nNumero de mulheres Nervosas:+contMnerosa");
		System.out.println("\nNumero de homens agressivos:+contHagressivo");
		System.out.println("\nNumero de outros calmos:+contOcalmo");
		System.out.println("\nNumero de pessoas nervosas com mais de 40: +contPnervosa40");
		System.out.println("\nNumero de pessoas calmas com menos de 18 anos:+contPc18");
		}
		
	}


