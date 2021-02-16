package day_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class RandomNameGenerator {
    /* Create a class : RandomNameGenerator
     * Step1: Ask user to enter his/her name //john walker
     * Step2: Delete the spaces in the username//johnwalker
     * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
     * Step4: If there the username is not taken, then print: This username is available
     * Step5: If the username is already taken, then print This username is already taken
     * Step6: Then generate a random number, add to the name, and Print the new username 
     */
    public static void main(String[] args) {
        //Creating existing user list
        List<String> userList=new ArrayList<>();
        userList.add("samwalton");
        userList.add("johnmarry");
        userList.add("johnwalker");
        userList.add("JullyThomson");
        
        System.out.println(userList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        String fullName=scan.nextLine().replace(" ", "");
        System.out.println("User name "+fullName);
        
        String suggestedName="";
        boolean isAvailable=false;
        for(String name:userList) {
            if(name.equalsIgnoreCase(fullName)) {
                int randomNum=new Random().nextInt(100000);
                suggestedName=fullName+randomNum;
                isAvailable=true;
                break;
                
            }
            
        }
        
        if(isAvailable==false) {
            System.out.println("This username is available "+fullName);
            
        }else {
            System.out.println("This username is taken. Suggested : "+suggestedName);
        }
        scan.close();
        
    }
    
}
