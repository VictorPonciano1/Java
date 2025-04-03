package model;
import model.CarrinhoDeCompras;

public class Livro {

	protected String titulo;
	protected String autor;
	protected String isbn; //NUMERO DE IDENTIFICACAO
	protected double preco;

	public Livro(String titulo, String autor, String isbn, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}
	
	//GET - TITULO
	public String getTitulo() {
		return titulo;
	}
	//GET - AUTOR
	public String getAutor() {
		return autor;
	}
	//GET - ISBN;
	public String getIsbn() {
		return isbn;
	}
	// GET - PRECO;
	public double getPreco() {
		return preco;
	}

	public void descrever() {
		System.out.println("Sou um livro generico.\nMeu titulo: " + titulo + "\nMeu autor: " + autor
				+ "\nMeu ISBN: " + isbn + "\nMeu preco (apenas o livro): " + preco);
	}
	
	public void calcularPrecoTotal(double preco) { //SERA CHAMADO PARA O EBOOK;
		this.preco = preco;
	}
	
}