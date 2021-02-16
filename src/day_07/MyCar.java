package day_07;

public class MyCar extends Vehicle{
	//  2. Create another class: MyCar and extend Vehicle
	//  create variables and methods:
	//  int maxSpeed;
	//  void method doUber
	//  3.Create main method in MyCar class and do the followings:
	//  assign 120 for maxSpeed
	//  assign Honda Accord for model
	//  asign 2004 for year
	//  Then print model, year, mileague, drive(), oilChange(), doUber()
	    
	    int maxSpeed;
	    public void doUber() {
	        
	    }
	    
	    public static void main(String[] args) {
	        MyCar mycar= new MyCar();
	        mycar.maxSpeed=120;
	        mycar.mileage=17000;
	        mycar.model="Honda Accord";
	        mycar.year=2004;
	        System.out.println("Max Speed : "+mycar.maxSpeed);
	        System.out.println("Mileage : "+mycar.mileage);
	        System.out.println("Model : "+mycar.model);
	        System.out.println("Year : " +mycar.year);
	        
	        //If there was no inheritance, tehn we have to create 
	        //Vehicle class object and use it to assign Vehice class variables
	        
	}
}
