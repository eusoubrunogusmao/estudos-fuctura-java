package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		
//		06 Escreva um programa que leia uma letra do alfabeto e diga se ela é uma vogal ou uma consoante. 
//		Lembre-se que, na comparação de Strings, usa-se o método .equals() ou o .equalsIgnoreCase().

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = scan.next().toLowerCase();
		
		
		if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
		    if ("aeiou".contains(letra)) {
		        System.out.println("Vogal");
		    } else {
		        System.out.println("Consoante");
		    }
		} else {
		    System.out.println("Entrada inválida!");
		}

		
		
		
		
		
//		if ("aeiou".contains(letra)) {
//		    System.out.println("Vogal");
//		} else {
//		    System.out.println("Consoante");
//		}

		
		
//		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ) {
//			System.out.println("Vogal");
//			
//		} else {
//			System.out.println("Consoante");
//			
//		}
		
		
		
		
		
		
		
		
	}

}
