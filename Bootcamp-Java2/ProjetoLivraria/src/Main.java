import model.Livro;
import model.LivroFisico;
import model.EBook;

import java.util.ArrayList;

import model.CarrinhoDeCompras;

public class Main {
	
	public static void main (String[] args) {
		
		/* CLASSE LIVRO PADRAO */
		Livro livroGenerico = new Livro("Manual de Chave de Fenda", "Engenheiro", "172", 20.0); 
		
		/* LIVRO FISICO */
		LivroFisico livroF1 = new LivroFisico("Diario de um Banana", "Jeff Kinney", "101", 0, 150,
		10.0);

		/* EBOOK */
		EBook eBook1 = new EBook("English Lessons", "Cambrigde", "500", 30.0, 100);
	
		/* CARRINHO DE COMPRAS */
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.getPrecoTotal();
		
		//SAIDA - CARRINHO;
		for (Livro l : carrinho.listaDeLivros) {
			l.descrever();
		}
		
		System.out.println("Livros no Carrinho:" + carrinho.listaDeLivros);
		System.out.println("Preco total de todos os livros no carrinho: " + carrinho.getPrecoTotal());
	}
}
