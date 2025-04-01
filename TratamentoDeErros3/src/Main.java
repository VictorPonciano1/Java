import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		try {
			VerificarIdade(idade);
		} catch (MinhaExcecao e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		
		scanner.close();
	}

	private static void VerificarIdade(int idade) throws MinhaExcecao {
		
		if(idade < 18) {
			throw new MinhaExcecao("Menor de Idade, acesso negado.");
		}
	}
}
