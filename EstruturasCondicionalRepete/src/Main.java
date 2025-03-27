import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//WHILE NOME;
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		while (nome.equals("")) {
			System.out.print("Insira seu nome novamente: ");
			nome = scanner.nextLine();
		}
		
		//WHILE CONTADOR;
		System.out.print("Digite o limite do contador: ");
		int limite = scanner.nextInt();
		int contador = 1;
		while (contador <= limite) {
			System.out.print(contador + "\n");
			contador++;
		}
	
		//USO DO FOR;
		for (int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		//USO DO BREAK - O BREAK PODE SER USADO COM IF APENAS DENTRO DE UM FOR;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 8) {
				break; //FORA DE UM FOR, O BREAK PODE SER USADO APENAS EM UM "SWITCH" (SWITCH CASE);	
			}
		}
	
		//USO DO CONTINUE;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 8) {
				continue; 
			}
		}
	scanner.close();
	}
}
