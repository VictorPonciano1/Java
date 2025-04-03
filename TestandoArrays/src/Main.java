import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i; //CRIANDO O INDICE - DECLARAR O INDICE FORA DO FOR, PERMITE USA-LO EM TODOS OS ARRAYS;
		
		/* ARRAY 1 - CRIANDO UM ARRAY "PADRAO" USANDO OS RAPAZES DE EXEMPLO */		
		
		System.out.println("Quantos membros fazem parte do grupo?");
		int membros = scanner.nextInt(); //DEFININDO O TAMANHO DO ARRAY;
		
		String[] rapazes = new String[membros]; //DECLARANDO O ARRAY;
		
		for(i = 0; i < membros; i++) {
			rapazes[i] = scanner.nextLine(); //PREENCHENDO O ARRAY;
		}
		
		for(i = 0; i < membros; i++) {
			System.out.println(rapazes[i]); //EXIBINDO A SAIDA DO ARRAY;
		}
		
		/* ARRAY 2 - PREENCHENDO UM NOVO ARRAY TENTANDO ACHAR A MAIOR NOTA */
		
		int[] notas = {6, 9, 7, 10};
		int maior = notas[0];
		
		for(i = 0; i < notas.length; i++) {
			if (maior < notas[i]) {
				maior = notas[i];
			}
		}
		
		/* ARRAY 3 - CALCULANDO A MEDIA DE UM ALUNO */
		
		int[] notasAluno = new int[3];
		int soma = 0;
		int media = 0;
		
		for(i = 0; i < notasAluno.length; i++) {
			System.out.print("Digite as notas: ");
			notasAluno[i] = scanner.nextInt();
			soma += notasAluno[i];
		}
		
		media = soma / 3;
		System.out.println("Media das notas: " + media);
		
		scanner.close();
	}
}
