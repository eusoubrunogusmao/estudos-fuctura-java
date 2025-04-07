package exercicio_sistema_banco_bg_final;

import java.util.Scanner;

public class SistemaBancoBgFinal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        double saldo = 1000.0;
        
        do {
            int opcao;
            System.out.println("""
                    BEM-VINDO AO BANCO BG!
                    Saldo inicial: R$ """ + String.format("%.2f", saldo));
            
            do {
                opcao = menu(scan);
                double saldoAnterior = saldo;
                double valorOperacao;
                
                switch (opcao) {
                
                    case 1:
                        saldo += depositar(scan);
                        break;
                    
                    case 2:
                        if (saldo == 0) {
                            if (!desejaRetornarMenu(scan)) {
                            	continuar = false;
                            	break;
                            }
                            
                        } else {
                            valorOperacao = transferir(scan, saldo);
                            if (valorOperacao > 0) {
                                saldo -= valorOperacao;
                            }
                        }
                        break;
                    
                    case 3:
                        if (saldo == 0) {
                            if (!desejaRetornarMenu(scan)) {
                            	continuar = false;
                            	break;
                            }
                        } else {
                            valorOperacao = sacar(scan, saldo);
                            if (valorOperacao > 0) {
                                saldo -= valorOperacao;
                            }
                        }
                        break;
                    
                    case 4:
                    	System.out.println("Encerrando o programa...");
                    	System.out.flush();
                    	continuar = desejaReiniciar(scan); 
                        break;
                        
                }
                
                if (opcao >= 1 && opcao <= 3) {
                    System.out.println("\nSaldo anterior: R$ " + saldoAnterior);
                    System.out.println("Saldo atual: R$ " + saldo);
                }
            } while (opcao != 4 && continuar); // Corrigido para verificar o continuar

        } while (continuar); // O loop principal continua enquanto o programa não for encerrado
        System.out.println("Obrigado por usar o Banco BG! Até a próxima!");
        scan.close();        
    }

    public static int menu(Scanner scan) {
        int opcao;
        do {
            System.out.println("""
                    \nEscolha uma opção:
                    1 - Depositar
                    2 - Transferir
                    3 - Sacar
                    4 - Sair
                    """);
            System.out.print("Opção: ");
            while (!scan.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número entre 1 e 4: ");
                scan.nextLine();
            }
            
            opcao = scan.nextInt();
            scan.nextLine();
            
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Escolha um número entre 1 e 4: ");
            }
            
        } while (opcao < 1 || opcao > 4);
        
        return opcao;
    }

    public static boolean desejaReiniciar(Scanner scan) {
        String resposta;
        
            System.out.print("Deseja reiniciar o programa? (s/n): ");
            resposta = scan.nextLine().trim().toLowerCase(); // Usa nextLine() para evitar problemas com buffer
            
            while (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não.");
                System.out.print("Deseja reiniciar o programa? (s/n): ");
                resposta = scan.nextLine().trim().toLowerCase();
            }
            
        return resposta.equals("s");
    }

    public static boolean desejaRetornarMenu(Scanner scan) {
        String resposta;
        System.out.println("Seu saldo é zero!");
        do {
            System.out.println("Deseja retornar ao menu? (s/n): ");
            resposta = scan.nextLine().trim().toLowerCase();
            if (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não.");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));
        
        if (resposta.equals("n")) {
            String encerrar;
            do {
                System.out.println("Deseja encerrar o programa? (s/n): ");
                encerrar = scan.nextLine().trim().toLowerCase();
                if (!encerrar.equals("s") && !encerrar.equals("n")) {
                    System.out.println("Entrada inválida! Digite 's' para sim ou 'n' para não.");
                }
            } while (!encerrar.equals("s") && !encerrar.equals("n"));
            
            if (encerrar.equals("s")) {
                System.out.println("Obrigado por usar nosso sistema! Programa encerrado.");
                return false;
            } else {
                return true; // Volta ao menu
            }
        }
        
        return resposta.equals("s"); // Retorna ao menu
    }

    public static double depositar(Scanner scan) {
        double deposito;
        do {
            System.out.println("Digite o valor a depositar: R$ ");
            while (!scan.hasNextDouble()) {
                System.out.println("Entrada inválida! Digite um valor numérico válido.");
                scan.next();
            }
            deposito = scan.nextDouble();
            if (deposito <= 0) {
                System.out.println("Valor inválido! O depósito deve ser maior que zero.");
            }
        } while (deposito <= 0);
        
        System.out.println("Depósito realizado com sucesso!");
        return deposito;
    }

    public static double transferir(Scanner scan, double saldo) {
        double transferencia;
        do {
            System.out.println("Digite o valor a transferir: R$ ");
            while (!scan.hasNextDouble()) {
                System.out.println("Entrada inválida! Digite um valor numérico válido.");
                scan.next();
            }
            transferencia = scan.nextDouble();
            if (transferencia <= 0 || transferencia > saldo) {
                System.out.println("Saldo insuficiente ou valor inválido! Tente novamente.");
            }
        } while (transferencia <= 0 || transferencia > saldo);
        
        System.out.println("Transferência realizada com sucesso!");
        return transferencia;
    }

    public static double sacar(Scanner scan, double saldo) {
        double saque;
        do {
            System.out.println("Digite o valor a sacar: R$ ");
            while (!scan.hasNextDouble()) {
                System.out.println("Entrada inválida! Digite um valor numérico válido.");
                scan.next();
            }
            saque = scan.nextDouble();
            if (saque <= 0 || saque > saldo) {
                System.out.println("Saldo insuficiente ou valor inválido! Tente novamente.");
            }
        } while (saque <= 0 || saque > saldo);
        
        System.out.println("Saque realizado com sucesso!");
        return saque;
    }
}
