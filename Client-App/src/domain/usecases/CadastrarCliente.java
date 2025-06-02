package domain.usecases;

import domain.model.Cliente;
import domain.ports.ClienteRepository;

public class CadastrarCliente {

	//TRANSFORMA EM "FINAL" - NÃO PODENDO SER ALTERADO
	private final ClienteRepository repository;
	
	//METODO CONSTRUTOR
	public CadastrarCliente(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public void executar(String nome, String email) {
		Cliente cliente = new Cliente(nome, email);
		repository.salvar(cliente);
	}
	
}
