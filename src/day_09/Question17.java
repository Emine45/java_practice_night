package day_09;
//Is there any issue? If not, What is the result?
public class Question17 {
  //Is there any issue? If not, What is the result?
  private String name;
  public int age;
  String job;
  
  public static void main(String[] args) {
      Question17 obj1=new Question17("Jack");//calling line 18, b/c that constructor takes 1 string parameter
      Question17 obj2=new Question17("Sam",16);//
      Question17 obj3=new Question17("Tom",18,"Tester"); //calling line 26
      obj1.printInfo();
      obj2.printInfo();
      obj3.printInfo();
      
  }
  public Question17(String name) {
      
  }
  
  public Question17(String name,int age) {
      setName(name);
  }

  public Question17(String name,int age, String job) {
      this.age=age;
      this.name=name;
      this.job=job;
  }
  
  public String getName() {
      return name;
  }
  
  public void setName(String name) {
      this.name = name;
  }
  
  void printInfo(){
      System.out.println(name+ " : "+age+" : "+job);
  }
}