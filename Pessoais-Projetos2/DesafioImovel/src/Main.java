import java.util.Scanner; 
    
public class Main {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        String frase = scanner.next();
        String array[] = new String[3];
        
        array = frase.split("/");

        System.out.print("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
        
        scanner.close();
    }
}