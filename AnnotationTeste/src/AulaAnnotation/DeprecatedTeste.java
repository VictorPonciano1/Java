package AulaAnnotation;

public class DeprecatedTeste {

	void visualizar() {
		System.out.println("Metodo Visualizar");
	}
	
	@Deprecated
	void exibir() { //DEPRECATED EH UMA ANNOTATION QUE DESCONTINUA O METODO;
		System.out.println("Mostrando metodo exibir deprecated");
	}
}
