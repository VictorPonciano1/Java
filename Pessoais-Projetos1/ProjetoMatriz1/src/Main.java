import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da Matriz");
		int tam1 = scanner.nextInt();
		int tam2 = scanner.nextInt();
		
		int i, j;
		
		int v1[][] = new int[tam1][tam2];
		
		for (i = 0; i < v1.length; i++) {
			for (j = 0; j < v1.length; i++) {
				
			}
		}
		
		System.out.println("Matriz: |" + v1 + "|");
		
		scanner.close();
	}

}
