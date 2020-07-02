/*
 * Resumo:
 * Classe Main � criada.
 * inst�ncia da classe Main � criada. Chama-se main. 
 * main chama o m�todo start, que pertence � classe Main.  
 * --------------------------------
 * M�todo start entra em a��o.
 * Nele, a String last � iniciada com o valor "Z".
 * A isnt�ncia container, da classe Container, � criada.
 * O m�todo setInicial � chamado, e para ele � passado a String "C". Ser� atribu�da � inicioLocal. 
 * A String "C", ap�s ser processada pela classe Container, atribuir� este mesmo valor � inicioGlobal.
 * O pr�prio m�todo start chama o m�todo another, passando dois par�metros:
 * 1 - container, que foi setado com "C".
 * 2 - last, que � igual a "Z".
 * Impress�o do valor que retornou para getInicial, no caso "C".
 * --------------------------------
 * M�todo another � processado (quando chamado pelo m�todo start).
 * Par�metro 1: Inst�ncia de Container � criada. Chama-se initialHolder. Para ela � passada o valor "C", da inst�ncia container.   
 * Par�metro 2: String newInitial � criada. Para ela � passada o valor "Z", da vari�vel last. 
 * Instru��es:
 * newInitial chama o m�todo toLowerCase. Ent�o "Z" � transformado em "z". 
 * Inst�ncia initialHolder chama o m�todo setInicial, e passa B para ele. Este valor ser� processado pela classe Container 
 * e atribu�do ao objeto inicioGlobal. Neste momento, inicioGlobal recebe o valor "B". 
 * Uma nova inst�ncia de Container � criada: chama-se initial2. Aqui, valor de inicioGlobal � igual a "A".  
 * inst�ncia initialHolder = inst�ncia initial2, ent�o initialHolder recebe "A", presumo. 
 * Impress�o initialHolder com o valor de getInitial. Presumo que seja "A". 
 * Impress�o de newInitial. Presumo que seja "z".  *  
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
		System.out.println(container.getInitial());
	}	
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.println(initialHolder.getInitial());
		System.out.println(newInitial);
	}
}
