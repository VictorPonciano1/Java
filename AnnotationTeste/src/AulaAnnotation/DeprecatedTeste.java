package AulaAnnotation;

public class DeprecatedTeste {

	void visualizar() {
		System.out.println("Metodo Visualizar"); //METODO EXIBIDO, SEM SER AFETADO PELA ANNOTATION
	}
	
	@Deprecated
	void exibir() { //DEPRECATED EH UMA ANNOTATION QUE DESCONTINUA O METODO;
		System.out.println("Mostrando metodo exibir deprecated");
	}
}
