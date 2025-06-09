package domain.model;

public class Cliente {
	
	//ATRIBUTOS - CLIENTE
	public String nome;
	public String email;

	//METODO CONSTRUTOR
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ") ";
	}
}
