/* PROJETO BASEADO NA PROVA P2 DO DIA 02/12/2024 - ESTE METODO VAI IMPRIMIR OS VALORES PASSADOS POR 
 * CADA CONSTRUTOR */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//NAO SEI SE O SCANNER VAI SER REALMENTE NECESSARIO;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite as informacoes do terceiro livro da pratileira");
		
		System.out.print("Titulo: ");
		String tituloInput = scanner.nextLine();
		System.out.print("\nAutor: ");
		String autorInput = scanner.nextLine();
		System.out.print("\nISBN: ");
		String isbnInput = scanner.nextLine();
		System.out.print("\nAno Publicado: ");
		int anoInput = scanner.nextInt();
		System.out.print("\nPreco: ");
		double precoInput = scanner.nextDouble();
		System.out.print("\nSua avaliacao? De 0 a 5 estrelas: ");
		int estrelas = scanner.nextInt();
		
		//OBJETO 1: CONSTRUTOR 1;
		Livro livro1 = new Livro("Livro Legal", "Desconhecido", "001", 2009, 10.99);
		livro1.apresentar();
		
		//ESPACAMENTO;
		System.out.println(" ");
		
		//OBJETO 2: COBSTRUTOR 2;
		Livro livro2 = new Livro("Politica do Brasil", "Eneas Carneiro", "002", 1990, 300.00);
		livro2.apresentar();
		
		//ESPACAMENTO
		System.out.println(" ");
		
		//OBJETO 3: CONTRUTOR SCANNER
		Livro livro3 = new Livro(tituloInput, autorInput, isbnInput, anoInput, precoInput, estrelas);
		livro3.apresentarScanner();
		
		scanner.close();
	}

}
