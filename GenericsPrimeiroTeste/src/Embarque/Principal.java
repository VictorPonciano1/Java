package Embarque;

import java.util.Scanner;
import Controle.Aeronaves;

/*
 * INFORMAR A QUANTIDADE DE AERONAVES NO PATIO, O NUMERO DOS VOOS POR ORDEM DE CHAGADA.
 * A ORDEM DE DECOLAGEM EH FIFO: O PRIMEIRO QUE ENTRA, SERA O PRIMEIRO A SAIR.
 * MOSTRAR QUAL O PRIMEIRO VOO A DECOLAR.
 */

public class Principal {

	public static void main(String[] args) {
		
		//CRIANDO SCANNER
		Scanner scanner = new Scanner(System.in);
		
		//CHAMANDO AERONAVES - ENTRADA DE DADOS
		Aeronaves aero = new Aeronaves();
		System.out.println("Informe o numero de aeronaves");
		int numAeronaves = scanner.nextInt();
		
		//ADICIONANDO VOOS
		for(int i = 0; i < numAeronaves; i++) {
			int numVoo = scanner.nextInt();
			aero.addVoo(numVoo);
		}
		
		//SAIDA DOS DADOS
		System.out.println("O primeiro voo a decolar sera o de numero: " + aero.primeiroVoo());
		aero.listaVoos();
		
		//FECHANDO O SCANNER
		scanner.close();
	}
}
