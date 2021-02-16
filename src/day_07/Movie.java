package day_07;

public class Movie {
	
	//  1. Create a class: Movie
	//  create variables and methods and create getter setter for private variables:
	//  private String name;
	//  int duration;
	//  boolean isGood;
	//  public void shortOrLong() {
//	          //Print: name+" was short!" if duration is less than 90 minutes
//	          //Print: name+" was long!" otherwise
//	      }
//	      
//	      public void movieInfo() {
//	          print the movie name, duration and isGood
//	      }
	    private String name;
	    int duration;
	    boolean isGood;
	    public void shortOrLong() {
	        if (duration < 90) {
	            System.out.println(name + " was short");
	        } else {
	            System.out.println(name + " was long");
	        }
	    }
	    public void movieInfo() {
	        System.out.println("Mavie Name : "+name);
	        System.out.println("Movie duration : "+duration);
	        System.out.println("Movie was Good : "+isGood);
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    
	}
}