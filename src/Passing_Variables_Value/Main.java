/*
 * Vamos testar o comportamento entre STACK E HEAP. 
 * Registros importantes em pullrequest.
 */

package Passing_Variables_Value;

public class Main {

	public static void main(String[] args) {
		int localValue = 5;
		// chamada do método calculate, sendo passado a variável localValue
		// nos parâmetros. 
		calculate(localValue);
		System.out.println(localValue);
	}
	// Criação de um novo método que será chamado no método main.
	// public: poderá ser chamado de qualquer local da aplicação.
	// static: método poderá ser chamado, sem que seja necessário instanciá-lo.
	// void: retornará vazio.
	// calculate: nome do método.
	// argumentos: como parâmetro, está sendo passado a variável calcValue, 
	// do tipo int. 
	public static void calculate (int calcValue) {
		// corpo do método.
		calcValue = calcValue * 100;
	}
}
