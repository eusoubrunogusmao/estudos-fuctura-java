package jokenpo3;

import java.util.Random;
import java.util.Scanner;

public class JokenpoBg3 {
	
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Random r = new Random();
	        String resposta;
	        
	        System.out.println("VAMOS JOGAR JOKENPÔ\n");

	        do {
	        	
// SORTEIA JOGADA DO COMPUTADOR
	        	
	            int opcaoComputador = r.nextInt(3);
	            String jogadaComputador = (opcaoComputador == 0) ? "Pedra" :
	                                      (opcaoComputador == 1) ? "Papel" : "Tesoura";

// EXIBE MENU E LÊ JOGADA DO USUÁRIO
	            
	            System.out.println("""
	            		Faça sua jogada:
	            		Pedra
	            		Papel
	            		Tesoura
	            		""");
	            
	            String jogadaUsuario = scan.nextLine();

// VALIDA JOGADA DO USUÁRIO
	            
	            if (!jogadaUsuario.equalsIgnoreCase("Pedra") 
	            	&&
	                !jogadaUsuario.equalsIgnoreCase("Papel") 
	                &&
	                !jogadaUsuario.equalsIgnoreCase("Tesoura")) {
	            	
	                System.out.println("JOGADA INVÁLIDA\n\nDigite corretamente as opções de jogada (Pedra / Papel / Tesoura).\n\nTENTE OUTRA VEZ!\n");
	                
	            } else {
	            	
// EXIBE RESULTADO
	            	
	                System.out.println("Jogada do usuário: " + jogadaUsuario);
	                System.out.println("Jogada do computador: " + jogadaComputador);

// EMPATE	                
	                
	                if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
	                    System.out.println("Empate!");
	                    
// VITÓRIA	                    
	                    
	                } else if ((jogadaUsuario.equalsIgnoreCase("Pedra") && 								jogadaComputador.equalsIgnoreCase("Tesoura")) 
	                		  ||
	                           (jogadaUsuario.equalsIgnoreCase("Papel") && 								jogadaComputador.equalsIgnoreCase("Pedra")) 
	                          ||
	                           (jogadaUsuario.equalsIgnoreCase("Tesoura") && 								jogadaComputador.equalsIgnoreCase("Papel"))) {
	                	
	                    System.out.println("Você venceu! :)");
	                    	                 
// DERROTA			
	                    
	                } else {
	                	
	                    System.out.println("Você perdeu! :(");
	                    
	                }
	                
	            }

// PERGUNTA SE QUER JOGAR NOVAMENTE
	            
	            do {
	            	
	                System.out.println("Deseja jogar novamente? (s/n)");
	                resposta = scan.nextLine();
	                
// VALIDA REINÍCIO, EXCLUINDO ENTRADAS INVÁLIDAS 
	                
	                if (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
	                    System.out.println("Opção inválida! Digite 's' para sim ou 'n' para não.");
	                }
	            } while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")); // Repete até resposta ser "s" ou "n"

// REINICIA JOGO	            	           
	            if (resposta.equalsIgnoreCase("s")) {
	            	System.out.println("-JOGO REINICIADO-");
				}
	        } while (resposta.equalsIgnoreCase("s")); // Continua o jogo se a resposta for "s"
	        
// ENCERRA JOGO, QUANDO O USUÁRIO DIGITA "n"     

	        System.out.println("-JOGO ENCERRADO-");
	        
	        
	        scan.close();				 // Boa prática fechar o Scanner
	    }
	}
	
	
