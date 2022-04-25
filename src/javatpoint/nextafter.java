package javatest;

public class nextafter   
{  
public static void main(String[] args)   
        {  
            double a = 84352.24;  
             double b = 154.284;  
             // print the next number for a towards b  
             System.out.println(Math.nextAfter(a, b));  
             // print the next number for b towards a  
             System.out.println(Math.nextAfter(b, a));  
      }  
}  