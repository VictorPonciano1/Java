package br.com.cdb.bancodigitalTeste.dao;

import java.util.ArrayList;
import br.com.cdb.bancodigitalTeste.entity.Cliente;

public class ClienteDAO { //DAO = DATA ACESS OBJECT;
	
	ArrayList<Cliente> listaClientes = new ArrayList<>();

	public void save(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public ArrayList<Cliente> listAll() {
		return listaClientes;
	}
}
