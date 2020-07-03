/*
 * Relembrando MAP:
 * Map é uma interface java que contém uma estrutura de dados que permite 
 * trabalhar com uma estrutura de chave e valor. No código abaixo, dentro de <>, temos:
 * String = chave.
 * Customer = valor.
 */

package Escaping_References;

import java.util.HashMap;
import java.util.Map;

public class CadastroClientes {
			
			
	
			// Objeto: Map.
			private Map <String, Clientes> registros;
			
			
			
			// Método construtor.
			// Aqui, estamos instanciando o Map. 
			public CadastroClientes ( ) {
				this.registros = new HashMap<String, Clientes>();		
			}
			
			
			
			// Método para adicionar clientes no Map. 
			public void adicionarCliente (Clientes c) {
				this.registros.put(c.getName(), c);
			}
				
			
				
			// Método getClientes.
			// É um método, que possui como retorno um Map. 
			// A ideia aqui é a de que possamos acessar os registros dentro do Map "com iteração". 
			public Map <String, CadastroClientes> getClientes() {
			return this.registros;
			}
			
			
}
