/* ALGORITMO/CODIGO SOBRE A CONVERSAO DE TIPOS DO JAVA */

public class Main {

	public static void main(String[] args) {
		
		/* CONVERSAO: IMPLICITA; */
		int a = 10;
		float b = a; //AO SER CONVERTIDO PARA FLOAT, O 10 PASSA A SER 10.0;
		System.out.println(b);
		
		/* CONVERSAO: EXPLICITA; */
		
		//CASTING (CAST): "GARANTIA" DE QUE O TIPO VAI SER CONVERTIDO, ERROS PODEM ACONTECER;
		float c = 10.0f;
		int d = (int) c;
		System.out.println(d);
		
		//PARSING: USO DOS EMPACOTADORES PARA CONVERTER OS TIPOS;
		String texto1 = "150";
		String texto2 = "200";
	
		int t = Integer.parseInt(texto1);
		int t2 = Integer.parseInt(texto2);
		
		//SAIDA DE UM INTEIRO QUE ERA UMA STRING
		System.out.println(t + t2);
	}

}
