package aulaEstruturadeDados.teste;

import java.util.ArrayList;

public class ArrayListTeste {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList(2);
		
		lista.add("Ramon"); // Inserir o elemento na ultima posição da lista
		
		lista.add(1, "Rodrigues"); // Inserir o elemento na posição ddesejada
		
		//lista.addAll(lista); // Inserir uma lista em outra à partir da ultima posição
		
		//lista.addAll(1, lista); // Inserir uma lista em outra à partir da posição desejada
		
		//lista.clear(); // Limpa todos os elementos da lista
		
		//lista.clone(); // Retorna uma cópia superficial da lista
		
		//lista.contains("Ramon"); // verifica se o elemento existe dentro da lista e retorna true ou false
		
		//lista.containsAll(lista); // verifica se todos os elementos de uma lista pertecem à outra, retorna um boolean
		
		//lista.ensureCapacity(0); // Não compreendi a necessidade
		
		System.out.println(lista);
		
	}

}
