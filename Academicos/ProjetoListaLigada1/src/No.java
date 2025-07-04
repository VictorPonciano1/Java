// Classe que representa um nó da lista ligada

public class No {
    private int info;         // Valor armazenado no nó
    private No proximo;       // Referência para o próximo nó na lista

    // Construtor que inicializa o nó com o valor fornecido
    public No(int info) {
        this.info = info;
    }

    // Retorna a referência para o próximo nó
    public No getProximo() {
        return proximo;
    }

    // Define a referência para o próximo nó
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // Retorna o valor armazenado no nó
    public int getInfo() {
        return info;
    }

    // Representação do nó como string, ex: [5]
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
