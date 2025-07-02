// Classe que representa um Nó da Árvore

public class No {
    private int info;         // Valor armazenado no nó
    private No esquerda;      // Referência para o filho da esquerda
    private No direita;       // Referência para o filho da direita

    // Construtor que define o valor do nó
    public No(int info) {
        this.info = info;
    }

    // Retorna o valor armazenado
    public int getInfo() {
        return info;
    }

    // Retorna o filho da esquerda
    public No getEsquerda() {
        return esquerda;
    }

    // Define o filho da esquerda
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    // Retorna o filho da direita
    public No getDireita() {
        return direita;
    }

    // Define o filho da direita
    public void setDireita(No direita) {
        this.direita = direita;
    }

    // Retorna uma representação em texto do nó
    public String toString() {
        return "[" + info + "]";
    }
}
