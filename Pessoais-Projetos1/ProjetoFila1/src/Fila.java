// CLASSE QUE IMPLEMENTA UMA FILA (FIFO) ENCADEADA

public class Fila {
    
    private No primeiro; // APONTA PARA O PRIMEIRO ELEMENTO DA FILA
    private No ultimo;   // APONTA PARA O ULTIMO ELEMENTO DA FILA

    // VERIFICA SE A FILA ESTA VAZIA
    public boolean filaVazia() {
        return primeiro == null;
    }

    // INSERE UM NOVO VALOR NO FINAL DA FILA
    public void enfileira(int info) {
        No novo = new No(info); // CRIA UM NOVO NÓ COM O VALOR
    
        if (filaVazia()) {
            // SE A FILA ESTIVER VAZIA, O NOVO NÓ SERA O PRIMEIRO
            primeiro = novo;
        } else {
            // CASO CONTRARIO, O ULTIMO NÓ ATUAL APONTA PARA O NOVO NÓ
            ultimo.setProximo(novo);
        }
    
        // ATUALIZA O PONTEIRO DO ULTIMO PARA O NOVO NÓ
        ultimo = novo;
    }

    // REMOVE E RETORNA O PRIMEIRO VALOR DA FILA
    public int desenfileira() {
        if (filaVazia()) {
            // SE ESTIVER VAZIA, LANCAR EXCECAO
            throw new RuntimeException("Falha no desenfileiramento");
        }

        // GUARDA O VALOR DO PRIMEIRO NÓ
        int temp = primeiro.getInfo();

        // MOVE O PONTEIRO PARA O PROXIMO NÓ
        primeiro = primeiro.getProximo();

        // SE A FILA FICOU VAZIA, ZERA O PONTEIRO DO ULTIMO
        if (primeiro == null) {
            ultimo = null;
        }

        // RETORNA O VALOR REMOVIDO
        return temp;
    }

    // REPRESENTA A FILA COMO STRING (EXEMPLO: [10] -> [20] -> \\)
    @Override
    public String toString() {
        if (filaVazia()) return "fila vazia";

        String s = "";
        No corredor = primeiro;

        // PERCORRE A FILA ATE O FINAL
        while (corredor != null) {
            s += corredor + " -> ";
            corredor = corredor.getProximo();
        }

        return s + "\\";
    }
}