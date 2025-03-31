import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dividendo = 10;
		System.out.print("Qual numero ira dividir o 10?");
		int divisor = scanner.nextInt();
		int quociente = 0; 
		
		try {
			 quociente = dividendo / divisor; //QUOCIENTE = RESULTADO DE UMA DIVISAO;
			//POSSIVEL TRATAR MAIS DE UMA EXCECAO EM UM UNICO CATCH, CONHECIDO COMO "MULTI CATCH";
		} catch (ArithmeticException | NullPointerException e) { 
			//POSSIVEL DAR UM "MINI" TRATAMENTO PARA A EXCECAO, PARA QUE O PROGRAMA NAO TRAVE;
			quociente = 10/1; 
			System.out.println("Pegou uma excecao do tipo: " + e.getMessage());
		} finally {
			System.out.println("Resultado da sua divisao = " + quociente + "\nSe o resultado de sua"
					+ " divisao eh = 10, significa que a excecao foi chamada.");
		}
		
		System.out.println("Continuando o programa...");
		
		scanner.close();
	}

}
