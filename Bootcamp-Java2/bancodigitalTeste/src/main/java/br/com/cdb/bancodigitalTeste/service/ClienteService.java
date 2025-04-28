package br.com.cdb.bancodigitalTeste.service;

import java.util.ArrayList;

import br.com.cdb.bancodigitalTeste.dao.ClienteDAO;
import br.com.cdb.bancodigitalTeste.entity.Cliente;

public class ClienteService {

	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public void addCliente(String nome, long cpf) {
		
		//VALIDAR CPF E VALIDAR NOME;
		Cliente cliente = new Cliente(nome, cpf);
		clienteDAO.save(cliente); 
	}
	
	public ArrayList<Cliente> getClientes() {
		return clienteDAO.listAll();
	}
}
