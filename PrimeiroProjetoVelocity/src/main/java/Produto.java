public class Produto {

	//ATRIBUTOS;
	private int id;
	private String nome;
	private double preco;
	
	//CONSTRUTOR;
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	//ENCAPSULAMENTO;
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
}
