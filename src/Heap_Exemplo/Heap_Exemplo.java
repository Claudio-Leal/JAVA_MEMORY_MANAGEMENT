package Heap_Exemplo;

import java.util.ArrayList;
import java.util.List;

public class Heap_Exemplo {

	public static void main(String[] args) {
		List<String> minhaLista = new ArrayList<String>();
		minhaLista.add("Um");
		minhaLista.add("Dois");
		minhaLista.add("Tr�s");
		minhaLista.add("Quatro");
		// chamada do m�todo printlist, passando a lista "minhaLista" como par�metro.  
		imprimirLista (minhaLista);		
	}	
	// m�todo imprimirLista criado. 
	// detalhes na imagem em pullrequest.  
	public static void imprimirLista (List<String> dados) {
		System.out.println(dados);
	}	
}
