/*
 * Relembrando MAP:
 * 
 * Map é um tipo de coleção de dados (de uma forma mais sofisticada — um tipo de estrutura de dados abstrata), 
 * em que os dados são armazenados em pares, que contêm uma chave única e um valor mapeado para essa chave. 
 * E devido à essa singularidade de cada chave armazenada, não há par duplicado na coleção.
 * 
 * No caso abaixo:
 * String = chave.
 * Customer = valor.
 * 
 * Map está bem relembrado,...estou entendendo o código, mas os problemas com o "valor" do Map,
 * no caso, Clientes, permanece. 
 * 
 * 
 * Lembrando que esta é uma classe, que poderá ser chamada e instanciada através de outra classe. 
 */

package Escaping_References;

import java.util.HashMap;
import java.util.Map;

public class CadastroClientes {	
			// Objeto: Map.			 
			private Map <String, Clientes> registros;
			
			
			
			// Método construtor.
			// Aqui, estamos instanciando o Map. 
			// HashMap implementa Maps. 
			public CadastroClientes ( ) {
				this.registros = new HashMap<String, Clientes>();	
			}
			
			
			
			// Método para adicionar registros (clientes) ao Map. 
			public void adicionarClientes (Clientes c) {
				this.registros.put(c.getName(), c);
			}
				
			
				
			// Método getClientes.
			// É um método, que possui como retorno um Map.
			// A ideia aqui é a de que possamos acessar os registros dentro do Map com iteração for. 
			public Map <String, Clientes> getClientes() {
			return this.registros;
			}			
}
