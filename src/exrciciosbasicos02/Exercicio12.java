package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		
		
		
		/*12 Escreva um programa que leia um número inteiro entre 1 e 7 
		 * e mostre o dia da semana correspondente. 
		 * Se o número não estiver nesse intervalo, mostre uma mensagem de erro.*/
		
		Scanner scan = new Scanner(System.in);
		
		int dia;
		String resposta;
		boolean continuar;
		
			do {
	
			System.out.println("Digite um número de 1 a 7: ");
			dia = scan.nextInt();
			scan.nextLine();
			
			switch (dia) {
		    case 1 -> System.out.println("O número " + dia + " corresponde a Domingo");
		    case 2 -> System.out.println("O número " + dia + " corresponde a Segunda-feira");
		    case 3 -> System.out.println("O número " + dia + " corresponde a Terça-feira");
		    case 4 -> System.out.println("O número " + dia + " corresponde a Quarta-feira");
		    case 5 -> System.out.println("O número " + dia + " corresponde a Quinta-feira");
		    case 6 -> System.out.println("O número " + dia + " corresponde a Sexta-feira");
		    case 7 -> System.out.println("O número " + dia + " corresponde a Sábado");
		    default -> System.out.println("Entrada inválida! Tente novamente.");
		}

			
//			if(dia == 1) {
//				System.out.println("O número " + dia + " corresponde a Domingo");
//			} else if (dia == 2) {
//				System.out.println("O número " + dia + " corresponde a Segunda");
//			} else if (dia == 3) {
//				System.out.println("O número " + dia + " corresponde a Terça");
//			} else if (dia == 4) {
//				System.out.println("O número " + dia + " corresponde a Quarta");
//			} else if (dia == 5) {
//				System.out.println("O número " + dia + " corresponde a Quinta");
//			} else if (dia == 6) {
//				System.out.println("O número " + dia + " corresponde a Sexta");
//			} else if(dia == 7)  {
//				System.out.println("O número " + dia + " corresponde a Sabado");
//			} else {
//				System.out.println("Entrada inválida! Tente novamente.");
//			}
			
				do {
					System.out.println("Deseja informar outro número?(s/n): ");
					resposta = scan.nextLine().trim().toLowerCase();
					
					if (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
						System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
					}
					

				} while(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
				
				continuar = resposta.equals("s"); 
				
//			} while(resposta.equalsIgnoreCase("s"));
			} while(continuar);
			
		    System.out.println("Programa encerrado.");
		    
		    scan.close();
	}

}
