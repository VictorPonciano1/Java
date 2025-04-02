package br.com.cdb.heranca.model;

//EXTENDS: ELE HERDA OS ATRIBUTOS DA CLASSE "PERSON" (PESSOA);

public class Student extends Person { //STUDENT: ESTUDANTE OU ALUNO;

	public int id; //ID: MATRICULA;
	 
	public Student(String name, int id) {
		super(name); //SUPER: ACESSA METODOS DA SUPER CLASSE, NESSE CASO: PERSON (PESSOA);
		this.id = id;
	}
	
	//METODO DA SOBREESCRITA (OVERRIDE) QUE PRATICAMENTE ESCREVE ALGO EM CIMA DO QUE JÁ ESTA ESCRITO;
	@Override 
	public void presentation() { 
		System.out.println("Hello, I'm the student " + name + " and my school id is " + id);
	}
}
