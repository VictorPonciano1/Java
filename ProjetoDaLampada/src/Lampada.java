/* CLASSE LAMPADA - CLASSE PARA CRIAR AQUILO QUE PERTENCE A LAMPADA */
public class Lampada {
	
	//PROPRIEDADES DA LAMPADA;
	private int potencia;
	private boolean ligada;
	private String material;
	
	//METODO CONSTRUTOR
	public Lampada(int potencia, String material) {
		this.potencia = potencia;
		this.ligada = false;
		this.material = material;
	}
	
	//METODOS GETTERS E SETTERS;
	//POTENCIA;
	public int getPotencia() { //"PEGA POTENCIA";
		return potencia;
	}
	//LIGADA;
	public boolean isLigada() {
		return ligada;
	}
	//MATERIAL;
	public String getMaterial() {
		return material;
	}
	
	//METODOS (normais);
	public void ligar() { //PARA LIGAR;
		ligada = true;
	} 
	public void desligar() { //PARA DESLIGAR;
		ligada = false;
	}
}
