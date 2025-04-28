//CLASSE DO OBJETO QUE SERÁ PROGRAMADO

public class Livro {

	//ATRIBUTOS:
	private String titulo;
	private String autor; 
	private String isbn;
	private int anoPublicado; 
	private double preco;
	private int avaliacao;
	
	//GETTERS
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getAnoPublicado() {
		return anoPublicado;
	}
	public double getPreco() {
		return preco;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	
	//CONSTRUTOR 1: PARAMETRIZADO
	public Livro(String titulo, String autor, String isbn, int anoPublicado, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anoPublicado = anoPublicado;
		this.preco = preco;
	}
	
	//CONSTRUTOR 2: COPIA
	public Livro(Livro livro2) {
		this.titulo = livro2.titulo;
		this.autor = livro2.autor;
		this.isbn = livro2.isbn;
		this.anoPublicado = livro2.anoPublicado;
		this.preco = livro2.preco;
	}

	//CONSTRUTOR SCANNER
	public Livro(String tituloInput, String autorInput, String isbnInput, int anoInput, double precoInput, int estrelas) {
		this.titulo = tituloInput;
		this.autor = autorInput;
		this.isbn = isbnInput;
		this.anoPublicado = anoInput;
		this.preco = precoInput;
		this.avaliacao = estrelas;
	}
	
	//EXIBINDO NO CONSOLE: PADRAO
	public void apresentar() {
		System.out.println("Titulo do Livro: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn +
				"\nAno de Publicacao: " + anoPublicado + "\nPreco: " + preco);
	}
	
	//EXIBONDO: SCANNER
	public void apresentarScanner() {
		System.out.println("Titulo do Livro: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn +
				"\nAno de Publicacao: " + anoPublicado + "\nPreco: " + preco + "\nEstrelas (0 a 5): " 
				+ avaliacao);
	}
	

}
