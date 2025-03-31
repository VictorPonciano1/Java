import java.util.ArrayList;
import java.util.Scanner;

public class ForEachTreino {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> boletim = new ArrayList<Double>();
		
		/* TAMBEM EH POSSIVEL INSERIR DADOS DE FORMA MANUAL
		  boletim.add(10); - onde 10 = nota
		 */
		
		System.out.println("Digite as notas do aluno.\nDigite '0.0' para sair");
		
		//ENTRADA DE DADOS
		while (true) {
			double entrada = scanner.nextInt();
			if (entrada == 0) {
				break;
			}
			boletim.add(entrada);
		}
		
		//SAIDA DE DADOS
		System.out.println("As notas do aluno foram:");
		for (double notas : boletim) {
			System.out.println(notas);
		}
		
		double media;
		System.out.println("A media foi: ");
		
		
		scanner.close();
	}
}
 