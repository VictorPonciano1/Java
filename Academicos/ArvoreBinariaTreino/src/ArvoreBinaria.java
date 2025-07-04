// Código que representa a Árvore

public class ArvoreBinaria {
    private No raiz;  // Referência ao nó raiz da árvore

    // Insere um valor na árvore
    public void insere(int valor) {
        No novo = new No(valor); // Cria um novo nó com o valor
        if (raiz == null) {
            raiz = novo; // Se a árvore estiver vazia, esse será o primeiro nó
        } else {
            insereRec(novo, raiz); // Chama a função recursiva para inserir corretamente
        }
    }

    // Método recursivo para inserir o nó no lugar certo
    private void insereRec(No novo, No atual) {
        if (novo.getInfo() < atual.getInfo()) {
            // Se o novo valor for menor, vai para a subárvore da esquerda
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo); // Insere à esquerda se o local estiver vazio
            } else {
                insereRec(novo, atual.getEsquerda()); // Continua recursivamente
            }
        } else {
            // Se for maior ou igual, vai para a direita
            if (atual.getDireita() == null) {
                atual.setDireita(novo); // Insere à direita se o local estiver vazio
            } else {
                insereRec(novo, atual.getDireita()); // Continua recursivamente
            }
        }
    }

    // Imprime os valores em ordem crescente (esquerda, raiz, direita)
    public void imprimeEmOrdem() {
        imprimeEmOrdemRec(raiz);
        System.out.println(); // Quebra de linha após imprimir
    }

    private void imprimeEmOrdemRec(No atual) {
        if (atual != null) {
            imprimeEmOrdemRec(atual.getEsquerda());  // Visita a subárvore esquerda
            System.out.print(atual.getInfo() + " "); // Imprime o valor do nó atual
            imprimeEmOrdemRec(atual.getDireita());   // Visita a subárvore direita
        }
    }

    // Verifica se um valor existe na árvore
    public boolean busca(int valor) {
        return buscaRec(valor, raiz); // Começa pela raiz
    }

    private boolean buscaRec(int valor, No atual) {
        if (atual == null) return false; // Valor não encontrado
        if (atual.getInfo() == valor) return true; // Valor encontrado
        // Decide se vai para esquerda ou direita
        return valor < atual.getInfo()
            ? buscaRec(valor, atual.getEsquerda())
            : buscaRec(valor, atual.getDireita());
    }

    // Retorna a altura da árvore (quantos "andares" ela tem)
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(No atual) {
        if (atual == null) return 0; // Nó nulo tem altura 0
        int esq = alturaRec(atual.getEsquerda()); // Altura da subárvore esquerda
        int dir = alturaRec(atual.getDireita());  // Altura da subárvore direita
        return Math.max(esq, dir) + 1; // Altura da árvore atual é o maior dos lados + 1
    }
}
