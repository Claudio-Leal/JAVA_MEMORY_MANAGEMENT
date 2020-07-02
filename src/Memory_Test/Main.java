/*
 * Resumo:
 * Classe Main é criada.
 * instância da classe Main é criada. Chama-se main. 
 * main chama o método start, que pertence à classe Main.  
 * --------------------------------
 * Método start entra em ação.
 * Nele, a String last é iniciada com o valor "Z".
 * A isntância container, da classe Container, é criada.
 * O método setInicial é chamado, e para ele é passado a String "C". Será atribuída à inicioLocal. 
 * A String "C", após ser processada pela classe Container, atribuirá este mesmo valor à inicioGlobal.
 * O próprio método start chama o método another, passando dois parâmetros:
 * 1 - container, que foi setado com "C".
 * 2 - last, que é igual a "Z".
 * Impressão do valor que retornou para getInicial, no caso "C".
 * --------------------------------
 * Método another é processado (quando chamado pelo método start).
 * Parâmetro 1: Instância de Container é criada. Chama-se initialHolder. Para ela é passada o valor "C", da instância container.   
 * Parâmetro 2: String newInitial é criada. Para ela é passada o valor "Z", da variável last. 
 * Instruções:
 * newInitial chama o método toLowerCase. Então "Z" é transformado em "z". 
 * Instância initialHolder chama o método setInicial, e passa B para ele. Este valor será processado pela classe Container 
 * e atribuído ao objeto inicioGlobal. Neste momento, inicioGlobal recebe o valor "B". 
 * Uma nova instância de Container é criada: chama-se initial2. Aqui, valor de inicioGlobal é igual a "A".  
 * instância initialHolder = instância initial2, então initialHolder recebe "A", presumo. 
 * Impressão initialHolder com o valor de getInitial. Presumo que seja "A". 
 * Impressão de newInitial. Presumo que seja "z".  *  
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
