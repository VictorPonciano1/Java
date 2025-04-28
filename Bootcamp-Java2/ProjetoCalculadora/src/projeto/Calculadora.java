/* OS METODOS NOVOS ESTAO NO FINAL DA CLASSE */
package projeto;

public class Calculadora {

	//OS LEDS DA CALCULADORA ESTAO LIGADOS?
	private boolean ledLigado;
	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}
	
	public boolean isLigada() {
		return ledLigado;
	}
	
	public void ligar(char ledinhos) {
		if (ledinhos == 'S' || ledinhos == 's') {
			this.ledLigado = true;
		} else {
			this.ledLigado = false;
		}
	}
	
	public void mandar() {
		this.mensagem = (ledLigado) ? "Seus Leds estao ligados" : 
			"Seus leds nao estao ligados";
	}
	
	//ATRIBUTOS OU MEOTODOS;
	private double soma;
	private double subtracao;
	private double multiplicacao;
	private double divisao;
	
	//GETTERS E SETTERS - SOMA;
	public double getSoma() {
		return soma;
	}
	
	//GETTERS E SETTERS - SUBTRACAO;
	public double getSubtracao() {
		return subtracao;
	}
	
	//GETTERS E SETTERS - MULTIPLICACAO;
	public double getMultiplicacao() {
		return multiplicacao;
	}
	
	//GETTERS E SETTERS - DIVISAO;
	public double getDivisao() {
		return divisao;
	}
	
	//METODO CALCULAR (ACHO QUE EU PODERIA TER TROCADO OS IFS POR UM SWITCH);
	public void calcular(double numero1, double numero2, char op) {
		if (op == '+') {
			this.soma = soma + (numero1 + numero2);
		} if (op == '-') {
			this.subtracao = (subtracao + numero1) - numero2;
		} if (op == '*') {
			this.multiplicacao = multiplicacao + (numero1 * numero2);
		} if (op == '/') {
			this.divisao = divisao + (numero1 / numero2);
		}
	}

	//METODOS NOVOS;
	private double somaQ;
	private double media;
	private boolean aprovado;
	
	//EXPONENCIAL
	public double getSomaQ() {
		return somaQ;
	}

	//MEDIA - INCLUI O APROVADO;
	public double getMedia() {
		return media;
	}
	public boolean isAprovado() {
		return aprovado;
	}

	//CALCULAR 2;
	public void calcular2(char op2, double numero3, double numero4) {
		if (op2 == 'Q' || op2 == 'q') {
			this.somaQ += (numero3 * numero3) + (numero4 * numero4);
		}
		if (op2 == 'M' || op2 == 'm') {
			this.media += (numero3 + numero4) / 2;
		}
	}
	
	//PARA SABER SE ESTA APROVADO OU NAO;
	public void aprovar() {
		if (media >= 6) {
			this.aprovado = true;
		} else {
			this.aprovado = false;
		}
	}
}