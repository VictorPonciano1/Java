package projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> listaDeTarefas = new ArrayList<String>();
	
		System.out.print("Digite sua tarefa (a tarefa pode ser adicionada apenas antes "
				+ "de a lista ser iniciada): ");
		String tarefinha = scanner.nextLine();
		
		System.out.print("Digite qual indice voce removeria, lembrando que a lista comeca "
				+ "no indice 0: ");
		int iRemover = scanner.nextInt();
		
		Tarefa tarefa = new Tarefa(tarefinha, iRemover);
		
		while (true) {
			
			System.out.println("DIGITE SUA OPCAO:\n1- ADICIONAR TAREFA A TAREFA DIGITADA ANTES;"
					+ "\n2- REMOVER UMA TAREFA! (NOTE QUE A TAREFA SERA REMOVIDA APENAS SE ELA FOR ADICIONADA ANTES!)"
					+ "\n3- EXIBIR A LISTA!" + "\n4- SAIR DA LISTA!");
			int opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("1- VOCÊ ESCOLHEU ADICIONAR UMA TAREFA!");
				listaDeTarefas.add(tarefa.getTarefa());
				break;
			case 2:
				System.out.println("2- VOCE ESCOLHEU EXCLUIR UMA TAREFA DA LISTA!"
						+ "\nA TAREFA FOI REMOVIDA NO INDICE ESCOLHIDO!");
				listaDeTarefas.remove(tarefa.getIndiceRemover());
				break;
			case 3:
				System.out.println("3- VOCE ESCOLHEU EXIBIR A LISTA");
				for (String lista : listaDeTarefas) {
					System.out.println(lista);
				}
				break;
			case 4:
				System.out.println("4- VOCE SAIU DA LISTA!");
				break;
			}
			if (opcao == 4) {
				break;
			}
		}
		
		scanner.close();
	}

}
