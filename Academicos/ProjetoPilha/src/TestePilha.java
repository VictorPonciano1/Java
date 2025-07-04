public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5); // Cria uma pilha com capacidade 5

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.mostrarElementos(); // Mostra os elementos atuais

        System.out.println("Topo: " + pilha.topo()); // Mostra o topo
        System.out.println("Base: " + pilha.verBase()); // Mostra a base
        System.out.println("Tamanho atual: " + pilha.tamanho()); // Tamanho da pilha
        System.out.println("Buscando 20: " + pilha.buscar(20)); // Deve retornar true
        System.out.println("Buscando 99: " + pilha.buscar(99)); // Deve retornar false

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando: " + pilha.desempilhar());
        }

        pilha.mostrarElementos(); // Agora a pilha estará vazia
    }
}
