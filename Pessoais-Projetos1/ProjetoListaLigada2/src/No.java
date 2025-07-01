// Classe que representa um nó da lista ligada

public class No {
    private int info;         // Valor armazenado no nó
    private No proximo;       // Referência para o próximo nó na lista

    // Construtor que define o valor do nó
    public No(int info) {
        this.info = info;
    }

    // Retorna o próximo nó
    public No getProximo() {
        return proximo;
    }

    // Define qual será o próximo nó
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // Retorna o valor armazenado
    public int getInfo() {
        return info;
    }

    // Representação em string do nó, ex: [5]
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
