
public class DivisaoPorZeroException extends Exception {

	/**
	 * NAO SEI QUAL O PROPOSITO DESSE "SERIAL VERSION UID"
	 */
	private static final long serialVersionUID = 1L;

	private int valorPadrao;
	
	public DivisaoPorZeroException(String mensagem) {
		super(mensagem);
		valorPadrao = 1;
	}
	
	public int getValorPadrao() {
		return valorPadrao;
	}
}
