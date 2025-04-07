package sitema_banco_kleber;

import java.util.Scanner;

public class BancoKleber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		double saldo = 1000.0;
				 
		
		String menu = """
				Escolha uma das opções:
				1 - Depositar
				2 - Transferir
				3 - Sacar
				4 - Sair
				""";
		
		System.out.println(menu);
		int opcao = scan.nextInt();
		
		saldo = switch(opcao) {
		case 1 -> {
			System.out.println("Informe o valor para o deposito: ");
			double deposito = scan.nextDouble();
			
			if (deposito > 0) {
				yield saldo += deposito;
				System.out.println("Deposito realizado com sucesso!");
			} else {
				System.out.println("Valor inválido!");
			}
		}
		
		case 2 -> {
			System.out.println("Informe o valor para a transferência: ");
			double transferencia = scan.nextDouble();
			
			if (transferencia > 0 && transferencia <= saldo) {
				yield saldo - transferencia;
				System.out.println("Transferência realizada com sucesso!");
			} else {
				System.out.println("Valor inválido!");
			}
		}
		
		case 3 -> {
			System.out.println("Informe o valor para o saque: ");
			double saque = scan.nextDouble();
			
			if (saque > 0 && saque <= saldo) {
				yield saldo - saque;
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Valor inválido!");
			}
		}
		
		case 4 -> {
			System.out.println("Programa encerrado");
		}
		
		default -> {
			System.out.println("Opção inválida!");
			yield saldo;
		}
		};
		
		System.out.println("Saldo atual: " + saldo);
		
		
		
//		switch(opcao) {
//		case 1:
//			System.out.println("Informe o valor para o deposito: ");
//			double deposito = scan.nextDouble();
//			
//			if (deposito > 0) {
//				saldo += deposito;
//				System.out.println("Deposito realizado com sucesso!");
//			} else {
//				System.out.println("Valor inválido!");
//			}
//		break;
//		
//		case 2:
//			System.out.println("Informe o valor para a transferência: ");
//			double transferencia = scan.nextDouble();
//			
//			if (transferencia > 0 && transferencia <= saldo) {
//				saldo -= transferencia;
//				System.out.println("Transferência realizada com sucesso!");
//			} else {
//				System.out.println("Valor inválido!");
//			}
//		break;
//		
//		case 3:
//			System.out.println("Informe o valor para o saque: ");
//			double saque = scan.nextDouble();
//			
//			if (saque > 0 && saque <= saldo) {
//				saldo -= saque;
//				System.out.println("Saque realizado com sucesso!");
//			} else {
//				System.out.println("Valor inválido!");
//			}
//		break;
//		
//		case 4:
//			System.out.println("Programa encerrado");
//		}
//		
//		System.out.println("Saldo atual: " + saldo);
		

	}

}
