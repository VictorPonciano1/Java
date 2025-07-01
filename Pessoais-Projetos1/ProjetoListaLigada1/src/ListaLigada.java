// Classe que representa uma lista ligada (encadeada)

public class ListaLigada {
    private No primeiro;   // Referência para o primeiro nó
    private No ultimo;     // Referência para o último nó

    // Verifica se a lista está vazia
    public boolean listaVazia() {
        return primeiro == null;
    }

    // Insere um novo nó no início da lista
    public void insereInicio(int info) {
        No novo = new No(info);
        if (listaVazia())
            ultimo = novo; // Se a lista estava vazia, o novo também é o último
        else
            novo.setProximo(primeiro); // Liga o novo ao antigo primeiro
        primeiro = novo; // Atualiza o primeiro
    }

    // Constrói uma string representando a lista
    @Override
    public String toString() {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\";
    }

    // Retorna o tamanho da lista
    public int length() {
        if (listaVazia()) return 0;
        int cont = 0;
        No runner = primeiro;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }

    // Remove o primeiro nó da lista e retorna seu valor
    public int removeInicio() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de inicio");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null)
            ultimo = null; // Lista ficou vazia
        return temp;
    }

    // Insere um novo nó no fim da lista
    public void insereFim(int info) {
        No novo = new No(info);
        if (listaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        ultimo = novo;
    }

    // Remove o último nó da lista e retorna seu valor
    public int removeFim() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de fim");
        int temp = ultimo.getInfo();
        if (primeiro == ultimo) { // Só tem um elemento
            primeiro = null;
            ultimo = null;
        } else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) { // Acha o penúltimo
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return temp;
    }
}
