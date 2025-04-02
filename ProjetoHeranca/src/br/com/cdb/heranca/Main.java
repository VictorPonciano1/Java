package br.com.cdb.heranca;

/* CREATING IN ENGLISH USING TERMS FROM THE USA TO BE FAMILIARIZED WITH THE ENGLISH LANGUAGE 
 * THE TRANSLATION WILL FOLLOW THE TERMS */

import br.com.cdb.heranca.model.Person;
import br.com.cdb.heranca.model.Student;
import br.com.cdb.heranca.model.Teacher;
import br.com.cdb.heranca.model.Janitor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//CLASSE ABSTRATA = NAO PODE SER INSTANCIADA
		/* PERSON 
		Person person = new Person("The Director");
		person.ssn = 999888777;;
		System.out.println(person.toString()); */
		
		/* STUDENT */
		Student classmate = new Student("Victor", 38);
		classmate.ssn = 222444666;
		System.out.println(classmate + " - METODO 'toString' ESTA IMPLICITO AQUI"); //toStrign = IMPLICITO;
		
		/* EMPLOYEE */
		Teacher mrjohn = new Teacher("Mr. John");
		mrjohn.ssn = 1113335557;
		mrjohn.payment = 500.00;
		mrjohn.classesquantity = 4;
		mrjohn.newPayment(800.00, 6);
	
		Janitor janitor = new Janitor("Mr. Joseph");
		janitor.shift = "Night";
		janitor.payment = 200.00;
		
		//CREATING AND POPULATING A LIST;
		ArrayList<Person> schoolList = new ArrayList<Person>();
		// schoolList.add(person); - OBJETO NAO EXISTE, NAO PODE SER INSTANCIADO;
		schoolList.add(classmate);
		schoolList.add(mrjohn);
		schoolList.add(janitor);
		
		for (Person p : schoolList) {
			p.presentation();
			
			//PARTE COMENTADA PARA VER A SINTAXE EXATA;
		/*	if (p instanceof Teacher) { 
				System.out.println(" " + ((Teacher) p).classesquantity);
			} */
		}
		
		scanner.close();
	}
}