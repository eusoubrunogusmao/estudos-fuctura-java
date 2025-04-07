package vetores;

import java.util.Scanner;

public class MediaAlunoVetores {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		String resposta;
		
		do {
			double soma = 0;
			
			for(int i = 0; i < notas.length; i++) {
				boolean entradaValida = false;
				
				while (!entradaValida) {
					System.out.println("Digite a nota " + (i+1) + ": ");
		
					if (scanner.hasNextDouble()) {
						notas[i] = scanner.nextDouble();
						
						if (notas[i] >= 0 && notas[i] <= 10) {
							entradaValida = true;
						} else {
							System.out.println("A nota deve estar entre 0 e 10.	");
						}
					} else {
						System.out.println("Entrada inválida! Digite um número válido: ");
						scanner.nextLine();
					} 
				}	
				soma += notas[i];
			}
			
				System.out.println("As notas informadas foram: ");
				for (int i = 0; i < notas.length; i++) {
					System.out.println("Nota " + (i+1) + " = " + notas[i]);
					}
		
		double media = soma / notas.length;
		System.out.printf("A média das notas é: %.2f", media);
		
		scanner.nextLine();
		
		System.out.println("\nDeseja reiniciar? (s/n): ");
			resposta = scanner.nextLine().trim().toLowerCase();
		
			while (!resposta.equals("s") && !resposta.equals("n")) {
				System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
				resposta = scanner.nextLine().trim().toLowerCase();
			}
		
		} while(resposta.equals("s"));
			System.out.println("Programa encerrado! Até a próxima.");
		
		scanner.close();
		
		
		
		
	}

}
