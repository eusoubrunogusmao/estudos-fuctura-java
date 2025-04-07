package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		04 Escreva um programa que leia a idade de uma pessoa e diga se ela pode votar ou não nas eleições. 
//
//		No Brasil, o voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos ou maiores de 70 anos.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a sua idade: ");
		int idade = scan.nextInt();
		
		String situacao;
		
		if (idade < 16) {
			situacao = "não pode votar";
			
		} else if (idade >= 18 && idade < 70) {
			situacao = "obrigatório votar";
			
		} else {
			situacao = "voto facultativo";
			
		}
		
		
		System.out.println(situacao);
		
				
		
		
	}

}
