package JavaFamilia57;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String []args) {
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float [2][2];
		float[][] matriz3 = new float[2][2];
		int i, j = 0, numero, op;
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<=2; i++) {
			for(j=0; j<2; j++) {
				System.out.println("Coloque o valor da matriz1");
				matriz1[i][j]= ler.nextFloat();
				
				System.out.println("Coloque o valor da matriz2");
				matriz2 [i][j]= ler.nextFloat();
			}
				
			}
		do {
			System.out.println("\n\t\tMenu de matrizes");
			
			System.out.println("\n1 - Somar as matrizes");
			System.out.println("\n2- Subtrair a primeira matriz pela segunda ");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes ");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa ");
			System.out.println("\nColoque sua opção:");
			
			op=ler.nextInt();
			
			switch(op) {
			
			case 1:
				for(i=0; i<2;i++) {
					for(j=0; j<2;j++) {
						matriz3[i][j]= matriz1[i][j]+matriz2[i][j];
						
						System.out.println("Soma:"+matriz3[i][j]);
						
					}
				}
				break;
			case 2:
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					matriz3[i][j]= matriz2[i][j]-matriz1[i][j];
					System.out.println("\nDiferença:"+matriz3[i][j]);					
				}
			}
	break;
			case 3:
				System.out.println("\nLeia o numero:");
				numero = ler.nextInt();
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz1[i][j]+=numero;
						matriz2[i][j]+=numero;
						
						System.out.println("\nMatriz1 mais o numero:"+matriz1[i][j]);
						System.out.println("\nMatriz2 mais o numero:"+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
				}
					}
				System.out.println("\nMatriz1 "+matriz1[i][j]);
				System.out.println("\nMatriz2:"+matriz2[i][j]);
			
				
			
				
				break;
				case 0:
					System.out.println("\nObrigada por ultilizar nosso programa");
					break;
					default:
					
					System.out.println("Opção invalida,");
	}
}

		while(op!=0);
	}
}
	

	

	
