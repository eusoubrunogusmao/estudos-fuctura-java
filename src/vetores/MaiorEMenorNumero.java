package vetores;

import java.util.Scanner;

public class MaiorEMenorNumero {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		String resposta;
		
		do {
		System.out.println("Digite 10 números inteiros e o programa vai dizer qual o maior e o menor!");
		
			for(int i = 0; i < numeros.length; i++) {
				boolean entradaValida = false;
			
				while(!entradaValida) {
					System.out.println("Digite o numero " + (i+1) + ": ");
			
					if(scan.hasNextInt()) {
						numeros[i] = scan.nextInt();
						entradaValida = true;
					} else {
						System.out.println("Entrada inválida! Digite um numero inteiro válido: ");
					}
					scan.nextLine();
				}
			}
		
		int maior = numeros[0];
		int menor = numeros[0];
		int indiceMaior = 0;
		int indiceMenor = 0;
		
			for(int i = 1; i < numeros.length; i++) {
				if (numeros[i] > maior) {
					maior = numeros[i];
					indiceMaior = i;
				}
				
				if (numeros[i] < menor) {
					menor = numeros[i];
					indiceMenor = i;
				}
				
			}
		System.out.println("LISTA DE NÚMEROS DIGITADOS:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1) + ": " + numeros[i] + " na posição " + i);
		}
		System.out.println("\nO maior número digitado foi: " + maior + " na posição " + indiceMaior);
		System.out.println("O menor número digitado foi: " + menor + " na posição " + indiceMenor);
		
		System.out.println("\nDeseja reiniciar? (s/n): ");
			resposta = scan.nextLine().trim().toLowerCase();
			
			while (!resposta.equals("s") && !resposta.equals("n")) {
				System.out.println("Entrada inválida! Digite 's' para sim e 'n' para não: ");
				resposta = scan.nextLine().trim().toLowerCase();
				
			}
		
		} while(resposta.equals("s"));
			System.out.println("Programa encerrado! Até a próxima.");
		
		scan.close();
		
	}
	
}
