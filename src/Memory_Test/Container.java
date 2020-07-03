/*
 * O que temos aqui � GET and SET. 
 * Troquei os nomes dos objetos (vari�veis) para um melhor entendimento.
 * A vari�vel global passou a se chamar stringGlobal.
 * A vari�vel local passou a se chamar stringLocal.
  
 * m�todo getInicial: 
 * retorna inicioGlobal.
 * N�o possui par�metro. 
 * N�o possui instru��o.
 * 
 * m�todo setInitial: 
 * N�o possui retorno. 
 * Objeto (vari�vel) inicioLocal criado. 
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
