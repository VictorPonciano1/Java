package adapters.in;

import java.util.Scanner;
import domain.usecases.CadastrarCliente;

public class ConsoleAdapter {

	private final CadastrarCliente cadastrarCliente;
	
	public ConsoleAdapter(CadastrarCliente cadastrarCliente) {
		this.cadastrarCliente = cadastrarCliente;
	}
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente:");
		String nome = scanner.nextLine();
		System.out.println("Digite o e-mail do cliente:");
		String email = scanner.nextLine();
		
		cadastrarCliente.executar(nome, email);
		System.out.println("Cliente cadastrado com sucesso!");
	}
}
