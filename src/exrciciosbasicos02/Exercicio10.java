package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

/* 			10 Escreva um programa que leia o salário de um funcionário e aplique um aumento de acordo com a seguinte tabela: 

			Faixa salarial: Até R$ 1.500,00 
			Percentual de Aumento: 15% ( * 1.15

			Faixa Salarial: De R$ 1.500,01 até R$ 2.500,00 Percentual de Aumento: 10% 

			Faixa Salarial: Acima de R$ 2.500,00 
			Percentual de Aumento: 5%	
 */
				Scanner scan = new Scanner(System.in);
				double salario;
				String continuar;
				
				do {
					
					System.out.println("Informe o salário do funcionário: ");					
					while (true) {
						if (scan.hasNextDouble()){
							salario = scan.nextDouble();
							break;
						} else {
							System.out.println("Entrada inválida! Digite um valor numérico válido: ");
							scan.nextLine();
						}
					}
					
				scan.nextLine();
				
				if (salario <= 1500) {
					double aumento15 = salario * 1.15;
					System.out.printf("O salário foi aumentado em 15%% e agora é: R$ %,.2f%n", aumento15);
				} else if (salario > 2500) {
					System.out.printf("O salário foi aumentado em 5%% e agora é: R$ %,.2f%n", (salario * 1.05));
				} else {
					System.out.printf("O salário foi aumentado em 10%% e agora é: R$ %,.2f%n", (salario * 1.10));
				}
				
				System.out.println("Deseja informar salário de outro funcionário? (s/n): ");
				continuar = scan.nextLine().trim().toLowerCase();
				
				while (!continuar.equals("s") && !continuar.equals("n")){
					System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
					continuar = scan.nextLine().trim().toLowerCase();
					
				}
				
				} while (continuar.equals("s"));
				
					System.out.println("Programa encerrado!");
					scan.close();	
		
		

	}

}
