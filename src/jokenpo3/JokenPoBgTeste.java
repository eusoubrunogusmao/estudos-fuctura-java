package jokenpo3;

import java.util.Random;
import java.util.Scanner;

public class JokenPoBgTeste {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		String resposta;
		
		System.out.println("VAMOS JOGAR JOKEN PO");
		
		do {
			int opcaoComputador = r.nextInt();
			
			String jogadaComputador;
				switch (opcaoComputador) {
				case 0:
					jogadaComputador = "Pedra";
					break;
				case 1:
					jogadaComputador = "Papel";
					break;
				default:
					jogadaComputador = "Tesoura";
					break;
				}
				
			System.out.println("""
					FAÇA SUA JOGADA:
					Pedra
					Papel
					Tesoura
					""");
			
			String jogadaUsuario = scan.nextLine().trim().toLowerCase();
			
			if (!jogadaUsuario.equalsIgnoreCase("Pedra") 
					&& !jogadaUsuario.equalsIgnoreCase("Papel")
					&& !jogadaUsuario.equalsIgnoreCase("Tesoura")) {
				
				System.out.println("Jogada inválida! \n\nDigite corretamente as opções (pedra/papel/tesoura): ");
				
			} else {
				System.out.println("Você jogou: " + jogadaUsuario);
				System.out.println("O computador jogou: " + jogadaComputador);
				
				if ((jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura"))
				 ||	(jogadaUsuario.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Pedra"))
				 ||	(jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Papel"))
				) {
						System.out.println("Você venceu!");
					
				} else if(jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
						System.out.println("Empate");
				} else {
						System.out.println("Você perdeu!");
				}
			
			}
			
				do {
					System.out.println("Deseja jogar novamente? (s/n): ");
					resposta = scan.nextLine().trim().toLowerCase();
						
						if(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")){
							System.out.println("Entrada iválida! Digite 's' para sim ou 'n' para não: ");
						} 
					
				} while(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
				
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("JOGO REINICIADO! Vamos lá.");
				}
			
			
		} while(resposta.equalsIgnoreCase("s"));
		
			System.out.println("JOGO ENCERRADO! Até a próxima.");
		
	}

}
