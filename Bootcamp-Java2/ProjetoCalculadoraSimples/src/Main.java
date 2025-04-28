import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = scanner.nextInt();
		System.out.print("Digite o segundo valor: ");
		int valor2 = scanner.nextInt();
		
		System.out.println("Qual operação deseja fazer?\nDigite + para adição \nDigite - para "
				+ "subtração \nDigite * para multiplicação \nDigite / para divisão");
		char operador = scanner.next().charAt(0);
		
		switch (operador) {
			case '+':
				System.out.println("Soma = " + (valor1 + valor2));
				break;
			case '-':
				System.out.println("Subtração = " + (valor1 - valor2));
				break;
			case '*':
				System.out.println("Multiplicação = " + (valor1 * valor2));
				break;
			case '/':
				System.out.println("Divisão" + (valor1 / valor2));
				break;
				default:
					System.out.println("Operação inválida");
		}
		
		scanner.close();		
	}

}
