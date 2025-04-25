import java.util.Scanner; //PARA CRIAR SCANNER: Scanner nome = new Scanner(System.in);
import java.util.ArrayList; //PARA ADICIONAR ARRAYLIST: ArrayList<tipo> nome = new ArrayList<tipo>();
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* LISTA 1 - LISTA DE COMPRAS */
		
		/* O CONTEUDO DENTRO DO <> SE CARACTERIZA COMO O ELEMENTO DA LISTA;
		O ELEMENTO DENTRO DO <> SERIA O SEU TIPO, PODENDO SER STRING, INT E ETC; */
		ArrayList<String> listaDeCompras = new ArrayList<String>(); 
		
		//O COMANDO "ADD" PODE SER USADO PARA QUE ITENS SEJAM ADICIONADOS NO ARRAYLIST;
		listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijao");	
		listaDeCompras.add("Macarrao");
		listaDeCompras.add("Ovo");
		
		//JEITO DE IMPRIMIR: DAR UM "GET" E BUSCAR O INDICE DO ELEMENTO QUE SERA IMPRIMIDO;
		System.out.println(listaDeCompras.get(0));
		
		//REMOVER UM ITEM DA LISTA DE COMPRAS;
		listaDeCompras.remove(0);
		System.out.println(listaDeCompras.get(0));
		/* AO REMOVER UM ELEMENTO DE UM DETERMINADO INDICE QUE É MENOR QUE O TAMANHO FINAL DA LISTA, O
		 * ELEMENTO SEGUINTE PASSA A TOMAR SEU LUGAR. EXEMPLO:
		 * INDICE 0 = ARROZ; INDICE 1 = FEIJAO; REMOVE ARROZ; FEIJAO = INDICE 1 >> 0 */
		
		/* LISTA 2 - LISTA DE NOTAS */
		
		/* PARA O USO DE COLECOES (ARRAYLIST) EH NECESSARIO USAR O USO DE CLASSES EMPACOTADORES 
		 * (CLASSES WRAPPER), POIS OS TIPOS PRIMITIVOS (IGUAL O INT POR EXEMPLO) TEM UM TAMANHO
		 * ESPECIFICO, O QUE FAZ COM QUE A FLEXIBILIDADE DO ARRAYLIST O REJEITE. ELES SAO ESCRITOS
		 * COM A PRIMEIRA LETRA DO SEU NOME MAIUSCULA; */

		ArrayList<Double> listaDeNotas = new ArrayList<Double>();
		
		listaDeNotas.add(8.0);
		listaDeNotas.add(6.5);
		listaDeNotas.add(6.0);
		
		/*USO DO FOREACH - O FOREACH (TAMBEM CHAMADO DE FOR APRIMORADO) PODE SER UMA FORMA DE 
		PERCORRER UMA LISTA SEM PRECISAR DO INDICE */
		for (Double nota : listaDeNotas) {
			if (nota >= 7.0) {
			System.out.println(nota);
			}
		}
		
		scanner.close();
	}

} 