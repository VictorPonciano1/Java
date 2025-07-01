package application;

import adapters.in.ConsoleAdapter;
import adapters.out.ClienteRepositoryEmMemoria;
import domain.ports.ClienteRepository;
import domain.usecases.CadastrarCliente;

public class Main {

	public static void main(String[] args) {

		ClienteRepository repository = new ClienteRepositoryEmMemoria();
		CadastrarCliente cadastrarCliente = new CadastrarCliente(repository);
		ConsoleAdapter console = new ConsoleAdapter(cadastrarCliente);
		
		console.iniciar();
	}

}
