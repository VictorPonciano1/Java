package model.heranca;

public class Person {

	protected String name; //O PROTECTED 
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void presentation() {
		System.out.println("Hello, my name is: " + name + " and I'm " + age + " years old.");
	}
}
