package day_07;

public class Plane implements FlayingObjects,ObjectWithEngine{

    @Override
    public void flying() {
        System.out.println("Boing last plane can go 1500 mile/h");
        
    }
    @Override
    public void power() {
        System.out.println("5600 horse power");
        
	}

}
