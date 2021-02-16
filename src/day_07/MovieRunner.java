package day_07;

public class MovieRunner extends Movie{

	//  2. Create another class: MovieRunner and do the followings
	//  Create main method
	//  Create 3 Movie objects and assign values of your choice. 
	//  Example:
	//  Move name=starWars
	//  duration=120
	//  isGood=true
	//  And print the movie information
	    public static void main(String[] args) {
	        MovieRunner starWars=new MovieRunner();
	        starWars.setName("Star Wars");
	        starWars.duration=120;
	        starWars.isGood=true;
	        System.out.println("====Printing Star Wars Information====");
//	      System.out.println(starWars.getName());
//	      System.out.println(starWars.duration);
//	      System.out.println(starWars.isGood);
	        
	        starWars.movieInfo();
	        starWars.shortOrLong();
	        
	        MovieRunner castAway=new MovieRunner();
	        castAway.setName("Cast Away");
	        castAway.duration=89;
	        castAway.isGood=false;
	        
	        System.out.println("=====Printing Cast Away Information====");
	        castAway.movieInfo();
	        castAway.shortOrLong();
	        
	        
	    }   
	}