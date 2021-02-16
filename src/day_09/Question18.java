package day_09;

//Is there any issue? If not, What is the result?
public class Question18 {
  public static void main(String[] args) {
      String str[]= {"name1","name2","name3"};
      String str1[]=new String[3];
      int i=0;
      
      try {
          for(String s:str) {
              str1[i]=s.substring(2,5);//There will not be any exception, cause 5 is exclusive(2, 3, 4)
              i++;
          }
      }catch(Exception e) {
          System.out.println("Catching the exception");
      }finally {
          System.out.println("This is finally");//Finally will run if there is ANY EXCEPTION OR NOT
      }
       //finally vs final() vs finalize=garbage collection?       
      for(String s:str1) {
          System.out.println(s);
      }   
  }
}