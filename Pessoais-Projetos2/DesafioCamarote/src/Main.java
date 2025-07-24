import java.util.Scanner; 

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int tamanhoDaFila = scanner.nextInt();
        int pessoasNoCamarote = 0;

        while (tamanhoDaFila > 0 ){
          if(tamanhoDaFila % 2 != 0){
            pessoasNoCamarote++;
          }
          tamanhoDaFila--;
        }

        System.out.print(pessoasNoCamarote + " pessoas no camarote");
        
        scanner.close();
    }
}