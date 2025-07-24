import java.util.Scanner; 
    
public class Musica {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        String arquivoDoPc = scanner.next();
        
        if (arquivoDoPc.contains(".mp3")){
          System.out.print("Salvar");
        } else {
          System.out.println("Deletar");
        }
        
        scanner.close();
    }
}