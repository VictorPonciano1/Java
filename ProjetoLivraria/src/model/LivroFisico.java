package model;
import model.CarrinhoDeCompras;

public class LivroFisico extends Livro {
	
	protected double peso;
	protected double frete;
	
	public LivroFisico(String titulo, String autor, String isbn, double preco, double peso, double frete) {
		super(titulo,autor,isbn,preco);
		this.frete = frete;
	}

	//GET - PESO;
	public double getPeso() {
		return peso;
	}
	//GET - FRETE;
	public double getFrete() {
		return frete;
	}
	
	@Override
	public void calcularPrecoTotal(double novoPreco) {
		this.preco += preco + frete ;
	}
	
	@Override
	public void descrever() {
		System.out.println("Sou um livro FISICO.\nMeu titulo: " + titulo + "\nMeu autor: " + autor
				+ "\nMeu ISBN: " + isbn + "\nMeu peso (em gramas): " + peso 
				+ "\nMeu preco (com frete): " + preco);
	}
}
