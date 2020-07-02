/*
 * Resumo:
 * Classe Main é criada.
 * instância da classe Main é criada. Chama-se main. 
 * main chama o método start, que pertence à classe Main.  
 * 
 * --------------------------------
 * 
 * Método start entra em ação.
 * Nele, a String last é iniciada com o valor "Z".
 * A isntância container, da classe Container, é criada.
 * Neste momento, a variável inicioGlobal vale "A".
 * O método setInicial é chamado. Neste momento, é passado para o objeto inicioLocal a String "C".
 * As instruções de setInitial entra em ação. This opera, fazendo referência à variável inícioGlobal que possui escopo global. 
 * Neste momento temos:
 * last = "Z".
 * inicioGlobal = "A".
 * inicioLocal recebe o valor passado = "C".
 * inicioGlobal = "C". Ele permanece com "C". 
 * 
 * --------------------------------
 * 
 * Método another entra em ação. 
 * Neste momento, temos:
 * inicioGlobal = "C".
 * last = "Z".
 * As instruções de another começam a ser executadas. São passadas para este método:
 * container = "C" = initialHolder. 
 * last = "Z" = newInitial.
 * newInitial chama o método toLowerCase. Entendo que "Z" deveria passar a ser "z". Mas não enxerguei isso no debug.
 * initialHolder chama o método setInitial, passando "B". Então:
 * inicioLocal = "B".
 * this entra em ação e inicioGlobal recebe null.
 * inicioGlobal recebe "A" novamente.
 * Agora sim, inicioGlobal recebe a nova atribuição "B". 
 *  
 * Então temos as seguintes execuções:
 * System.out.println(initialHolder.getInitial()); = "A"
 * System.out.println(newInitial); = "Z"
 * System.out.println(container.getInitial()); = "B"
 * 
 * --------------------------------
 * 
 * 
 * Dúvidas:
 * Porque newInitial não passou para "z"?
 * 
 * --------------------------------
 * 
 * Comentários sobre as instâncias de Container:
 * 1ª instância criada = container = passada para initialHolder em another = "B" é atribuída a getInitial
 * 2º instância criada = initialHolder
 * 3º instância criada = initial2 = initialHolder
 * Obs.: não vi papel nenhum para initial2. 
 * 
 * --------------------------------
 * 
 * Por minha conta, inseri alguns sout, para entender o que acontece durante a execução. 
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
		System.out.println("Execução 3 - getInitial na 1º instância de Container (container) = " + container.getInitial());
		System.out.println("Execução 5 - valor de last = " + last);
	}	
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;		
		System.out.println("Execução 1 - newInitial - recebeu toLowerCase, mas não funcionou = " + newInitial);
		System.out.println("Execução 2 - getInitial na 2ª instância de Container (initialHolder) = " + initialHolder.getInitial());
		System.out.println("Execução 4 - getInitial na 3ª instância de Container (initial2) = " + initial2.getInitial());
	}
}