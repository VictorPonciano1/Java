// Código que implementa a Árvore

public class TreinoABB {
    public static void main(String[] args) {
        ArvoreBinaria abb = new ArvoreBinaria(); // Cria uma nova árvore

        // Vetor de valores fixos e ordenáveis
        int[] valores = {50, 30, 70, 20, 40, 60, 80};

        // Inserção controlada dos valores
        for (int valor : valores) {
            abb.insere(valor);
        }

        // Exibe os valores da árvore em ordem (em-ordem)
        System.out.print("Valores em ordem: ");
        abb.imprimeEmOrdem();

        // Mostra a altura da árvore
        System.out.println("Altura da árvore: " + abb.altura());

        // Faz algumas buscas e mostra os resultados
        int[] testes = {30, 90, 60};
        for (int valor : testes) {
            System.out.println("Busca por " + valor + ": " +
                (abb.busca(valor) ? "encontrado" : "não encontrado"));
        }
    }
}
