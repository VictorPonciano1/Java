/* USO DO ENUM NA "MESMA" CLASSE QUE O MAIN */

import java.util.Scanner;

public class Main {
	enum Level {
		LOW, MEDIUM, HIGH
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//PRIMEIRA DECLARACAO, O VALOR DO ENUM JA FOI SETADO EM SUA DECLARACAO E SERA IMPRIMIDO;
		Level fan1 = Level.HIGH;
		System.out.println("Power level of the first fan: " + fan1);
	
		//USO DE SCANNER E SWITCH PARA A ESCOLHA DO USUARIO;
		Level fan2;
		
		System.out.println("What Level would you choose for your fan?");
		for (Level pl : Level.values()) { // PL or pl = POWER LEVEL;
			System.out.println(pl);
		}
		
		String chosenLevel = scanner.nextLine();
		fan2 = Level.valueOf(chosenLevel.toUpperCase());
		
		switch (fan2) {
			case LOW:
				System.err.println("The Power level of your fan is: " + fan2);
				break;
			case MEDIUM:
				System.out.println("The Power level of your fan is: " + fan2);
				break;
			case HIGH:
				System.out.println("The Power level of your fan is: " + fan2);
		}
		
		scanner.close();
	}
}
