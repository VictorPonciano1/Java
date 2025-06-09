package adapters.out;

import domain.model.Cliente;
import domain.ports.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

//IMPLEMENTA A INTERFACE 
public class ClienteRepositoryEmMemoria implements ClienteRepository {

	private List<Cliente> clientes = new ArrayList<>();
	
	public void salvar(Cliente cliente) {
		clientes.add(cliente); 
	}
	
	public List<Cliente> listarTodos() {
		return clientes;
	}
	
}
