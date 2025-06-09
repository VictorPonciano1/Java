// AGENDA TELEFONICA COM USO DE ARVORES BINARIAS

public class AgendaABB {

	private NoContato raiz;
	
	public void adicionar(Contato contato) {
		NoContato novo = new NoContato(contato);
		if (raiz == null) {
			raiz = novo;
		} else {
			adicionarRec(novo, raiz);
		}
	}
	
	private void adicionarRec(NoContato novo, NoContato atual) {
		String nomeNovo = novo.getContato().getNome();
		String nomeAtual = atual.getContato().getNome();
		
		if(nomeNovo.compareToIgnoreCase(nomeAtual) < 0) {
			// VAI PARA A ESQUERDA
			if (atual.getEsquerda() == null) {
				atual.setEsqurda(novo);
			} else {
				adicionarRec(novo, atual.getEsquerda());
			}
		} else {
			// VAI PARA A DIREITA
			if(atual.getDireita() == null) {
				atual.setDireita(novo);
			} else {
				adicionarRec(novo, atual.getDireita());
			}
		}
	}
	
	public void listarContatos() {
		listarRec(raiz);
	}
	
	private void listarRec(NoContato atual) {
		if (atual != null) {
			listarRec(atual.getEsquerda());
			System.out.println(atual.getContato());
			listarRec(atual.getDireita());
		}
	}
	
	public Contato buscar(String nome) {
		return buscarRec(nome.toLowerCase(), raiz);
	}
	
	private Contato buscarRec(String nome, NoContato atual) {
		if (atual == null) return null;
		
		String nomeAtual = atual.getContato().getNome().toLowerCase();
		
		if (nome.equals(nomeAtual)) return atual.getContato();
 		if (nome.compareTo(nomeAtual) < 0) return buscarRec(nome, atual.getEsquerda());
		return buscarRec(nome, atual.getDireita());
	}
}
