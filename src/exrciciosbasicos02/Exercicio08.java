package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		
//		08 Escreva um programa que leia o preço de um produto e a forma de pagamento escolhida pelo cliente: 
//
//			→ 1 - em espécie
//			→ 2 - cartão de crédito
//			→ 3 - cartão de débito 
//
//			Mostre o valor final da compra. 
//
//			Considere que o produto tem 10% de desconto se for pago em espécie ou no cartão de débito e não tem desconto se for pago no cartão de crédito.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do produto: ");
		double preco = scan.nextDouble();
		
		System.out.println("Informe a forma de pagamento (1 - espécie, 2 - crédito, 3 - débito): ");
		int forma = scan.nextInt();
		
		double valorFinal;
		
		if (forma == 1 || forma == 3) {
			valorFinal = preco * 0.9;
			
		} else {
			valorFinal = preco;
			
		}
		
			System.out.println("Valor final da compra = R$ " + valorFinal);
		

	}

}
