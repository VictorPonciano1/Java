package Controle;

import java.util.ArrayList;
import java.util.List; 

public class AeronavesComGenerics<T> {

	//T: GENERIC UTILIZADO NESSE CODIGO
	public List<T> listaAeronaves = new ArrayList<>();
	
	public void addVoo(T numVoo) {
	//  listaAeronaves.add("3520");
		listaAeronaves.add(numVoo);
	}
	
	public T primeiroVoo() {
		if (listaAeronaves.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		return listaAeronaves.get(0);
	}
	
	public void listVoos() {
		System.out.print("[");
		if (!listaAeronaves.isEmpty()) {
			System.out.print(listaAeronaves.get(0));
		}
		for (int i = 0; i < listaAeronaves.size(); i++) {
			System.out.print(" " + listaAeronaves.get(i));
		}
		System.out.print("]");
	}
} 
