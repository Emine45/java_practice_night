package day_07;

public class FTE extends Employee{


    @Override
    public void task() {
        
        
    }
    @Override
    public void benefits() {
        System.out.println("FTE employee has health insurance and bonus");
        
    }
    @Override
    public void eat() {
        System.out.println("FTE employees eat at 12:00 pm");
        
    }
    @Override
    public void drink() {
        // TODO Auto-generated method stub
        
    }
}
//Person(abstract)  > Employee(abstract) >  FTE(concrete), 
//                                        Contractor(concrete)