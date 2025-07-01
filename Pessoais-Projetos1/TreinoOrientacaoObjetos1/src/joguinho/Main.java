package joguinho;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//SCANNER - ENTRADA DOS DADOS;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a vida do seu personagem?");
		int vidaS = scanner.nextInt();
		System.out.println("Qual o ataque do seu Personagem?");
		float ataqueS = scanner.nextFloat();
		System.out.println("Seu Personagem vai pular?");
		char pulinho = scanner.next().charAt(0);
		
		//OBEJTO PERSONAGEM;
		Personagem steve = new Personagem();
		steve.atribuir(vidaS, ataqueS);
		steve.pular(pulinho);
		
		//SAIDA DOS DADOS;
		System.out.println("Vida do Personagem: " + steve.getVida() + "\nAtaque do Personagem: " 
		+ steve.getAtaque() + "\nEle pula? " + steve.isPula());
		
		
		
		scanner.close();
	}

}
