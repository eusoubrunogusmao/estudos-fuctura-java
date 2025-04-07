package exrciciosbasicos02;

import java.util.Scanner;

public class Ecercicio09 {

	public static void main(String[] args) {
		
		
//		09 Escreva um programa que leia a temperatura em graus Celsius e converta para graus Fahrenheit ou Kelvin, de acordo com a escolha do usuário. 
//
//		A fórmula para converter Celsius para Fahrenheit é: 
//		F = (C * 9/5) + 32. 
//		A fórmula para converter Celsius para Kelvin é 
//		K = C + 273.15.

		
		
		Scanner scan = new Scanner(System.in);
		String continuar = null;
		
		do {
			double temperaturaCelsius;
			int escolha;
			
			System.out.println("Informe a tempertatura em Celsius: ");
			while (!scan.hasNextDouble()) {
				System.out.println("Entrada inválida! Digite um valor numérico: ");
				scan.nextLine();
			}
			temperaturaCelsius = scan.nextDouble();
			
			do {
			System.out.println("Informe se deseja converter para Fahrenheit(1) ou Kelvin(2): ");
			
			while (!scan.hasNextInt()) {
				System.out.println("Entrada inválida! Digite 1 ou 2: ");
				scan.next();
			}
			escolha = scan.nextInt();
			
			if (escolha != 1 && escolha != 2) {
				System.out.println("Opção inválida! Digite 1 ou 2: ");
			}
				
			} while(escolha != 1 && escolha != 2);
				
			scan.nextLine();
			
			double tempF = (temperaturaCelsius * 9/5) + 32;
			double tempK = temperaturaCelsius + 273.15;
			
			
			if (escolha == 1) {
				System.out.printf(temperaturaCelsius + "°C convertido para Fahrenheit é igual a %.2f °F. \n", tempF);
				
			} else if (escolha == 2) {
				System.out.printf(temperaturaCelsius + "°C convertido para Kelvin é igual a %.2f °K.", tempK);
				
			}
			
				System.out.println("\nDeseja converter outra temperatura? (s/n): ");
				continuar = scan.nextLine().trim().toLowerCase();
				
				while (!continuar.equals("s") && !continuar.equals("n")) {
					System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
	                continuar = scan.nextLine().trim().toLowerCase();
				}
			
		} while (continuar.equals("s"));
			System.out.println("Programa encerrado. Até mais!");
			scan.close();
	
		
		
		
	}

}
