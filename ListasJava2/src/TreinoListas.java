import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreinoListas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		List<String> listaDeCompras = new ArrayList<>();
		//JEITO 2: USAR "ARRAYLIST" NO LUGAR DA "LIST SIMPLES"
		
		listaDeCompras.add("Macarrao");
		listaDeCompras.add("Acucar");
		listaDeCompras.add("Farinha");
		listaDeCompras.add("Frutas");
		
		System.out.println(listaDeCompras.get(0));
		
		listaDeCompras.remove(0); //EXTREMAMENTE FLEXIVEL 
		System.out.println(listaDeCompras.get(0));
		*/
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		int media = 0;
		
		notas.add(10);
		notas.add(8);
		notas.add(8);
		
		media = notas.get(0) + notas.get(1) + notas.get(2);
		
		System.out.println(media / 3); //SEM O USO DO FOR EACH (PARA CADA: FOR APRIMORADO)
		
		scanner.close();
	}

}
