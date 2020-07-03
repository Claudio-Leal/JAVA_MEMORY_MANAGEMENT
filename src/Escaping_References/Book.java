/*
 * Para que possamos entender o conceito de Escaping References,
 * � importante entender o conceito de encapsulamento.
 * Dentro de uma classe (como esta), temos diversos dados encapsulados,
 * cujo acesso precisa ser muito controlado. 
 * 
 * Observemos que tituloGlobal e autor s�o vari�veis que n�o poder�o ser
 * modificadas "acidentalmente" de fora da classe, por conta do modificador "private" que receberam.
 * Estas vari�veis s� podem ser acessadas modificadas pelos m�todos aqui existentes, 
 * ou por m�todos construtores se estes existissem. Com isso, temos um s�lido controle 
 * sobre estas duas vari�veis.
 */


package Escaping_References;

public class Book {
	// Vari�veis.
	private String tituloGlobal;
	private String autor;
	
	// M�todo get. 
	public String getTitulo () {
		return tituloGlobal;
	}
	// M�todo set.
	public void setTitulo (String tituloLocal) {
		this.tituloGlobal = tituloLocal;		
	}	
}
