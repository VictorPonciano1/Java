// CLASSE PRINCIPAL COM O METODO MAIN

public class Main {
    public static void main(String[] args) {
        
        // CRIA UMA NOVA FILA
        Fila fila = new Fila();

        // ADICONA ELEMENTOS A FILA
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);

        // MOSTRA O CONTEUDO DA FILA
        System.out.println("Fila atual: " + fila); // [10] -> [20] -> [30] -> \\
    
        // REMOVE O PRIMEIRO ELEMENTO DA FILA
        int removido = fila.desenfileira();
        System.out.println(removido + " foi removido da Fila.");

        //MOSTRA A FILA DEPOIS DA REMOCAO
        System.out.println("Fila depois da remocao" + fila); // [20] -> [30] -> \\
    }
}
