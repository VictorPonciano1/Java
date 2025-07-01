// Classe principal para testar a fila

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila(); // Cria uma nova fila

        // Adiciona elementos à fila
        System.out.println("Adicionando elementos à fila...");
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);
        fila.enfileira(40);

        // Mostra o estado atual da fila
        System.out.println("Fila atual: " + fila);

        // Remove dois elementos da fila
        System.out.println("Removido: " + fila.desenfileira());
        System.out.println("Removido: " + fila.desenfileira());

        // Mostra o estado final da fila
        System.out.println("Fila atual: " + fila);
    }
}
