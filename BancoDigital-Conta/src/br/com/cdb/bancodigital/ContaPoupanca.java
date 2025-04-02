package br.com.cdb.bancodigital;

public class ContaPoupanca implements ContaBancaria {

	private double saldo;
	private double rendimento;
	
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
		valor += 1;
		if (saldo < valor) {
		return false;
		} else {
			saldo -= valor;
			return true;
		}
	}

	public double getRendimento() {
		return rendimento;
	}
	
	public void render(double valor) {
		this.rendimento += ((valor / 100) * saldo) + saldo;
	}
	
	@Override
	public void transferir(double valor, ContaBancaria destino) {
		if (sacar(valor)) { //MESMA COISA QUE: SACAR(VALOR) == TRUE;
			destino.depositar(valor);
		}
	}
}
