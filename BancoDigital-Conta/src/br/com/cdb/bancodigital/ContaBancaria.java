package br.com.cdb.bancodigital;

/* INTERFACE = UMA CLASSE ABSTRATA; NAO PODE SER INSTANCIADA NO MAIN POREM OUTRAS CLASSES PODEM SER 
CRIADAS PARA TEREM SEUS METODOS IMPLEMENTADOS */
public interface ContaBancaria { 

	//ABSTRACT: NESSE CASO, CADA ACOAO PODE SER ESPECIFICA PARA CADA TIPO DE CONTA;
	public double getSaldo();
	public void depositar(double valor);
	public boolean sacar(double valor);
	public void transferir(double valor, ContaBancaria destino);
}
