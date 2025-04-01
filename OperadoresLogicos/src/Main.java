import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		//OPERADOR E (AND): EXEMPLO;
		System.out.print("Digite seu sexo: ");
		String sexo = scanner.nextLine().toLowerCase();
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		boolean aposentado;
		
		if (sexo == "masculino" && idade >= 65) {
			aposentado = true;
			System.out.println("Aposentado? " + aposentado);
		} else {
			aposentado = false;
			System.out.println("Aposentado? " + aposentado);
		}
		
		//ESPACAMENTO 1;
		System.out.println("");
		
		//OPERADOR OU (OR): EXEMPLO;
		System.out.print("Digite sua media geral: ");
		int mediaF = scanner.nextInt();
		System.out.println("Digite a nota da sua prova final: ");
		int provaF = scanner.nextInt();
		
		boolean aprovado;
		
		if (mediaF >= 6 || provaF >= 6) {
			aprovado = true;
			System.out.println("Aprovado? " + aprovado);
		} else {
			aprovado = false;
			System.out.println("Aprovado? " + aprovado);
		}
		
		//ESPACAMENTO 2;
		System.out.println("");
		
		//OPERADOR UNARIO: EXEMPLOS;
		int i = 3;
		System.out.print("Valor atual de i: " + i);
		
		// i++; POS FIXADO;
		// ++i; PRE FIXADO;
		
		System.out.println("\nPrimeiro o POS FIXADO:");
		
		//DIFERENCA ENTRE ELES - POS FIXADO (i++): PRIMEIRO PEGA/IMPRIME O VALOR E DEPOIS INCREMENTA;
		System.out.println("Imprime primeiro: " + i++);
		System.out.println("Depois incrementa: " + i);
		
		System.out.println("Agora o PRE FIXADO:");
		
		//DIFERENCA ENTRE ELES - PRE FIXADO (++i): PRIMEIRA INCREMENTA E DEPOIS PEGA/IMPRIME O VALOR;
		System.out.println("Primeiro incrementa: " + ++i);
		System.out.println("Depois imprime: " + i);
		
		//ESPACAMENTO 3;
		System.out.println("");
		
		//TERNARIO CONDICIONAL - UMA ESPECIE DE IF SIMPLIFICADO;
		String texto = "";
		int idade2 = 20;
		
		texto = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		//PARTE DA "?" = SE FOR VERDADE (IF);
		//PARTE DO ":" = SE FOR FALSO (ELSE);
		
		//OPERADORES COM O "IGUAL" (=) - ATRIBUICAO
		int pokemon = 1;
		System.out.println("Peguei cinco pokemon.");
		pokemon += 5; //PARA ADICAO, USAR O "+=" AO INVES DE: pokemon = pokemon + 5;
		System.out.print("Pokemon atuais: " + pokemon);
		
		//FECHAMENTO DO SCANNER;
		scanner.close();
	}
}
