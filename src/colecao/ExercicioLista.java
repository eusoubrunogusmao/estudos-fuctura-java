package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExercicioLista {
	
	public static void main(String[] args) {
		
//- 1) Crie uma Lista com vinte números aleatórios.
//    
//    **Solução sugerida:**
//    
//    ```java
//    Random r = new Random(); //para criar valores aleatorios
//    List<Integer> numeros = new ArrayList<>();
//    
//    for(int i = 0; i < 10; i++) {
//    numeros.add(r.nextInt(101)); //serão inseridos 10 valores de 0 a 100
//    
//    }
//    ```
//    
//
//---
//
//- 2) Adicione o número 11 à Lista criada no exercício anterior.
//    
//    **Solução sugerida:**
//    
//    ```java
//    numeros.add(11);
//    ```
//    
//
//---
//
//- 3) Remova o número na 5ª posição da Lista.
//    
//    **Solução sugerida:**
//    
//    ```java
//    numeros.remove(4);
//    ```
//    
//
//---
//
//- 4) Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.
//    
//    **Solução sugerida:**
//    
//    ```java
//    List<Integer> novaLista = new ArrayList<>();
//    novaLista.add(12);
//    novaLista.add(13);
//    novaLista.add(14);
//    novaLista.add(15);
//    
//    numeros.addAll(novaLista);
//    ```
//    
//
//---
//
//- 5) Encontre o comprimento da Lista resultante.
//    
//    **Solução sugerida:**
//    
//    ```java
//    System.out.println(numeros.size());
//    ```
//    
//
//---
//
//- 6) Verifique se o número 8 está presente na Lista.
//    
//    **Solução sugerida:**
//    
//    ```java
//    boolean contem8 = numeros.contains(8);
//    System.out.println("Contém 8? " + contem8);
//    ```
//    
//
//---
//
//- 7) Inverta a ordem dos elementos na Lista.
//    
//    **Solução sugerida:**
//    
//    ```java
//    Collections.reverse(numeros);
//    ```
//    
//
//---
//
//- 8) Remova todos os números pares da Lista.
//    
//    **Solução sugerida:**
//    
//    ```java
//    //solução mais extensa
//    List<Integer> impares = new ArrayList<>();
//    
//    for(int i = 0; i < numeros.size(); i++) {
//    		if(numeros.get(i) % 2 != 0) {
//    			impares.add(numeros.get(i));
//    		}
//    	}
//    	
//    	numeros.removeAll(numeros);
//    	numeros.addAll(impares);
//    	System.out.println(numeros);
//    	
//    //solução com ***lambda***
//    numeros.removeIf(n -> n % 2 == 0);
//    System.out.println(numeros);
//    ```
//    
//
//---
//
//- 9) Substitua o valor da 3ª posição por 30.
//    
//    **Solução sugerida:**
//    
//    ```java
//    numeros.set(2, 30);
//    ```
//    
//
//---
//
//- 10) Ordene a Lista de forma crescente.
//    
//    **Solução sugerida:**
//    
//    ```java
//    Collections.sort(numeros);
//    System.out.println(numeros);
//    ```
		
		
System.out.println("\n1) Crie uma Lista com vinte números aleatórios.\n");
		Random r = new Random(); 
		List<Integer> numeros = new ArrayList<>();

		for(int i = 0; i < 20; i++) {
		numeros.add(r.nextInt(100) + 1); 
		}
		
		System.out.println(numeros);

System.out.println("\n2) Adicione o número 11 à Lista criada no exercício anterior.\n");
		numeros.add(11);
		System.out.println(numeros);
		
System.out.println("\n3) Remova o número na 5ª posição da Lista.\n"); 
		
		numeros.remove(4);
		
		System.out.println(numeros);

System.out.println("\n4) Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.\n");
		

	    List<Integer> novaLista = new ArrayList<>();
	    novaLista.add(12);
	    novaLista.add(13);
	    novaLista.add(14);
	    novaLista.add(15);
	    
	    numeros.addAll(novaLista);
	    
	    System.out.println(numeros);

System.out.println("\n5) Encontre o comprimento da Lista resultante.\n");
	    

	    System.out.println(numeros.size());

System.out.println("\n6) Verifique se o número 8 está presente na Lista.\n");


	    boolean contem8 = numeros.contains(8);
	    System.out.println("Contém 8? " + contem8);

	
System.out.println("\n7) Inverta a ordem dos elementos na Lista.\n");

	    Collections.reverse(numeros);
	    System.out.println(numeros);
	    
System.out.println("\n8) Remova todos os números pares da Lista.\n");

	    List<Integer> impares = new ArrayList<>();
	    
	    for(int i = 0; i < numeros.size(); i++) {
	    		if(numeros.get(i) % 2 != 0) {
	    			impares.add(numeros.get(i));
	    		}
	    	}
	    	
	    	numeros.removeAll(numeros);
	    	numeros.addAll(impares);
	    	System.out.println(numeros);

//	    	solução com ***lambda***
//	      numeros.removeIf(n -> n % 2 == 0);
//	      System.out.println(numeros);

System.out.println("\n9) Substitua o valor da 3ª posição por 30.\n");

	      numeros.set(2, 30);

		System.out.println(numeros);
		
		
System.out.println("\n10) Ordene a Lista de forma crescente.\n");

	    Collections.sort(numeros);
	    System.out.println(numeros);
		
	}

}
