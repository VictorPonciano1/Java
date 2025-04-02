 package br.com.cdb.bancodigital.service;

import br.com.cdb.bancodigital.dao.ClienteDAO;
import br.com.cdb.bancodigital.entity.Cliente;

public class ClienteService {

	ClienteDAO clienteDao = new ClienteDAO();
	
	public boolean addCliente(String nome, long cpf) {
		if (!validarCPF(cpf)) { //O SINAL "!" SEMPRE INDICA O "NAO";
			return false;
		} if (!validarNome(nome)) {
			return false;
		}
		
		Cliente cliente = new Cliente();
		cliente.setName(nome);
		cliente.setCpf(cpf);
		
		clienteDao.addCliente(cliente);

		return true;
	}

	private boolean validarCPF(long cpf) {
		//TODO;
		return true;
	}

	private boolean validarNome(String nome) {
		// TODO;
		return true;
	}

}
