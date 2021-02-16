package day_07;

public class Contractor extends Employee{


    @Override
    public void task() {
        System.out.println("Working 9 hours a week");
        
    }
    @Override
    public void benefits() {
        System.out.println("Has not benefits");
        
    }
    @Override
    public void eat() {
        System.out.println("I am eating veggy food");
        
    }
    @Override
    public void drink() {
        System.out.println("We are allowed to dring while working");
        
    }
}

