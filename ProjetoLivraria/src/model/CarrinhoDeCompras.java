package model;
import java.util.ArrayList;

public class CarrinhoDeCompras {

	public ArrayList<Livro> listaDeLivros = new ArrayList<Livro>(); 
	
	protected double procoTotal;
	
	public Livro livroGenerico;
	public LivroFisico livroF1;
	public EBook eBook1;
	
	public void addLivro(Livro livroGenerico, LivroFisico livroF1, EBook eBook1) {
		listaDeLivros.add(livroGenerico);
		listaDeLivros.add(livroF1);
		listaDeLivros.add(eBook1);
	}
	
	//NOVO ATRIBUTO/METODO;
	public double getPrecoTotal() {
		return procoTotal;
	}
	//CALCULAR PRECO TOTAL DE TODOS OS LIVROS;
	public void calcularTotal() {
		this.procoTotal += livroGenerico.preco + livroF1.preco + eBook1.preco;
	}
}
