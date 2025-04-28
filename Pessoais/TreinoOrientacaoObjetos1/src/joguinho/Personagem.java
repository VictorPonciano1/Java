package joguinho;

public class Personagem {

	//ATRIBUTOS BASE;
	private int vida;
	private float ataque;
	private boolean pula;	
	
	//VIDA;
	public int getVida() {
		return vida;
	}
	//ATAQUE;
	public float getAtaque() {
		return ataque;
	}
	//PULA
	public boolean isPula() {
		return pula;
	}

	//METODO PARA ATRIBUIR OS VALORES;
	public void atribuir(int vidaS, float ataqueS) {
		this.vida = vida + vidaS;
		this.ataque = ataque + ataqueS;
	}
	
	//METODO PARA PULAR;
	public void pular(char pulinho) {
		if (pulinho == 's' || pulinho == 'S') {
			this.pula = true;
		}
		if (pulinho == 'n' || pulinho == 'N') {
			this.pula = false;
		}
	}
}