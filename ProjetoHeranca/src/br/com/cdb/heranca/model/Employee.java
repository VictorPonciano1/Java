package br.com.cdb.heranca.model;

//EXTENDS: ELE HERDA OS ATRIBUTOS DA CLASSE "PERSON" (PESSOA);

public class Employee extends Person{ //EMPLOYEE: EMPREGADO OU FUNCIONARIO;

	public double payment;
	
	public Employee(String name) {
		super(name);
	}
	
	/* SE CASO UM "FINAL" FOSSE COLOCADO NESTE METODO PRESENTATION, AQUELES QUE O HERDAM NAO PODERIAM
	 * SOBRESCREVELO, POIS O "FINAL" JA DELIMITA QUE AQUELE SERIA O "FIM" DAQUELE CODIGO */
	@Override
	public void presentation() {
		System.out.println("Hello, my name is: " + name + " and I work here since 2010. My salary is: " 
	+ payment);
	}
}
