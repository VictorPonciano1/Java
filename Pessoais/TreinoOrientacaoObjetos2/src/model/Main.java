package model;
import model.heranca.Man; 
import model.heranca.Woman;

public class Main {

	public static void main(String[] args) {
		
		Man man = new Man("Robert", 20, "Kansas City Chiefs");
		man.presentation();
		man.clubPresentation();
	
		Woman woman = new Woman("Julie" , 18, "A Song of Ice and Fire");
		woman.presentation();
		woman.bookPresentation();
	}
}
