//CLASSE DO OBJETO

public class Pessoa {
	
	private String nome;
	private int idade;
	private long cpf;
	
	public Pessoa(String nomeP, int idadeP, long cpfP) {
		this.nome = nomeP;
		this.idade = idadeP;
		this.cpf = cpfP;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public long getCpf() {
		return cpf;
	}
}
