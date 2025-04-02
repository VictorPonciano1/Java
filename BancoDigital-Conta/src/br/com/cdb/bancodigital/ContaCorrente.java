package br.com.cdb.bancodigital;

/* DIFERENTE DE UMA HERANCA NORMAL, QUANDO A SUPER CLASSE EH UMA INTERFACE, O COMANDO UTILIZADO EH O 
"IMPLEMENTS" QUE SIGNIFCA IMPLEMENTA, ONDE A CLASSE LIGADA A INTERFACE PRECISA IMPLEMENTAR TODOS OS
SEUS METODOS */
public class ContaCorrente implements ContaBancaria {

	private double saldo;
	
	//O FINAL TRANSFORMA O VALOR ATRIBUIDO EM SEU VALOR "FINAL"; SEM NOVAS ATRIBUICOES
	private final long numero; 
	
	public ContaCorrente(long numero) {
		this.numero = numero;
		
		//EXEMPLO: this.numero = 78393; - NESTE CASO O CODIGO GERARIA UM ERRO POIS O NUMERO JA EXISTE;
	}
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public boolean sacar(double valor) {	
		if (saldo < valor) {
		return false;
		} else {
			saldo -= valor;
			return true;
		}
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) {
		if (sacar(valor)) { //MESMA COISA QUE: SACAR(VALOR) == TRUE;
			destino.depositar(valor);
		}
	}
}
