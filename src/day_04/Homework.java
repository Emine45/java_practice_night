package day_04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 3 numbers: ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        
        if(n1>n2&&n1>n3) { 
        	System.out.println("The biggest number is "+ n1);    
        	}
        if(n2>n1&&n2>n3) { 
        	System.out.println("The biggest number is "+ n2);    
        	}
        if(n3>n1&&n3>n2) { 
        	System.out.println("The biggest number is "+ n3); 
        	}
        
        if(n1<n2&&n1<n3) { 
        	System.out.println("The smallest number is "+ n1);  
        	}
        if(n2<n1&&n2<n3) { 
        	System.out.println("The smallest number is "+ n2);     
        	}
        if(n3<n1&&n3<n2) { 
        	System.out.println("The smallest number is "+ n3);   
        	}
        scan.close();
	}

}
