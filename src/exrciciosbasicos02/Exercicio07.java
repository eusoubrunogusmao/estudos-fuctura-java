package exrciciosbasicos02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
//		07 Escreva um programa que leia dois números inteiros e um operador aritmético (+, -, *, /) e realize a operação correspondente. Se o operador não for válido, mostre uma mensagem de erro.
		
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		char operador;
		
		System.out.println("Digite um número inteiro: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		numero2 = scan.nextInt();
		
		System.out.println("Digite um operador aritmético (+, -, *, /): ");
		operador = scan.next().charAt(0);
		
		if (operador == '+') {
			System.out.println(numero1 + numero2);
			
		} else if (operador == '-') {
			System.out.println(numero1 - numero2);
			
		} else if (operador == '*') {
			System.out.println(numero1 * numero2);
			
		} else if (operador == '/') {
			System.out.println(numero1 / numero2);
			
		} else {
			System.out.println("Operador inválido.");
			
		}
		
		
		

	}

}
