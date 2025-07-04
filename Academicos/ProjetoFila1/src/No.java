// CLASSE QUE REPRESENTA UM NÓ (ELEMENTO) DA FILA

public class No {
    
    private int info;   // VALOR ARMAZENADO NO NÓ
    private No proximo; // REFERENCIA PARA O PROXIMO NÓ

    // CONSTRUTOR QUE DEFINE O VALOR DO NÓ
    public No(int info) {
        this.info = info;
    }

    // RETORNA O VALOR ARMAZENADO
    public int getInfo() {
        return info;
    }

    // RETORNA O PROXIMO NÓ DA FILA
    public No getProximo() {
        return proximo;
    }

    // DEFINE O PROXIMO NÓ
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // REPRESENTAÇÃO TEXTUAL DO NÓ (EXEMPLO: [10])
    @Override
    public String toString() {
        return "[" + info + "]";
    }
}