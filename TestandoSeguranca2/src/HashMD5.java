//TESTANDO COMO GERAR UMA FUNCAO HASH MD5 EM LINGUAGEM JAVA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashMD5 {

	public static String gerarMD5(String msg) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(msg.getBytes());
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String mensagem = scanner.nextLine();
		System.out.println(gerarMD5(mensagem));
		
		scanner.close();
	}

}
