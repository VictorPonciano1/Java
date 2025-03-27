import java.util.Scanner;

public class CondicionalDois {

	public static void main(String[] args) {

		//ACHO QUE NAO VOU PRECISAR DO SCANNER;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para o contador: ");
		int contador = scanner.nextInt();
		
		while (contador < 0) {
			System.out.println("Contagem: " + contador);
			contador--;
		}	
		
		scanner.close();
	}

}
