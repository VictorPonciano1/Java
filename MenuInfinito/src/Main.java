import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeiro, digite os dois numeros da sua calculadora.");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();	
		
		int opcao = 0;	
		
		System.out.println("1- SOMA");
		System.out.println("2- SUBTRACAO");
		System.out.println("3- SAIR");
		
		while (true) {
			System.out.print("Digite sua opção: ");
			switch (opcao) {
			case 1:
				System.out.println("1- SOMA = " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("2- SUBTRACAO = " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("3- PROGRAMA FINALIZADO");
				break;
			}
			
			if (opcao == 3) {
				break;
			}
		
		}

		scanner.close();
	}
}
