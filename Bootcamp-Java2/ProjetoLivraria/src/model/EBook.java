package model;
import model.CarrinhoDeCompras;

public class EBook extends Livro {

	protected double tamanhoEmMb;
	
	public EBook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
		super(titulo,autor,isbn,preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	//GET - TAMANHO EM MB;
	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}
	
	@Override
	public void descrever() {
		System.out.println("Sou um livro DIGITAL.\nMeu titulo: " + titulo + "\nMeu autor: " + autor
				+ "\nMeu ISBN: " + isbn + "\nMeu tamanho em MB: " + tamanhoEmMb 
				+ "\nMeu preco: " + preco);
	}
}
