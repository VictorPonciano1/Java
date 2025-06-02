package domain.ports;

import java.util.List;
import domain.model.Cliente;

public interface ClienteRepository {

	void salvar(Cliente cliente);
	List<Cliente> listarTodos();
	
}
