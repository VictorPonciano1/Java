package br.com.cdb.heranca.model;

/* CREATING IN ENGLISH USING TERMS FROM THE USA TO BE FAMILIARIZED WITH THE ENGLISH LANGUAGE */

public abstract class Person { //UMA CLASSE ABSTRATA NAO PODE SER INSTANCIADA NA MAIN;

	//ATRIBUTES;
	public String name;
	public long ssn; //SSN: SOCIAL SECURITY NUMBER (CPF AMERICANO);
	
	//METHODS;
	public Person(String name) { //CONSTRUTOR METHOD: METODO CONSTRUTOR;
		this.name = name;
	}
	
	/* METODO ABSTRATO NAO CONTER NADA - NAS OUTRAS CLASSES QUE HERDAM ESSE METODO, EH PRECISO FAZER
	 O OVERRIDE (SOBRESCRITA) PARA QUE CADA CLASSE TENHA SUA PROPRIA APRESENTAÇÃO */
	public abstract void presentation();
	
	@Override
	public String toString() {
		return this.name + " - " + this.ssn;
	}
}
