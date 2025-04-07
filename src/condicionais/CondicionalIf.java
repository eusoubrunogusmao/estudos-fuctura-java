package condicionais;

import java.util.Scanner;

public class CondicionalIf {
	
	public static void main (String [] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Informa a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informa a segunda nota: ");
		double nota2 = scan.nextDouble();
	
		System.out.println("Informa a terceira nota: ");
		double nota3 = scan.nextDouble();
				
		double media = (nota1 + nota2 + nota3) / 3;
		
		String situacao;
		
		if (media >= 7) {
		situacao = "aprovado";
				
		} else if (media <= 3) {
		situacao = "reprovado";
				
		} else {
		situacao = "em recuperação";
			
		}
		
//		System.out.println(nome + " está " + situacao);
				
		
		System.out.printf("%s está %s .", nome, situacao);
		
		
		
		
	}

}
