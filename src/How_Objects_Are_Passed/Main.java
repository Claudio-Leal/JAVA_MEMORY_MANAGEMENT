/*
 * Dando continuidade �s aulas anteriores. 
 * Vimos que a passagem por refer�ncia n�o existe em Java.
 * Ent�o a linha que est� comentada com a utiliza��o de BYREF n�o funcionar�.
 * Este c�digo imprimir� o valor de local value, porque o valor 5 n�o ser� modificado
 * na chamada do m�todo. 
 * Dentro do pocote Passing_Variables, existe uma classe que permite a impress�o
 * do novo valor de calcValue, mas para isso, precisei criar uma outra vari�vel.
 * 
 * Como registrado em pullrequest, passar vari�veis para m�todos "por valor" pode se tornar
 * confuso. E isso ocorre porque quando chamamos o m�todo e passamos um objeto como par�metro
 * como vemos aqui (ou seja, vari�vel localValue), o que est� sendo passado � a vari�vel que cont�m 
 * a refer�ncia ao objeto.  
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
