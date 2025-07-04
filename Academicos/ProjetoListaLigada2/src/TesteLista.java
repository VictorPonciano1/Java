// Classe que testa os métodos da lista ligada

public class TesteLista {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Insere de 1 a 5 no fim da lista
        for (int i = 1; i <= 5; i++) {
            lista.insereFim(i);
        }
        System.out.println("Lista original:");
        System.out.println(lista);

        // Testa busca
        System.out.println("Buscando 3: " + lista.busca(3));  // true
        System.out.println("Buscando 10: " + lista.busca(10)); // false

        // Insere valor 99 depois do valor 3
        lista.insereDepois(3, 99);
        System.out.println("Depois de inserir 99 após o 3:");
        System.out.println(lista);

        // Remove o valor 2
        lista.removeValor(2);
        System.out.println("Após remover o valor 2:");
        System.out.println(lista);

        // Inverte a lista
        lista.inverter();
        System.out.println("Lista invertida:");
        System.out.println(lista);

        // Clona a lista
        ListaLigada clone = lista.clonar();
        System.out.println("Clone da lista:");
        System.out.println(clone);

        // Limpa a lista original
        lista.limpar();
        System.out.println("Lista original após limpar:");
        System.out.println(lista);
    }
}
