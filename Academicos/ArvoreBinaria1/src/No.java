// CLASSE QUE REPRESENTA UM NÓ NA ARVORE BINARIA

public class No {

	private int info; 		// VALOR ARMAZENADO NO NÓ
	private No esquerda;	// REFERÊNCIA PARA O FILHO DA ESQUERDA
	private No direita;		// REFERÊNCIA PARA O FILHO DA DIREITA
	
	// CONSTRUTOR QUE DEFINE O VALOR DO NÓ
	public No(int info) {
		this.info = info;
	}
	
	// GETTERS E SETTERS PARA ACESSAR E MODIFICAR ATRIBUTOS - INFO
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	
	// GETTERS E SETTERS PARA ACESSAR E MODIFICAR ATRIBUTOS - ESQUERDA
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	// GETTERS E SETTERS PARA ACESSAR E MODIFICAR ATRIBUTOS - DIREITA
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	// REPRESENTACAO DO NÓ EM FORMA DE STRING
	public String toString() {
		return "[" + info + "]";
	}
	
}
