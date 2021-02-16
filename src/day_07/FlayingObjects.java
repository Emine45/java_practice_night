package day_07;

public interface FlayingObjects {
	/*
	 * 1) All of the methods are abstract by default.
	 * 2) We may or may not use abstract keyword when we create methods in an interface
	 * 3) One class can implement more than one interface
	 */
	
	void flying();  //by default this is abstract
	
	default void test() {
		
	}
    static void test2() {
		
	}

}
