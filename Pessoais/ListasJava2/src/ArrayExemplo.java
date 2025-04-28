import java.util.Scanner;

public class ArrayExemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//ARRAY 1
		
		/*
		 String aluno1 = "Victor";
		 System.out.println(aluno1);
		 
		 String aluno2;
		 String aluno3;
		 String aluno4; 
		 */
		
		String[] alunos = new String[4];
		
		/*
		 alunos[0] = "Victor";
		 alunos[1] = "Heitor";
		 alunos[2] = "Jorge";
		 alunos[3] = "Paulo";
		 */
	
		for (int i = 0; i < 4; i++) {
			alunos[i] = scanner.nextLine();
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 4; i++) {
			
			//TENTAR FAZER UM IF
			System.out.println(alunos[i]);
			
		}
		
		//ARRAY 2
		
		int[] notas = {7, 9, 7, 8}; //OUTRA FORMA: int[] notas = new int[4]
		
		int maiorNota = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}
		
		System.out.println("Maior Nota = " + maiorNota);
		
		int[] notas2 = new int[4];
		int media = 0;
		
		for (int i = 0; i < notas2.length; i++) {
			notas2[i] = scanner.nextInt();
			media += notas2[i];
		}
		
		System.out.println("Media = " + (media / 4));
		
		scanner.close();
	}

}
