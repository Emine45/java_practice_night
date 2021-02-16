package day_07;

public abstract class Person {
//  command+? /
//  control+? /
	
	 public void speak() {
	        System.out.println("I am the speak method in Person class");
	    }
	    
	    public abstract void eat();
	    public abstract void drink();
	    
	    /*
	     * what is abstraction?. It is a blueprint hiding the implementation
	     * 1. We cannot create object of Abstract class
	     * 2. If a method is abstract, then the method doesn't have a body
	     * 3. Abstract class may or may not have non-abstract method.
	     * 4. We have to implement all abstract method in the non abstract(concrete) child!!!
	     * 
	     * Airplale, helicopter, bird, UFO, Kite,...(flying object)
	     * FlyingObjects class can be created as abstract, and can be used as a base/blueprint
	     * 
	     * Safari, Chrome, IE, Firefox, Opera,..(Browser)
	     * 
	     * 
	     * 
	     * Create class
	    //Person(abstract)  > Employee(abstract) >  FTE(concrete), 
	    //                                        Contractor(concrete)
	     * 
	     * Person class has:
	     * nonabstract speak() => print "I am the speak method in Person class"
	     * abstract  eat()
	     * abstract drink()
	     */
	    
	}