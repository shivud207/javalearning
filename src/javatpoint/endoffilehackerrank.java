package javatest;
import java.io.*;
import java.util.*;

public class endoffilehackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        int line_number = 1;
        while(scanner.hasNext())
        {
            System.out.println(line_number +" " + scanner.nextLine());
            line_number++;
        }
        scanner.close();
	}

}
