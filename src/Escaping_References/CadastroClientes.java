/*
 * Relembrando MAP:
 * Map � uma interface java que cont�m uma estrutura de dados que permite 
 * trabalhar com uma estrutura de chave e valor. No c�digo abaixo, dentro de <>, temos:
 * String = chave.
 * Customer = valor.
 */

package Escaping_References;

import java.util.HashMap;
import java.util.Map;

public class CadastroClientes {
			
			
	
			// Objeto: Map.
			private Map <String, Clientes> registros;
			
			
			
			// M�todo construtor.
			// Aqui, estamos instanciando o Map. 
			public CadastroClientes ( ) {
				this.registros = new HashMap<String, Clientes>();		
			}
			
			
			
			// M�todo para adicionar clientes no Map. 
			public void adicionarCliente (Clientes c) {
				this.registros.put(c.getName(), c);
			}
				
			
				
			// M�todo getClientes.
			// � um m�todo, que possui como retorno um Map. 
			// A ideia aqui � a de que possamos acessar os registros dentro do Map "com itera��o". 
			public Map <String, CadastroClientes> getClientes() {
			return this.registros;
			}
			
			
}
