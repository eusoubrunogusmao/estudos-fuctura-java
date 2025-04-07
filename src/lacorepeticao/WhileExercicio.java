package lacorepeticao;

import java.util.Random;
import java.util.Scanner;

public class WhileExercicio {

	public static void main(String[] args) {

	/*	Crie um programa que gere um umero aleatorio entre 1 e 100.
		O usuario deve tentar adivinhar esse número.
		O programa deve dizer se o número digitado é
		maior ou menor do que o correto.
		O jogador tem apnas 7 tentativas.
		Se errar todas, o programa exibe:
			"Você perdeu! O úmero correto era x"  */
		

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	String resposta;
		        
		        
		do {
		   int numeroCorreto = random.nextInt(100) + 1;
		   int tentativas = 7;
		   boolean acertou = false;
		   
		   System.out.println("Tente adivinhar o número entre 1 e 100!");
		        
		   for (int i = 0; i < tentativas; i++) {
			   int palpite = 0;
			   boolean entradaValida = false;
		            
			   while(!entradaValida) {
		       System.out.print("Digite seu palpite: ");
		
		            				
		       		if(scanner.hasNextInt()) {
		       			palpite = scanner.nextInt();
		       			entradaValida = true;
		       		} else {
		       			System.out.println("Entrada inválida! Digite um número entre 1 e 100: ");
		            	scanner.nextLine();
		       		}
			   }
			   
			   		scanner.nextLine();
		            
		        if (palpite == numeroCorreto) {
		           System.out.println("Parabéns! Você acertou o número!");
		           acertou = true;
		           break;
		        } else if (palpite < numeroCorreto) {
		           System.out.println("O número correto é maior.");
		        } else {
		           System.out.println("O número correto é menor.");
		        }
		            
		        int tentativasRestantes = tentativas - (i+1);
		        
		        if(tentativasRestantes > 0) {
		        	System.out.println("Ainda restam " + tentativasRestantes + " tentativas!");
		        } else {
		        	System.out.println("\nAcabaram suas chances.");
		        	 
		        }
		   }
		        if(!acertou) {
		        	System.out.println("Você perdeu! O número correto era " + numeroCorreto);
		        }
		     
		        
		        System.out.println("Deseja reiniciar o jogo? (s/n): ");
		        resposta = scanner.nextLine().trim().toLowerCase();
		        
		        while (!resposta.equals("s") && !resposta.equals("n")) {
					System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não: ");
					resposta = scanner.nextLine().trim().toLowerCase();
				}
		        
		} while (resposta.equals("s")); 
		        System.out.println("Obrigado por jogar! Até outra vez.");
		        scanner.close();

	}
}
		
		
		
		
		
		
		
	/*
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int limiteTentativas = 7;
		int tentativas = 0;
		boolean acertou = false;
		int numeroSecreto = random.nextInt(100) + 1;		// (1,101)
		
		System.out.println("Bem vindo ao jogo de adivinhação!");
		System.out.println("Adivinhe um número entre 1 a 100");
			
		while (tentativas < limiteTentativas) {
			
			System.out.println("Digite seu palpite: ");
			int palpite = scan.nextInt();
			
			tentativas++; //+= 1; // tentativas = tentativas + 1
			
			if (palpite == numeroSecreto) {
				System.out.println("Parabéns! Você acertou o número secreto.");
				acertou = true;
				break;
			} else if ( palpite < numeroSecreto) {
				System.out.println("Tente um número maior.\n");
			} else {
				System.out.println("Tente um número menor.\n");
			}
			
			
			System.out.println("Você tem " + (limiteTentativas - tentativas) + " tentativas");
		}	
		
		if (!acertou) {
			System.out.println("Você perdeu! O número secreto é " + numeroSecreto);
		}


		
	}

}

	 */
