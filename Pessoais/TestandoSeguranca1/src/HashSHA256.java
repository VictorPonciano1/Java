import java.util.Scanner; //SCANNER = ENTRADA DE DADOS;
import java.io.UnsupportedEncodingException; //QUANDO A CODIFICACAO NAO EH PERMITIDA;
import java.security.MessageDigest; //MESSAGE DIGEST GERA UM RESUMO UNICO E FIXO DA MENSAGEM;
import java.security.NoSuchAlgorithmException; //CHAMADO QUANDO UMA CRIPTOGRIA NAO ESTA DISPONIVEL;

public class HashSHA256 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua senha:");
		String senha = scanner.nextLine();
		
		String senhaHash = generateHash(senha); //GERA UM HASH;
		System.out.println("Hash gerado: " + senhaHash); //IMPRIME O HASH GERADO;
		
		scanner.close();
	}

	public static String generateHash(String senha) throws UnsupportedEncodingException {
		
		try { //ESSE TRY VAI TENTAR VER SE A SENHA VIRA O HASH, SE NAO = ERRO NO CODIGO;
			
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); //TIPO DO HASH;
			
			byte[] hash = digest .digest(senha.getBytes("UTF-8")); //GERA OS BYTES DO HASH EM UTF-8;
			
			StringBuilder hexString = new StringBuilder(); //CRIA UM STRING BUILDER;
			//STRING BUILDER MANIPULA STRING DE FORMA DINAMICA (POREM EH DIFERENTE DA STRING COMUM);
			
			for (byte b : hash) {
				hexString.append(String.format("%02x", b)); //CRIA O HASH COM USO DO FOR EACH;
			}
			return hexString.toString(); //RETORNA A STRING;
			
		} catch (NoSuchAlgorithmException e) { //CASO A CONDICAO NAO SEJA ATENDIDA, A EXCECAO SERA CHAMADA;
			throw new RuntimeException(e);
		}
	}
}
