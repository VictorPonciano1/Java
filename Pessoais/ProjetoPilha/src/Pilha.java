public class Pilha {
    private int[] elementos; // Vetor que armazena os elementos da pilha
    private int topo;        // Índice do topo da pilha

    // Construtor: inicializa o vetor e define o topo como -1 (pilha vazia)
    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        return topo == elementos.length - 1;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Adiciona um elemento ao topo da pilha
    public void empilhar(int elemento) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia!");
        } else {
            topo++;
            elementos[topo] = elemento;
        }
    }

    // Remove e retorna o elemento do topo da pilha
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return -1;
        } else {
            int elemento = elementos[topo];
            topo--;
            return elemento;
        }
    }

    // Retorna o elemento atual do topo sem removê-lo
    public int topo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    // Retorna o número de elementos na pilha
    public int tamanho() {
        return topo + 1;
    }

    // Esvazia a pilha (sem limpar o array, só o ponteiro)
    public void limpar() {
        topo = -1;
    }

    // Exibe os elementos da pilha (do topo para a base)
    public void mostrarElementos() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.print("Elementos na pilha (do topo para a base): ");
            for (int i = topo; i >= 0; i--) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

    // Busca um valor na pilha (retorna true se encontrar)
    public boolean buscar(int valor) {
        for (int i = 0; i <= topo; i++) {
            if (elementos[i] == valor) {
                return true;
            }
        }
        return false;
    }

    // Retorna o primeiro elemento que foi empilhado (base da pilha)
    public int verBase() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return -1;
        } else {
            return elementos[0];
        }
    }
}
