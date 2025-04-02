/* ENTITY (ENTIDADE) - SERIA A CLASSE QUE REPRESENTA AQUELE QUE IRIA USUFRUIR DO PROGRAMA  */
package br.com.cdb.bancodigital.entity;

public class Cliente {

	private String name;
	private int id;
	private long cpf;
	
	//NOME;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//ID;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//CPF;
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
}
