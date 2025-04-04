package br.com.cdb.bancodigitalTeste.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cdb.bancodigitalTeste.entity.Cliente;
import br.com.cdb.bancodigitalTeste.service.ClienteService;

@RestController
public class ClienteController {

	private ClienteService clienteService = new ClienteService();
	
	@PostMapping("/add/{nome}/{cpf}") //TEM LIGACAO COM OS VERBOS HTTP, ONDE POST = INSERIR/CRIAR;
	public void addCliente(@PathVariable String nome, @PathVariable Long cpf) {
	
		clienteService.addCliente(nome, cpf);
	}
	
	@GetMapping("/all")
	public ArrayList<Cliente> getAllClientes() {
		return clienteService.getClientes();
	}
}
