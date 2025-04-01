/* DEIXEI O CODIGO COMENTADO PARA QUE EU ME ORIENTE MELHOR, ACHO QUE PODE SER UTIL */
package projeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//OBJETO CALCULADORA;
		Calculadora calculadora = new Calculadora();		
		
		//ANTES DE TUDO: QUER ASCENDER O LED DA CALCULADORA?
		System.out.print("Quer ascender os leds? Digite 'S' ou 's' para SIM OU digite 'N' ou 'n' "
				+ "para NAO: ");
		char ledinhos = scanner.next().charAt(0);
		
		calculadora.mandar();
		calculadora.ligar(ledinhos);
		System.out.println(calculadora.getMensagem());
		
		//ESCOLHENDO OPERACAO;
		System.out.println("\nQual operacao quer realizar? Uso os seguintes operadores:" 
		+"\n'+' = Soma;\n'-' = Subtracao;\n'*' = Multiplicacao;\n'/' = Divisao; ");
		char op = scanner.next().charAt(0);
		//ESCOLHENDO OS NUMEROS
		System.out.print("\nEscolha o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Escolha o segundo numero: ");
		double numero2 = scanner.nextDouble();
		
		calculadora.calcular(numero1, numero2, op);
		
		//SAIDA DOS DADOS;
		if (op == '+') {
			System.out.println("Sua operacao: " + op + "+\nSeu resultado = " + calculadora.getSoma());
		} if (op == '-') {
			System.out.println("Sua operacao: " + op + "\nSeu Resultado = " + calculadora.getSubtracao());
		} if (op == '*') {
			System.out.println("Sua operacao: " + op + "\nSeu resultado = " + calculadora.getMultiplicacao());
		} if (op == '/') {
			System.out.println("Sua operacao: " + op + "\nSeu resultado = " + calculadora.getDivisao());
		}
		
		//OPERACOES NOVAS - SOMA DE QUADRADOS E VERIFICAR MEDIA;
		System.out.println("\nQual sua nova operacao?\n'Q' ou 'q' = Soma de Quadrados;"
		+ "\n'M' ou 'm' = verificar se voce esta aprovado;");
		char op2 = scanner.next().charAt(0);
		System.out.print("Escolha o primeiro numero (Caso de media sera a nota um): ");
		double numero3 = scanner.nextDouble();
		System.out.print("Escolha o segundo numero (Caso de media sera a nota dois): ");
		double numero4 = scanner.nextDouble();
		
		calculadora.calcular2(op2, numero3, numero4);
		calculadora.aprovar();
		
		if (op2 == 'Q' || op2 == 'q') {
			System.out.println("Sua soma de quadrados = " + calculadora.getSomaQ());
		} if (op2 == 'M' || op == 'm') {
			System.out.println("Sua media = " + calculadora.getMedia() + ". Esta aprovado? " 
		+ calculadora.isAprovado());
		}
		
		scanner.close();
	}
}
