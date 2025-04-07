package colecao;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Tadeu");
		nomes.add("Bianca");
		nomes.add("Pedro");
		nomes.add("Arthur");
		nomes.add("Kleber");
		nomes.add("Joâo");
		
		
		System.out.println(nomes);
		
		
		System.out.println(nomes.size());
		
		nomes.remove(2);
		
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		boolean contem = nomes.contains("Kleber");
		System.out.println("Contem kleber?\n" + contem);
		
		System.out.println(nomes.get(4));
		
		nomes.set(3, "Fabiana");
		System.out.println(nomes);
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}

		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.indexOf("Pedro");
		
		System.out.println(nomes.indexOf("Fabiana"));
		
	}

}
		
		
	