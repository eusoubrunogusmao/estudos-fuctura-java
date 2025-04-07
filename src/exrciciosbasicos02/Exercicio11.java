package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		
/* 11 Escreva um programa que leia o peso e a altura de uma pessoa e calcule o seu índice de massa corporal (IMC). 

Fórmula do IMC: peso / (altura * altura). 

De acordo com o IMC, mostre a classificação da pessoa: 

IMC:Abaixo de 18,5 
Classificação:Abaixo do peso

IMC:Entre 18,5 e 24,9
Classificação:Peso normal

IMC:Entre 25 e 29,9
Classificação:Sobrepeso

IMC:Entre 30 e 34,9
Classificação:Obesidade grau I

IMC:Entre 35 e 39,9
Classificação:Obesidade grau II

IMC:Acima de 40
Classificação:Obesidade grau III

*/
	
		
		
		Scanner scan = new Scanner(System.in);
		

		double peso, altura, imc;
		String continuar;
		
		do {
			
			System.out.println("Informe o peso: ");
			while (true) {
				if (scan.hasNextDouble()){
					peso = scan.nextDouble();
					break;
				} else {
					System.out.println("Entrada inválida! Digite um valor numérico válido: ");
					scan.nextLine();
				}
			}
			
		scan.nextLine();
			
			System.out.println("Informe a altura: ");
			while (true) {
				if (scan.hasNextDouble()){
					altura = scan.nextDouble();
					break;
				} else {
					System.out.println("Entrada inválida! Digite um valor numérico válido: ");
					scan.nextLine();
				}
			}
			
			imc = peso / (altura * altura);
			
			if (imc < 18.5) {
				System.out.println("O IMC é: " + imc + "(abaixo do peso)");
			} else if (18.5 <= imc && imc <= 24.9) {
				System.out.println("O IMC é: " + imc + "(peso normal)");
			} else if (25 <= imc && imc <= 29.9) {
				System.out.println("O IMC é: " + imc + "(sobrepeso)");
			} else if (30 <= imc && imc <= 34.9) {
				System.out.println("O IMC é: " + imc + "(obesidade I)");
			} else if (35 <= imc && imc <= 39.9) {
				System.out.println("O IMC é: " + imc + "(obesidade II)");
			} else {
				System.out.println("O IMC é: " + imc + "(obesidade III)");
	
			} 
			
			scan.nextLine();
			
			System.out.println("Deseja reiniciar o programa? (s/n): ");
			continuar = scan.nextLine().trim().toLowerCase();
			
			while (!continuar.equals("s") && !continuar.equals("n")) {
				System.out.println("Entrada inválida! Digite 's' para sim e 'n' para nâo.");
				continuar = scan.nextLine().trim().toLowerCase();
			}
			
			
			
			
		} while (continuar.equals("s"));
		
			System.out.println("Encerrar programa!");
			scan.close();

		
		
		
	}

}
