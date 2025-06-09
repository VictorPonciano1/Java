// CLASSE QUE REPRESENTA A ARVORE BINARIA DE BUSCA (ABB)

public class ArvoreBinaria {

	private No raiz; // REFERENCIA AO NÓ RAIZ DA ARVORE
	
	// VERIFICA SE A ARVORE ESTA VAZIA
	public boolean estaVazia() {
		return raiz == null;
	}
	
	// INSERE NOVO VALOR NA ARVORE
	public void insere(int info) {
		No novo = new No(info); // CRIA UM NOVO NÓ COM VALOR - REFERENCIA AO CONSTRUTOR
		if (estaVazia()) {
			raiz = novo; // SE A ARVORE ESTA VAZIA, O NOVO NÓ VIRA A RAIZ
		} else {
			insereRec(novo, raiz); //CHAMA A FUNCAO RECURSIVA PARA INSERIR
		}
	}
	
	// METODO RECURSIVO PARA INSERIR NÓ NA POSICAO CORRETA
	private void insereRec(No novo, No atual) {
		if (novo.getInfo() > atual.getInfo()) {
			// SE O VALOR FOR MAIOR, VAI PARA A DIREITA
			if (atual.getDireita() == null) {
				atual.setDireita(novo); // INSERE O VALOR NA DIREITA
			} else {
				insereRec(novo, atual.getDireita()); // CONTINUA "DESCENDO"
			}
		} else {
			// SE FOR MENOR OU IGUAL, VAI PARA A ESQUERDA
			if (atual.getEsquerda() == null) {
				atual.setEsquerda(novo); // INSERE O VALOR NA ESQUERDA
			} else {
				insereRec(novo, atual.getEsquerda()); // CONTINUA "DESCENDO"
			}
		}
	}
	
	// EXIBE OS ELEMENTOS EM ORDEM CRESCENTE (EM-ORDEM: ESQUERDA, RAIZ, DIREITA)
	@Override
	public String toString() {
		if(estaVazia()) return "Arvore Vazia.";
		return toStringRec(raiz);
	}
		
	private String toStringRec(No atual) {
		if (atual == null) return "";
		return toStringRec(atual.getEsquerda()) + atual.getInfo() + " " + 
				toStringRec(atual.getDireita());
	}
		
	// RETORNA ALTURA DA ARVORE
	public int altura() {
		// SE ESTA VAZIO "OU" RAIZ ESQUERDA = NULO E RAIZ DIREITA = NULO
		if (estaVazia() || (raiz.getEsquerda() == null && raiz.getDireita() == null)) return 0;
		return alturaRec(raiz);	
	} 
	
	// METODO RECURSIVO PARA CALCULAR A ALTURA
	private int alturaRec(No atual) {
		if (atual == null) return 0;
		int alturaEsquerda = alturaRec(atual.getEsquerda());
		int alturaDireita = alturaRec(atual.getDireita());
		return Math.max(alturaEsquerda, alturaDireita) + 1;
	}
	
	// CONTA QUANTOS NÓS EXISTEM NA ÁRVORE
	public int contaNos() {
		if (estaVazia()) return 0;
		return contaNosRec(raiz);
	}
	
	private int contaNosRec(No atual) {
		if (atual == null) return 0;
		return contaNosRec(atual.getEsquerda()) + 1 + contaNosRec(atual.getDireita());
	}
	
	//VERIFICA SE UM VALOR EXISTE NA ARVORE
	public boolean busca(int x) {
		return buscaRec(x, raiz);
	}
	
	public boolean buscaRec(int x, No atual) {
		if (atual == null) return false; // VALOR NAO ENCONTRADO
		if (atual.getInfo() == x) return true; //VALOR ENCONTRADO
		
		//DECIDE PARA ONDE IR - USANDO OPERADOR TERNARIO ("?" SE SIM E ":" SE NAO)
		return x > atual.getInfo() ? buscaRec(x, atual.getDireita()) : buscaRec(x, atual.getEsquerda());
	}
	
	// RETORNA O MAIOR VALOR PRESENTE NA ARVORE
	public int maior() {
		if (estaVazia()) throw new RuntimeException("Arvore Vazia");
		No atual = raiz;
		// O MAIOR VALOR SEMPRE ESTA NO NÓ MAIS A DIREITA
		while (atual.getDireita() != null) 
			atual = atual.getDireita();
		return atual.getInfo();
	}
}
