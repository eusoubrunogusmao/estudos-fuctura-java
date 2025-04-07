package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
	/*	13 Escreva um programa que leia um ano e diga se ele é bissexto ou não. Um ano é bissexto se ele 	for divisível por 4, exceto se ele for divisível por 100 e não por 400. 

			1. se o ano for divisivel por 4 ele é bissexto
			2. se o ano for divisivel por 100 e nao for divisivel por 400 entao ele não é bissexto
			   (se o ano nao for divisivel por 100 e for divisivel por 400 entao ele é bissexto

		Ex:
		2000 é bissexto. 
		2100 não é bissexto.
		
	*/
		Scanner scan = new Scanner(System.in);
		int ano = 0;
		String resposta;
		boolean continuar = false;
		do {

				System.out.println("Informe um ano: ");
					while (!scan.hasNextInt()) {
						System.out.println("Entrada inválida! Digite um numero inteiro válido: ");
						scan.nextLine();
					} 
						ano = scan.nextInt();
			
			
				if (ano % 4 == 0) {
					if (ano % 100 == 0 && ano % 400 != 0) {
						System.out.println("O ano " + ano + " não é bissexto.");
					} else {
						System.out.println("O ano " + ano + " é bissexto.");
					}
				} else {
					System.out.println("O ano " + ano + " não é bissexto.");
				}
				scan.nextLine();
				
					System.out.println("Deseja informar outro ano? (s/n): ");
					resposta = scan.nextLine().trim().toLowerCase();
					
						while (!resposta.equalsIgnoreCase("s") && 								!resposta.equalsIgnoreCase("n")) {
							System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
							resposta = scan.nextLine().trim().toLowerCase();
						}
			
						continuar = resposta.equalsIgnoreCase("s");
			
		} while (continuar);
			System.out.println("Programa encerrado!");
			scan.close();
	}

}
