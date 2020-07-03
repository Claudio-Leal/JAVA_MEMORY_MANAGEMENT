/*
 * Executando novo commit. 
 */

package Stack_Exemplo;

public class Stack_Exemplo {

	public static void main(String[] args) {
		int valorInicial = 7;
		int valorFinal = calcular(valorInicial);
		System.out.println("Este é o valor final: " + valorFinal + "!");
	}
	public static int calcular (int dados) {
		int valorTemporario = dados;
		int novoValor = valorTemporario * 2;
		return novoValor;
	}
}
