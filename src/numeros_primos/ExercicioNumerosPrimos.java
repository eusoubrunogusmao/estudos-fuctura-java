package numeros_primos;

import java.util.Scanner;

public class ExercicioNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int repetir = 1;
		
		System.out.println("Quantos números deseja verificar: ");
		int qtdvezes = scan.nextInt();
		
		repetir++;
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		if(numero <= 1) {
			System.out.println("O número " + numero + " não é PRIMO!");	
		} else if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
			System.out.println("O número " + numero + " é PRIMO!");
		} else if (numero % 2 == 0|| numero % 3 == 0 || numero % 5 == 0|| numero % 7 == 0) {
			System.out.println("O número " + numero + " nâo é PRIMO!");
		} else if (numero % Math.sqrt(numero) == 0) {
			System.out.println("O número " + numero + " nâo é PRIMO!");
		} else {
			System.out.println("O número " + numero + " é PRIMO!");
		}

	}

}
