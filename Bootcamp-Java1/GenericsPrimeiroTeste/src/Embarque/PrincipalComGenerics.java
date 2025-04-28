package Embarque;

import java.util.Scanner;
import Controle.AeronavesComGenerics;

/*
 * INFORMAR A QUANTIDADE DE AERONAVES NO PATIO, O NUMERO DOS VOOS POR ORDEM DE CHAGADA.
 * A ORDEM DE DECOLAGEM EH FIFO: O PRIMEIRO QUE ENTRA, SERA O PRIMEIRO A SAIR.
 * MOSTRAR QUAL O PRIMEIRO VOO A DECOLAR.
 */

public class PrincipalComGenerics {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AeronavesComGenerics<Integer> aero = new AeronavesComGenerics<>();
		System.out.println("Informe o numero de aeronaves:");
		int numAeronaves = scanner.nextInt();
		
		for (int i = 0; i < numAeronaves; i++) {
			Integer numVoo = scanner.nextInt();
			aero.addVoo(numVoo);
		}
		
		aero.primeiroVoo();
		Integer x = (Integer) aero.primeiroVoo();
		System.out.println("Primeiro Voo a decolar: " + x);
		
		scanner.close();
	}
}
