package arraymatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Elaborar um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida mostre na tela:
		 * Todos os números da Diagonal Principal
		 * Todos os números da Diagonal Secundária
		 * A soma de todos os números da Diagonal Principal
		 * A soma de todos os números da Diagonal Secundária*/
		
		Scanner leia = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
	   
		
		System.out.println("\nDigite os números da matriz 3x3: ");
		for(int i= 0;i<3; i++) {
			for(int c = 0; c<3; c++) {
				System.out.println("\nDigite o número da posição[" +i + "][" +c + "]: ");
				matriz[i][c] = leia.nextInt();
			}
		}
       System.out.println("\nNúmeros da Diagonal Principal: ");
       for(int i=0; i<3 ; i++) {
    	   System.out.print(matriz[i][i]+ " ");
    	   
	}
	   System.out.println("\nNúmeros da Diagonal Secundária: ");
	   for (int i= 0; i <3; i++) {
	   System.out.print(matriz[i][2-i]+" "); 
		   
	   }
	   int somaDiagonalPrincipal=0;
	   for(int i= 0; i<3; i++) {
		   somaDiagonalPrincipal+=matriz[i][i];
	   }
	   
	   System.out.println("\n\nSoma dos números da Diagonal Principal: " + somaDiagonalPrincipal);
	   
	   int somaDiagonalSecundaria = 0;
	   for(int i= 0; i<3; i++) {
		   somaDiagonalSecundaria+=matriz[i][2-i];
	   }
       System.out.println("\nSoma dos números da Diagonal Secundária: " + somaDiagonalSecundaria);
     
   }
}
