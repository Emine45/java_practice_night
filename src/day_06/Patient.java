package day_06;

public class Patient {

	  /*
     *Create a class: Patient
     *Create 3 private instance variables String firstName; String lastName; Case currentCase; using encapsulation
     *And create getters and setters
     *Go to CaseRunner class
     *Set your first and last name
     *And print your current case using the Case class objects
     *
     */
	
	private String firstName;
	private String lastName;
	private Case currentCase;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Case getCurrentCase() {
		return currentCase;
	}
	public void setCurrentCase(Case currentCase) {
		this.currentCase = currentCase;
	}
	

}
