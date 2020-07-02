/*
 * O que temos aqui é GET and SET. 
 * Troquei os nomes dos objetos (variáveis) para um melhor entendimento.
 * A variável global passou a se chamar stringGlobal.
 * A variável local passou a se chamar stringLocal.
  
 * método getInicial: 
 * retorna inicioGlobal.
 * Não possui parâmetro. 
 * Não possui instrução.
 * 
 * método setInitial: 
 * Não possui retorno. 
 * Objeto (variável) inicioLocal criado. 
 * inicioGlobal recebe inicioLocal.
 * 
 * This foi utilizado para referenciar o objeto global. 
 */


package Memory_Test;

public class Container {
	private String inicioGlobal = "A";
	
	public String getInitial() {
		return inicioGlobal;
	}	
	
	public void setInitial(String inicioLocal) {
		this.inicioGlobal = inicioLocal;
	}
}
