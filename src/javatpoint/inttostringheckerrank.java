package javatest;
import java.util.*;
import java.security.*;

public class inttostringheckerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoNotTerminate.forbidExit();

		  try {
		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   //String s=???; Complete this line below
		    String s = Integer.toString(n);
		   //Write your code here

		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		  } 
		  catch (DoNotTerminate.ExitTrappedException e) 
		  {
		   System.out.println("Unsuccessful Termination!!");
		  }
	}
}

		