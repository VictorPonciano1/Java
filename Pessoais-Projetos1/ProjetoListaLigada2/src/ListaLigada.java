// Classe que implementa uma lista ligada simples

public class ListaLigada {
    private No primeiro;  // Início da lista
    private No ultimo;    // Fim da lista

    // Verifica se a lista está vazia
    public boolean listaVazia() {
        return primeiro == null;
    }

    // Insere um novo nó no início da lista
    public void insereInicio(int info) {
        No novo = new No(info);
        if (listaVazia())
            ultimo = novo;
        else
            novo.setProximo(primeiro);
        primeiro = novo;
    }

    // Insere um novo nó no final da lista
    public void insereFim(int info) {
        No novo = new No(info);
        if (listaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        ultimo = novo;
    }

    // Remove e retorna o primeiro valor da lista
    public int removeInicio() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de inicio");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null)
            ultimo = null;
        return temp;
    }

    // Remove e retorna o último valor da lista
    public int removeFim() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de fim");
        int temp = ultimo.getInfo();
        if (primeiro == ultimo) { // só 1 elemento
            primeiro = null;
            ultimo = null;
        } else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) {
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return temp;
    }

    // Retorna a quantidade de elementos na lista
    public int length() {
        int cont = 0;
        No runner = primeiro;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }

    // Verifica se um valor existe na lista
    public boolean busca(int valor) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.getInfo() == valor) return true;
            atual = atual.getProximo();
        }
        return false;
    }

    // Insere um novo valor após o valor de referência
    public void insereDepois(int valorReferencia, int novoValor) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.getInfo() == valorReferencia) {
                No novo = new No(novoValor);
                novo.setProximo(atual.getProximo());
                atual.setProximo(novo);
                if (atual == ultimo)
                    ultimo = novo;
                return;
            }
            atual = atual.getProximo();
        }
        throw new RuntimeException("Valor de referência não encontrado.");
    }

    // Remove o primeiro nó com o valor indicado
    public void removeValor(int valor) {
        if (listaVazia()) return;

        if (primeiro.getInfo() == valor) {
            removeInicio();
            return;
        }

        No anterior = primeiro;
        No atual = primeiro.getProximo();

        while (atual != null) {
            if (atual.getInfo() == valor) {
                anterior.setProximo(atual.getProximo());
                if (atual == ultimo) {
                    ultimo = anterior;
                }
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    // Inverte a ordem da lista
    public void inverter() {
        No anterior = null;
        No atual = primeiro;
        No proximo;
        ultimo = primeiro;
        while (atual != null) {
            proximo = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
        }
        primeiro = anterior;
    }

    // Retorna uma cópia da lista original
    public ListaLigada clonar() {
        ListaLigada nova = new ListaLigada();
        No atual = primeiro;
        while (atual != null) {
            nova.insereFim(atual.getInfo());
            atual = atual.getProximo();
        }
        return nova;
    }

    // Remove todos os elementos da lista
    public void limpar() {
        primeiro = null;
        ultimo = null;
    }

    // Representação da lista em forma de string
    @Override
    public String toString() {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\";
    }
}
