import java.util.Scanner;

public class VariaveisBase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt(); //ENTRADA DE DADOS VIA USUARIO
		
		int idade2 = 33; //NUMERO INTEIRO
		
		char caractere = '$'; //CARACTERE UNICO
		
		String texto = "texto"; //TEXTO
		
		System.out.println(idade2); //PRINT: EXIBIR RESPOSTA
		
		scanner.close();
	}

}
