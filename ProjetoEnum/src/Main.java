/* USO DO ENUM COMO UMA "CLASSE" SEPARADA */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//CRIACAO DO OBJETO DO ENUM;
		DiaDaSemana diaEnum;
				
		System.out.println("ESCOLHA O DIA DA SEMANA:"); 
		
		//POSSIVEL ESCOLHER UM VALOR ESPECIFICO DO ENUM COM USO DO FOR EACH (FOR APRIMORADO);
		for (DiaDaSemana dia : DiaDaSemana.values()) { //VALUES() : ENGLOBA TODOS OS VALORES;
			System.out.println(dia);
		}
		
		String diaEscolhido = scanner.nextLine();
		
		diaEnum = DiaDaSemana.valueOf(diaEscolhido.toUpperCase());
		
		System.out.println("DIA ESCOLHIDO: " + diaEnum);
		

		//ENUM DA FORMA DE PAGAMENTO;
		FormaDePagamento pagEnum = FormaDePagamento.CARTAO_CREDITO;
		System.out.println(pagEnum.getCodigo());
		System.out.println(pagEnum.getDescricao());
		
		//FECHAR SCANNER;
		scanner.close();
	}
}
