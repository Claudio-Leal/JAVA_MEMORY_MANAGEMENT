/*
 * printList exige a criação do método,...que foi criado automaticamente.
 * Apenas troquei o modificador private para public.  
 */

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
		printList (minhaLista);		
	}
	public static void printList(List<String> dados) {
		System.out.println(dados);		
	}
}
