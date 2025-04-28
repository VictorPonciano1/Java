/* CLASSE PRINCIPAL DO PROGRAMA - VAI EXECUTAR TUDO */
public class Main {

	public static void main(String[] args) {
		
		//METODO CONSTRUTOR = CONSTROI O OBJETO;
		//OBJETO nome (sempre em minusculo) = new OBJETO;
		
		//LAMPADA 1;
		Lampada lampada = new Lampada(20, "acrilico"); 
		
		//SAIDA/IMPRESSAO DO PROGRAMA;
		System.out.print("Lampada de Potencia: " + lampada.getPotencia() + ". De material: " 
		+ lampada.getMaterial() + ". Esta liagada? " + lampada.isLigada());
		}
}
