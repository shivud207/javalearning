package javatest;

import java.util.*;

public class ifelsehackerrank {



    private static final Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
    	   	
    	//System.out.print("Enter value for N:- ");  
        //int N = sc.nextInt();
        int N = 15;
        
        //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N%2 !=0)
        {
            System.out.println("Weird");
        }
        else if (N>=2 && N<=5)
        {
            System.out.println("Not Weird");
        }
        else if (N>=6 && N<=20)
        {
            System.out.println("Weird");
        }
        else if (N>=20)
        {
            System.out.println("Not Weird");
        }
        //sc.close();
    }
}
