// Classe principal para testar a ListaLigada

public class TesteLista {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada(); // Cria uma lista vazia

        System.out.println(lista); // Deve imprimir "lista vazia"

        // Insere valores de 1 a 10 no início da lista
        for (int i = 1; i <= 10; i++) {
            lista.insereInicio(i);
        }

        // Exibe a lista e seu tamanho
        System.out.println(lista);
        System.out.println("tamanho da lista: " + lista.length());

        // Remove todos os elementos do início e exibe a lista
        while (!lista.listaVazia()) {
            System.out.println(lista.removeInicio() + " saiu do inicio");
            System.out.println(lista);
        }

        System.out.println("tamanho da lista: " + lista.length());

        // Insere valores de 1 a 10 no fim da lista
        for (int i = 1; i <= 10; i++)
            lista.insereFim(i);

        System.out.println(lista);

        // Remove todos os elementos do fim e exibe a lista
        while (!lista.listaVazia()) {
            System.out.println(lista.removeFim() + " saiu do fim");
            System.out.println(lista);
        }
    }
}
