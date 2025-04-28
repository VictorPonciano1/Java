package br.com.cdb.heranca.model;

/* EXTENDS: ELE HERDA OS ATRIBUTOS DA CLASSE "EMPLOYEE", QUE POR JA ESTAR HERDANDO A CLASSE "PERSON", 
FAZ COM QUE NAO SEJA PRECISO CHAMAR A "CLASSE PAI" QUE EH A "PERSON" */

public class Teacher extends Employee { //TEACHER: PROFESSOR;

	public int classesquantity;
	
	public Teacher(String name) {
		super(name);
	}
	
	//SOBRECARGA DE METODOS; (METHOD SUPERCHARGE):
	public void newPayment(double payment) {
		this.payment = payment;
	}
	public void newPayment(double newPayment, int newClassesQuantity) {
		this.payment = newPayment;
		this.classesquantity += newClassesQuantity;
	}
	
	@Override
	public void presentation() {
		System.out.println("Hello, my name is " + name + " and I'm a teacher for a long time, "
				+ "my salary is $" + payment + " and I have " + classesquantity + " classes.");
	}
}
