import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double resultado = 0;
		
		try {
			resultado = divisao(10, 0);
		} catch (DivisaoPorZeroException e) {
			resultado = 10/e.getValorPadrao();
			System.out.println(e.getMessage());
		} finally {
			System.out.println(resultado);
		}
		
		scanner.close();
	}

	private static double divisao(int dividendo, int divisor) throws DivisaoPorZeroException {
	
		double quociente = 0;
		
		if (divisor == 0) {
			throw new DivisaoPorZeroException("Tentou dividir por zero, recebeu o resultado do "
					+ "tratamento");
		}
		
		quociente = dividendo / divisor;
		
		return quociente;
	}

}
