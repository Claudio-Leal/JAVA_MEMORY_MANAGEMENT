/*
 * Resumo:
 * Classe Main � criada.
 * inst�ncia da classe Main � criada. Chama-se main. 
 * main chama o m�todo start, que pertence � classe Main.  
 * 
 * --------------------------------
 * 
 * M�todo start entra em a��o.
 * Nele, a String last � iniciada com o valor "Z".
 * A isnt�ncia container, da classe Container, � criada.
 * Neste momento, a vari�vel inicioGlobal vale "A".
 * O m�todo setInicial � chamado. Neste momento, � passado para o objeto inicioLocal a String "C".
 * As instru��es de setInitial entra em a��o. This opera, fazendo refer�ncia � vari�vel in�cioGlobal que possui escopo global. 
 * Neste momento temos:
 * last = "Z".
 * inicioGlobal = "A".
 * inicioLocal recebe o valor passado = "C".
 * inicioGlobal = "C". Ele permanece com "C". 
 * 
 * --------------------------------
 * 
 * M�todo another entra em a��o. 
 * Neste momento, temos:
 * inicioGlobal = "C".
 * last = "Z".
 * As instru��es de another come�am a ser executadas. S�o passadas para este m�todo:
 * container = "C" = initialHolder. 
 * last = "Z" = newInitial.
 * newInitial chama o m�todo toLowerCase. Entendo que "Z" deveria passar a ser "z". Mas n�o enxerguei isso no debug.
 * initialHolder chama o m�todo setInitial, passando "B". Ent�o:
 * inicioLocal = "B".
 * this entra em a��o e inicioGlobal recebe null.
 * inicioGlobal recebe "A" novamente.
 * Agora sim, inicioGlobal recebe a nova atribui��o "B". 
 *  
 * Ent�o temos as seguintes execu��es:
 * System.out.println(initialHolder.getInitial()); = "A"
 * System.out.println(newInitial); = "Z"
 * System.out.println(container.getInitial()); = "B"
 * 
 * --------------------------------
 * 
 * 
 * D�vidas:
 * Porque newInitial n�o passou para "z"?
 * 
 * --------------------------------
 * 
 * Coment�rios sobre as inst�ncias de Container:
 * 1� inst�ncia criada = container = passada para initialHolder em another = "B" � atribu�da a getInitial
 * 2� inst�ncia criada = initialHolder
 * 3� inst�ncia criada = initial2 = initialHolder
 * Obs.: n�o vi papel nenhum para initial2. 
 * 
 * --------------------------------
 * 
 * Por minha conta, inseri alguns sout, para entender o que acontece durante a execu��o. 
 */

package Memory_Test;

public class Main {
	public static void main(String args[]) {			
		Main main = new Main();		 
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.println("Execu��o 3 - getInitial na 1� inst�ncia de Container (container) = " + container.getInitial());
		System.out.println("Execu��o 5 - valor de last = " + last);
	}	
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;		
		System.out.println("Execu��o 1 - newInitial - recebeu toLowerCase, mas n�o funcionou = " + newInitial);
		System.out.println("Execu��o 2 - getInitial na 2� inst�ncia de Container (initialHolder) = " + initialHolder.getInitial());
		System.out.println("Execu��o 4 - getInitial na 3� inst�ncia de Container (initial2) = " + initial2.getInitial());
	}
}