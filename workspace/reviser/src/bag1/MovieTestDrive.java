package bag1;

class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("paying the movie"+"title:"+title);
	}
}

public class MovieTestDrive{
	public static void main(String[] args) {
		Movie one=new Movie();
		one.title="gone with the stock";
		one.genre="tragic";
		one.rating=-2;
		Movie two=new Movie();
		two.title="lost in cubicle space";
		two.genre="comedy";
		two.rating=5;
		two.playIt();
	}
}
