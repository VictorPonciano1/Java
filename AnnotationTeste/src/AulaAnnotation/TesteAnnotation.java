//CLASSE MAIN QUE VAI PUXAR AS INFORMAÇÕES DA ANNOTATION;

package AulaAnnotation;

public class TesteAnnotation {
	public static void main (String[] args) {
	
		//CRIANDO OBJETO PARA CHAMAR A CLASSE COM O USO DA ANNOTATION;
		DeprecatedTeste dep = new DeprecatedTeste();
		dep.visualizar();
		dep.exibir();
		
	}
}
