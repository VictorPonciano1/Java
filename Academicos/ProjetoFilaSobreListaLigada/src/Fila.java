// Classe que representa a fila usando lista ligada

class Fila {
    private No primeiro; // Ponteiro para o início da fila
    private No ultimo;   // Ponteiro para o fim da fila

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return primeiro == null;
    }

    // Adiciona um novo elemento ao final da fila
    public void enfileira(int valor) {
        No novo = new No(valor); // Cria um novo nó com o valor

        if (estaVazia()) {
            // Se a fila estiver vazia, o novo nó é o primeiro
            primeiro = novo;
        } else {
            // Caso contrário, o último aponta para o novo
            ultimo.setProximo(novo);
        }

        // Atualiza o ponteiro do último para o novo nó
        ultimo = novo;
    }

    // Remove o primeiro elemento da fila e retorna seu valor
    public int desenfileira() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia! Não é possível remover.");
        }

        int valor = primeiro.getInfo(); // Armazena o valor a ser retornado
        primeiro = primeiro.getProximo(); // Avança o ponteiro

        if (primeiro == null) {
            // Se a fila ficou vazia, zera o ponteiro do último
            ultimo = null;
        }

        return valor; // Retorna o valor removido
    }

    // Retorna uma representação em string da fila
    @Override
    public String toString() {
        if (estaVazia()) return "Fila vazia";

        StringBuilder sb = new StringBuilder();
        No atual = primeiro;
        while (atual != null) {
            sb.append(atual).append(" -> ");
            atual = atual.getProximo();
        }

        return sb.append("\\\\").toString();
    }
}
