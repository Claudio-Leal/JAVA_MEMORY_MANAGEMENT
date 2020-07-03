package Heap_Exemplo;

import java.util.ArrayList;
import java.util.List;

public class Heap_Exemplo {

	public static void main(String[] args) {
		List<String> minhaLista = new ArrayList<String>();
		minhaLista.add("Um");
		minhaLista.add("Dois");
		minhaLista.add("Três");
		minhaLista.add("Quatro");
		// chamada do método printlist, passando a lista "minhaLista" como parãmetro.  
		imprimirLista (minhaLista);		
	}	
	// método imprimirLista criado. 
	// detalhes na imagem em pullrequest.  
	public static void imprimirLista (List<String> dados) {
		System.out.println(dados);
	}	
}
