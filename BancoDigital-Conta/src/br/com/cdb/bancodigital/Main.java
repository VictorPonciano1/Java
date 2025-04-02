package br.com.cdb.bancodigital;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria cc = new ContaCorrente(123456); //JEITO 1: OBJETO CRIADO COM CHAMADO DA INTERFACE;
		cc.depositar(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(); //JEITO 2: OBJETO CRIADO DE FORMA PADRAO;
		cp.depositar(500.0);
		
		//EXEMPLO DE OPERACOES PARA VER SE O CODIGO FUNCIONA;
		cc.depositar(300.0);
		cp.sacar(200);
		cc.transferir(300, cp);
		
		cp.render(8);
		
		JOptionPane.showInputDialog("O rendimento da conta corrente: " + cc.getSaldo());
		JOptionPane.showInputDialog("O rendimento da conta poupanca: " + cp.getSaldo());
		System.out.println("Saldo depois dos rendimentos: " + cp.getRendimento());
	}
}
