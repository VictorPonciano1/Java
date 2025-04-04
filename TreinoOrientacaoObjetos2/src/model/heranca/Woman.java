package model.heranca;

public class Woman extends Person {

	protected String favoriteBook;
	
	public Woman(String name, int age, String favoriteBook) {
		super(name, age);
		this.favoriteBook = favoriteBook;
	}
	
	public String getFavoriteBook() {
		return favoriteBook;
	}
	public void bookPresentation() {
		System.out.println("My favorite Book is " + favoriteBook);
	}
}
