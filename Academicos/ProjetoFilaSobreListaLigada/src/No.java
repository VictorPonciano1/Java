// Classe que representa um nó da fila (lista ligada)

class No {
    private int info;       // Valor armazenado no nó
    private No proximo;     // Referência para o próximo nó

    // Construtor que define o valor do nó
    public No(int info) {
        this.info = info;
    }

    // Retorna o valor armazenado
    public int getInfo() {
        return info;
    }

    // Retorna a referência para o próximo nó
    public No getProximo() {
        return proximo;
    }

    // Define o próximo nó
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // Representa o nó como uma string, por exemplo: [10]
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}