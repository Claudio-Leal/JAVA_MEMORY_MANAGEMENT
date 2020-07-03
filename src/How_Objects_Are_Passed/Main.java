/*
 * Dando continuidade às aulas anteriores. 
 * Vimos que a passagem por referência não existe em Java.
 * Então a linha que está comentada com a utilização de BYREF não funcionará.
 * Este código imprimirá o valor de local value, porque o valor 5 não será modificado
 * na chamada do método. 
 * Dentro do pocote Passing_Variables, existe uma classe que permite a impressão
 * do novo valor de calcValue, mas para isso, precisei criar uma outra variável.
 * 
 * Como registrado em pullrequest, passar variáveis para métodos "por valor" pode se tornar
 * confuso. E isso ocorre porque quando chamamos o método e passamos um objeto como parâmetro
 * como vemos aqui (ou seja, variável localValue), o que está sendo passado é a variável que contém 
 * a referência ao objeto.  
 */


package How_Objects_Are_Passed;

public class Main {

	public static void main(String[] args) {
		int localValue = 5;
		calculate (localValue);	
		System.out.println("O valor de localValue permanece: " + localValue + ".");
	}
	
	public static void calculate (int calcValue) {
	// public static void calculate (byref int calcValue) {
		calcValue = calcValue * 150;
	}
}
