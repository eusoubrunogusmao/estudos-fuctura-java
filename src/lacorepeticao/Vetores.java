package lacorepeticao;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
//		int[] numeros;
//		
//		numeros = new int[5];
		 
				//		 0   1	 2 	 3	 4
		int[] numeros = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		
		numeros[0] = 15;
		numeros[1] = 25;
		numeros[2] = 35;
		numeros[3] = 45;
		numeros[4] = 55;
		
	
		System.out.println("\n" + numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);
		
		for (int num : numeros) {
		    System.out.print(num + " ");
		}


//		String[] nomes = new String[4];
//		
//		
//		nomes[0] = "Java";
//		nomes[1] = "Python";
//		nomes[2] = "C#";
//		nomes[3] = "Go";
//		System.out.println(Arrays.toString(nomes));
//		System.out.println(nomes[3]);
//		
//		for(int i = 0; i < nomes.length; i++) {
//			
//			
//		}

	}

}
