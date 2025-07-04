public class NoContato {
	
	private Contato contato;
	private NoContato esquerda;
	private NoContato direita;
	
	public NoContato(Contato contato) {
		this.contato = contato;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public NoContato getEsquerda() {
		return esquerda;
	}
	
	public void setEsqurda(NoContato esquerda) {
		this.esquerda = esquerda;
	}
	
	public NoContato getDireita() {
		return direita;
	}
	
	public void setDireita(NoContato direita) {
		this.direita = direita;
	}
	
}
