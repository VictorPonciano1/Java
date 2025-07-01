import java.util.Scanner; //SCANNER = ENTRADA DE DADOS;
import java.security.MessageDigest; //MESSAGE DIGEST GERA UM RESUMO UNICO E FIXO DA MENSAGEM;
import java.security.NoSuchAlgorithmException; //CHAMADO QUANDO UMA CRIPTOGRIA NAO ESTA DISPONIVEL;

public class HashMD5 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine(); //ENTRADA DE DADOS;
	
		try {
			
			MessageDigest digest = MessageDigest.getInstance("MD5");
			byte[] hash = digest.digest(senha.getBytes());
			
			//CONVERTER O ARRAY DE BYTE PARA UMA STRING HEXADECIMAL;
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				String hex = Integer.toHexString(0xFF & b);
				if (hex.length() == 1) {
					hexString.append("0"); //APPEND: ADICIONA DADOS A UMA STRING JA EXISTENTE;
				} 
				hexString.append(hex);
			}
			
			String md5 = hexString.toString();
			System.out.println("Hash em MD5: " + md5);
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
