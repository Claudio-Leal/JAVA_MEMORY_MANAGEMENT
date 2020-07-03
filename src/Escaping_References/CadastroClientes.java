/*
 * Relembrando MAP:
 * 
 * Map � um tipo de cole��o de dados (de uma forma mais sofisticada � um tipo de estrutura de dados abstrata), 
 * em que os dados s�o armazenados em pares, que cont�m uma chave �nica e um valor mapeado para essa chave. 
 * E devido � essa singularidade de cada chave armazenada, n�o h� par duplicado na cole��o.
 * 
 * No caso abaixo:
 * String = chave.
 * Customer = valor.
 * 
 * Map est� bem relembrado,...estou entendendo o c�digo, mas os problemas com o "valor" do Map,
 * no caso, Clientes, permanece. 
 * 
 * 
 * Lembrando que esta � uma classe, que poder� ser chamada e instanciada atrav�s de outra classe. 
 */

package Escaping_References;

import java.util.HashMap;
import java.util.Map;

public class CadastroClientes {	
			// Objeto: Map.			 
			private Map <String, Clientes> registros;
			
			
			
			// M�todo construtor.
			// Aqui, estamos instanciando o Map. 
			// HashMap implementa Maps. 
			public CadastroClientes ( ) {
				this.registros = new HashMap<String, Clientes>();	
			}
			
			
			
			// M�todo para adicionar registros (clientes) ao Map. 
			public void adicionarClientes (Clientes c) {
				this.registros.put(c.getName(), c);
			}
				
			
				
			// M�todo getClientes.
			// � um m�todo, que possui como retorno um Map.
			// A ideia aqui � a de que possamos acessar os registros dentro do Map com itera��o for. 
			public Map <String, Clientes> getClientes() {
			return this.registros;
			}			
}
