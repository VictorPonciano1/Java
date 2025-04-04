package br.com.cdb.bancodigitalTeste.entity;

public class Cliente {

	//ATRIBUTOS;
	private String nome;
	private long cpf;
	
	//CONSTRUTOR
	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//GETTERS E SETTERS;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
