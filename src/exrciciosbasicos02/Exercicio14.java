package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

/*	- **`14`** Escreva um programa que leia a hora atual em formato 24 horas (0 a 23) 
	e mostre uma saudação de acordo com o período do dia. 
	
	Se a hora não estiver nesse intervalo, o programa deve mostrar “Hora inválida”.

	Por exemplo, se a hora for 8, o programa deve mostrar “Bom dia”.
*/
		
		
		
		Scanner scan = new Scanner(System.in);
		int hora;
		String resposta;
		
		do {
			
		
		
			System.out.println("Digite a hora atual (formato 24 horas):");

			while (!scan.hasNextInt()) {
				System.out.println("Entrada inválida! Digite um número inteiro válido: ");
				scan.nextLine();
			}
			
			hora = scan.nextInt();
			
			while (!(hora >= 0 && hora <= 23)) {
				System.out.println("Hora inválida! Digite um número entre 0 e 23: ");
				while (!scan.hasNextInt()) {
	                System.out.println("Entrada inválida! Digite um número inteiro válido: ");
	                scan.next();
	            }
				
			hora = scan.nextInt();
			
			}
			
			if (hora < 12) {
					System.out.println("Você digitou " + hora + ". Bom dia!");
			} else if(hora < 18) {
				System.out.println("Você digitou " + hora + ". Boa tarde!");
			} else {
				System.out.println("Você digitou " + hora + ". Boa noite!");
			}
			 scan.nextLine();
			 
			System.out.println("Deseja informar outra hora? (s/n): ");
				resposta = scan.nextLine().trim().toLowerCase();
					
					while (!resposta.equals("s") && !resposta.equals("n")) {
						System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
						resposta = scan.nextLine().trim().toLowerCase();
					}
			
		} while (resposta.equals("s"));
		
				System.out.println("Programa encerrado! Até a próxima.");
				
		scan.close();
	}

}

		
		
//    **Solução Sugerida**
//    Scanner scan = new Scanner(System.in);
//
//System.out.print("Digite a hora atual (formato 24 horas): ");
//int hora = scan.nextInt();
//
//  if (hora >= 0 && hora < 24) {
//      String saudacao;
//      if (hora >= 0 && hora < 12) {
//          saudacao = "Bom dia";
//      } else if (hora >= 12 && hora < 18) {
//          saudacao = "Boa tarde";
//      } else {
//          saudacao = "Boa noite";
//      }
//      System.out.println(saudacao);
//  } else {
//      System.out.println("Hora inválida");
//  }
		
		
