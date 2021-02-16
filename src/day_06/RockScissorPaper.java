package day_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        /* Create a class : RockScissorPaper
         * Step1:Create 3 integers :
         * int numberOfMyWin;
         * int numberOfComputerWin;
         * int gameOver; 
         * Step2: Create a list and allOptions in this order: Rock, Scissor, Paper 
         * Step3: Create a variable : myGuess and get the input from user;  
         * Step4: Create a variable : computerGuess and get a random number from user 0, 1, or 2  
         * Step5: Inside the while loop, let user enter a number every time and let the computer make a guess
         * Step6: Print the winner at the end of every win. Print tie if user and computer makes same guess
         * Step7: Run while loop until someone wins 3 times. 3 winner wins the game. 
         * E.g   myGuess = Rock      ,  computerGuess    : Scissor THEN  I won 
         *       myGuess = Rock      ,  computerGuess    : Paper   THEN  Computer won
         *       myGuess = Scissors  ,  computerGuess    : Paper   THEN  I won     
         */
        
         int numberOfMyWin=0;
         int numberOfComputerWin=0;
         int gameOver=3; 
         
        List<String> allOptions= new ArrayList<>();
        allOptions.add("Rock");
        allOptions.add("Scissor");
        allOptions.add("Paper");
        //System.out.println(allOptions);
        
        Scanner scan=new Scanner(System.in);
        
        
        while(numberOfMyWin<gameOver&&numberOfComputerWin<gameOver) {
            System.out.println("Enter 0 for Rock, Enter 1 for Scissors, Enter 2 for Paper");
            int myGuess=scan.nextInt();
            int computerGuess= new Random().nextInt(3);//0 or 1 or 2 
            System.out.println("My Guess : "+allOptions.get(myGuess));
            System.out.println("Computer Guess : "+allOptions.get(computerGuess));
            
    
            if(myGuess==computerGuess) {
                System.out.println("Tie");
            }else if((myGuess==0&&computerGuess==1) || (myGuess==1&&computerGuess==2)||(myGuess==0&&computerGuess==2)){
                System.out.println("I won");
                numberOfMyWin++;
            }else {
                System.out.println("Computer won");
                numberOfComputerWin++;
            
            }
            
            
        }
        System.out.println("==GAME OVER==");
        System.out.println("My Won : "+numberOfMyWin);
        System.out.println("Computer Won : "+numberOfComputerWin);
            
        
    }
}
