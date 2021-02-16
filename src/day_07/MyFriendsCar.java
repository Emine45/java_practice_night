package day_07;

public class MyFriendsCar extends Vehicle{
//	     Now complete the task:
//      Create a class MyFriendsCar and extend Vehicle
//      create 1 int variable :price and assign a value
//      Then create a method :selling() and print This car is for sale and price is price
//      and print assign and print all of the information of the car
	   
	
	//reusability, easy maintance,keep coding organized
	 int price = 25000;
	 
	 
		public void selling() {
			System.out.println("Selling price for this car is" + price);
		}
		
	
	public static void main(String[] args) {
		MyFriendsCar myFriendsCar = new MyFriendsCar();
		myFriendsCar.model="BMW";
		myFriendsCar.mileage=7500;
		myFriendsCar.year=2018;
		
		myFriendsCar.selling();
		System.out.println(myFriendsCar.model + "\nMileage " + myFriendsCar.mileage + "\nYear " + myFriendsCar.year);
        
	}
	


}
