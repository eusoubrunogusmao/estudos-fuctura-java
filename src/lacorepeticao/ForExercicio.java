package lacorepeticao;

import java.util.Scanner;

public class ForExercicio {

	public static void main(String[] args) {
		
		/* Crie um programa que peça uma palavra ao usuário e
			conte quantas vogais (a,e,i,o,u) existem na palavra.
			*/
		
		
		Scanner scan = new Scanner(System.in);
		String resposta;
		
		do {
			int contVogal = 0;
			int contConsoante = 0;
			System.out.println("Digite uma palavra: ");
			String palavra = scan.nextLine().trim().toLowerCase();
		
//				0 1 2 3 4 5
//				B A N A N A
		
			for (int i = 0; i < palavra.length(); i++) {
				char c = palavra.charAt(i);
				
					if (c >= 'a' && c <= 'z') {
						if(c == 'a' || c == 'e' || c == 'i' ||
							c == 'o' || c == 'u'){
						
							contVogal++;
						} else {
							contConsoante++;
						}
					}
			}
		
			System.out.println(palavra + " tem " + contVogal + " vogais e " + contConsoante + " consoantes.");
			
			System.out.println("Deseja analisar outra palavra? (s/n): ");
			resposta = scan.nextLine().trim().toLowerCase();
			
				while (!resposta.equals("s") && !resposta.equals("n")) {
					System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
					resposta = scan.nextLine().trim().toLowerCase();
				}
		
				
		} while(resposta.equals("s"));
		
			System.out.println("Programa encerado! Até a próxima.");
			
			scan.close();

	}

}
