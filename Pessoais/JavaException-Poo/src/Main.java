import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {

	//METODO MAIN
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//NOME
		System.out.println("Digite seu nome");
		String nomeP = scanner.nextLine();
		
		//IDADE
		System.out.println("Digite sua idade");
		int idadeP = scanner.nextInt();
		
		//CPF
		System.out.println("Digite seu CPF");
		long cpfP = scanner.nextLong();
		
		//OBJETO PESSOA
		Pessoa pessoa = new Pessoa(nomeP, idadeP, cpfP);
		pessoa.getNome();
		pessoa.getIdade();
		
		//EXCEPTION 1: CPF INVALIDO
		try {
			pessoa.getCpf();
		} catch (NumberFormatException e) {
			System.out.println("CPF possui caracteres nao numericos");
		}
		
		//EXECPTION 2: IDADE FORA DO PERMITIDO
		try {
			VerificaIdade(idadeP);
		} catch (MinhaException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
	//METODO DE EXCEPTION PROPRIO - USADO PARA VERIFICAÇÃO DA IDADE	
	private static void VerificaIdade(int idadeP) throws MinhaException {
		if (idadeP < 18) {
			System.out.println("Menor de Idade: impossivel finalizar cadastro");
		}
	}
}
