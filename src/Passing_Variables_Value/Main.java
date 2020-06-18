/*
 * Vamos testar o comportamento entre STACK E HEAP. 
 * Registros importantes em pullrequest.
 */

package Passing_Variables_Value;

public class Main {

	public static void main(String[] args) {
		int localValue = 5;
		// chamada do m�todo calculate, sendo passado a vari�vel localValue
		// nos par�metros. 
		calculate(localValue);
		System.out.println(localValue);
	}
	// Cria��o de um novo m�todo que ser� chamado no m�todo main.
	// public: poder� ser chamado de qualquer local da aplica��o.
	// static: m�todo poder� ser chamado, sem que seja necess�rio instanci�-lo.
	// void: retornar� vazio.
	// calculate: nome do m�todo.
	// argumentos: como par�metro, est� sendo passado a vari�vel calcValue, 
	// do tipo int. 
	public static void calculate (int calcValue) {
		// corpo do m�todo.
		calcValue = calcValue * 100;
	}
}
