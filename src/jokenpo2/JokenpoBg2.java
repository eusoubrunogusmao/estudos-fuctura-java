package jokenpo2;

import java.util.Random;
import java.util.Scanner;

public class JokenpoBg2 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
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
				System.out.println("Jogada inválida! \nDigite corretamente as opções de jogada (Pedra / Papel / Tesoura).");
				
			} else {
// RESULTADO DO JOGO
				System.out.println("Jogada do usuário: " + jogadaUsuario);
				System.out.println("Jogada do computador: " + jogadaComputador);
// EMPATE
				if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
					System.out.println("Empate!");
// VITÓRIA
				} else if (
						(jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura")) ||
						(jogadaUsuario.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Pedra")) ||
						(jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Papel"))
						) {
					System.out.println("Você venceu! :)");
// DERROTA
				} else {
					System.out.println("Você perdeu! :(");
				}
			}

// PERGUNTA SE O USUÁRIO QUER JOGAR NOVAMENTE
			do {
				System.out.println("Deseja jogar novamente? (s/n)");
				resposta = scan.nextLine();
				
				if (!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
					System.out.println("Opção inválida. Digite 's' para sim ou 'n' para não.");
				}
			} while (!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))); // Repete até entrada válida
			
			if (resposta.equalsIgnoreCase("s")) {
				
			}
			
		} while (resposta.equalsIgnoreCase("s"));
		
		System.out.println("Sim, vamos de novo!");
		
		System.out.println("Jogo encerrado.");
		scan.close();
	}
}




