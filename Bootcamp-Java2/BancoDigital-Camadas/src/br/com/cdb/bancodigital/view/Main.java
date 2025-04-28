package br.com.cdb.bancodigital.view;

import br.com.cdb.bancodigital.service.ClienteService;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o seu CPF: ");
		long cpf = scanner.nextLong();
	
		ClienteService clienteService = new ClienteService();
		if (clienteService.addCliente(nome, cpf)) {
			System.out.println("Cliente adicionado com sucesso!");
		} else {
			System.out.println("Houve um erro!");
		}
		
		scanner.close();
	}
}
