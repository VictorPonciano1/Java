import java.util.Scanner;

public class SistemaSoma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o valor 1:");
		valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2:");
		valor2 = scanner.nextInt();
		
		int resultado = valor1 + valor2;
		System.out.println("Soma = " + resultado);
		
		if (valor1 > valor2) {
		System.out.println("Uma subtracao com resultado positivo eh possivel");
		}
		
		scanner.close();
	}

}
