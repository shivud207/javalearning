package javatest;
import java.io.*;
import java.util.*;

public class strintroductionheckerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int a_length = A.length();
        int b_length = B.length();
        
        System.out.println(a_length + b_length);
        
        int result = A.compareTo(B);
        
        if(result > 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "+B.substring(0, 1).toUpperCase() + B.substring(1));
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

