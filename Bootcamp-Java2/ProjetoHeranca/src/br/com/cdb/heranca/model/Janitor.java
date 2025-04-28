package br.com.cdb.heranca.model;

/* EXTENDS: ELE HERDA OS ATRIBUTOS DA CLASSE "EMPLOYEE", QUE POR JA ESTAR HERDANDO A CLASSE "PERSON", 
FAZ COM QUE NAO SEJA PRECISO CHAMAR A "CLASSE PAI" QUE EH A "PERSON" */

public class Janitor extends Employee { //JANITOR: FAXINEIRO OU ZELADOR;

	public String shift;
	
	public Janitor(String name) {
		super(name);
	}
	
	@Override
	public void presentation() {
	System.out.println("Hello, I'm the Janitor " + name + " and I've been working here for a long "
			+ "time. There's 5 years since I work at the " + shift + " Shift.");	
	}
}
