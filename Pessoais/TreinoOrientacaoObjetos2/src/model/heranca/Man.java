package model.heranca;

public class Man extends Person {

	protected String favoriteClub;

	public Man(String name, int age, String favoriteClub) {
		super(name, age);
		this.favoriteClub = favoriteClub;
	}
	
	public String getFavoriteClub() {
		return favoriteClub;
	}
	
	public void clubPresentation() {
		System.out.println("My favorite NFL Club is " + favoriteClub);
	}
}
