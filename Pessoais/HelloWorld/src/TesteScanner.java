import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Escreva Hello: ");
		String ola = scanner.nextLine();
		System.out.print("Escreva World: ");
		String mundo = scanner.nextLine();
		
		System.out.println(ola + " " + mundo + "!");
	
		scanner.close();
	}
}
