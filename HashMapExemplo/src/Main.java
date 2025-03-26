/* EXEMPLO DO USO DE HASHMAP */

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		/* CRIANDO O HASHMAP 1 */
		
		//K = KEY (CHAVE) A ESQUERDA; V = VALUE (VALOR) A DIREITA;
		HashMap<String, String> dicionario = new HashMap<>();
		
		//PARA ADICIONAR DADOS: USAMOS O PUT;
		dicionario.put("Palavra 1", "Significado 1");
		dicionario.put("Palavra 2", "Significado 2");
		dicionario.put("Palavra 3", "Significado 3");
	
		//USADO PARA "PEGAR"/ACESSAR VALORES;
		if (dicionario.containsKey("Palavra 3")) { //"CONTAINS KEY": CONTEM A CHAVE, PROCURA O VALOR;
			System.out.println(dicionario.get("Palavra 3"));
		}
	
		/* CRIANDO HASHMAP 2 */
		
		HashMap<String, Integer> estoque = new HashMap<String, Integer>();
		
		estoque.put("Arroz", 10);
		estoque.put("Laranja", 100);
		
		System.out.println("Quantidade de estoque do produto escolhido: " + estoque.get("Arroz"));
		
		//BUSCA APROFUNDADA
		for (String chave : estoque.keySet()) {
			System.out.println(chave + " - " + estoque.get(chave));
		}
	}
}
