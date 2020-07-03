/*
 * Para que possamos entender o conceito de Escaping References,
 * é importante entender o conceito de encapsulamento.
 * Dentro de uma classe (como esta), temos diversos dados encapsulados,
 * cujo acesso precisa ser muito controlado. 
 * 
 * Observemos que tituloGlobal e autor são variáveis que não poderão ser
 * modificadas "acidentalmente" de fora da classe, por conta do modificador "private" que receberam.
 * Estas variáveis só podem ser acessadas modificadas pelos métodos aqui existentes, 
 * ou por métodos construtores se estes existissem. Com isso, temos um sólido controle 
 * sobre estas duas variáveis.
 */


package Escaping_References;

public class Book {
	// Variáveis.
	private String tituloGlobal;
	private String autor;
	
	// Método get. 
	public String getTitulo () {
		return tituloGlobal;
	}
	// Método set.
	public void setTitulo (String tituloLocal) {
		this.tituloGlobal = tituloLocal;		
	}	
}
