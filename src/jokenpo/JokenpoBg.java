package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class JokenpoBg {
	
	public static void main(String[] args) {
		
		
		/* ENUNCIADO:
		 * 
		 * Crie um jogo simples de Pedra, Papel e Tesoura. O jogador escolhe uma opção
		 * (Pedra, Papel, Tesoura), o computador escolhe aleatoriamente uma opção e o
		 * programa determina o vencedor.
		 * 
		 * Regras:
		 * 
		 * Pedra ganha da Tesoura Tesoura ganha do Papel Papel ganha da Pedra
		 */
		
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
// DO WHILE (laço de repetição)
		
		String resposta;
		
		do {
		
// SORTEIA JOGADA DO COMPUTADOR
			
		int opcaoComputador = r.nextInt(3);
		
		String jogadaComputador;
		
		if (opcaoComputador == 0) {
			jogadaComputador = "Pedra";
			
		} else if (opcaoComputador == 1) {
			jogadaComputador = "Papel";
			
		} else {
			jogadaComputador = "Tesoura";
			
		}
		
// EXIBE MENU E LÊ JOGADA DO USUÁRIO
		
		String menu = """
				Faça sua jogada:
				Pedra
				Papel
				Tesoura
				""";
		
		System.out.println(menu);
		String jogadaUsuario = scan.nextLine();
		
// VALIDA JOGADA DO USUÁRIO
		
		if (
				!(jogadaUsuario.equalsIgnoreCase("Pedra"))
				&&
				!(jogadaUsuario.equalsIgnoreCase("Papel"))
				&&
				!(jogadaUsuario.equalsIgnoreCase("Tesoura"))
				) {
			
			System.out.println("Jogada inválida! d");
			
			
// EMPATE
			
		} else {
			
			if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
				System.out.println("Jogada do usuário: " + jogadaUsuario);
				System.out.println("Jogada do computador: " + jogadaComputador);
				System.out.println("Empate");
				
// VITÓRIA
				
			} else if (
					(jogadaUsuario.equalsIgnoreCase("Pedra")) && (jogadaComputador.equalsIgnoreCase("Tesoura"))
					||
					(jogadaUsuario.equalsIgnoreCase("Papel")) && (jogadaComputador.equalsIgnoreCase("Pedra"))
					||
					(jogadaUsuario.equalsIgnoreCase("Tesoura")) && (jogadaComputador.equalsIgnoreCase("Papel"))
			
					){
				
						System.out.println("Jogada do usuário: " + jogadaUsuario);
						System.out.println("Jogada do computador: " + jogadaComputador);
						System.out.println("Você venceu! :)");
						
// DERROTA
				
			} else {
				System.out.println("Jogada do usuário: " + jogadaUsuario);
				System.out.println("Jogada do computador: " + jogadaComputador);
				System.out.println("Você perdeu! :(");
				
				}
				
			}
		
// REINICIAR
				
//		do {
			
			System.out.println("Deseja jogar novamente? (s/n)");
			resposta = scan.nextLine();
			
			if ((resposta.equalsIgnoreCase("n"))) {
			
				System.out.println("Jogo encerrado.");
					
			} else if (!(resposta.equalsIgnoreCase("s")) && !(resposta.equalsIgnoreCase("n"))) {
						
						System.out.println("Opção inválida.");
			}
			
			
			
			} while (resposta.equalsIgnoreCase("s"));
					System.out.println("Sim, vamos de novo!");
					
		
// FIM DO CÓDIGO
	}

}
