// CLASSE PRINCIPAL (MAIN) ONDE TUDO SERA TESTADO

import java.util.Random;

public class TesteArvore {

	public static void main(String[] args) {
		
		Random random = new Random(); 			 // GERADOR DE NUMEROS ALEATORIOS
		ArvoreBinaria abb = new ArvoreBinaria(); // CRIA UMA NOVA ARVORE
		
		// TENTA BUSCAR O MAIOR VALOR NA ARVORE (ESTA VAZIO NO COMECO)
		try {
			System.out.println(abb.maior() + " eh maior");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage()); // DEVE IMPRIMIR "Arvore Vazia"
		}
		
		// INSERE 10 NUMEROS ALEATORIOS DE 0 A 50
		for (int i = 1; i <= 10; i++) {
			int n = random.nextInt(51);
			abb.insere(n); // INSERE NA ARVORE
		}
		
		// IMPRIME TODOS OS VALORES EM ORDEM CRESCENTE
		System.out.println("\n" + abb);
		
		// IMPRIME A ALTURA DA ARVORE
		System.out.println("Altura: " + abb.altura());
	
		// IMPRIME O NUMERO TOTAL DE NÓS
		System.out.println("Numero de nós: " + abb.contaNos());
	
		//VERIFICA SE O NUMERO 10 ESTA NA ARVORE
		System.out.println(abb.busca(10) ? "10 esta na arvore" : "10 nao esta na arvore");
	
		// MOSTRA NOVAMENTE O MAIOR VALOR (AGORA COM DADOS)
		try {
			System.out.println(abb.maior() + " eh maior");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
