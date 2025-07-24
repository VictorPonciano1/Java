import java.util.Scanner; 

public class Lanchonete {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        String ingredientes = scanner.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");
        
        System.out.println(listaIngredientes[0] + "\n" + listaIngredientes[1] + "\n" + listaIngredientes[2] + "\n" + listaIngredientes[3]);

        scanner.close();
    }
}