/*
 * Apenas para exemplificar que a palavra chave const � reservada,
 * e que n�o � poss�vel utiliz�-la em JAVA. Um erro de sintaxe ocorre quando
 * tentamos efetuar esta declara��o. 
 */

package Final_Keyword;

public class Main {

	public static void main(String[] args) {
		int localValue = 5;
		calculate (localValue);
		System.out.println(localValue);
		// const String textoString = "Hello Word";
		String textoString = "Hello Word";
	}
	public static void calculate (int calcValue) {
		calcValue = calcValue * 300;
	}
}
