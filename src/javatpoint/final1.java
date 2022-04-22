package javatest;

//public class final1 


	
		class final1{  
			  void cube(final int n)
			  {
				//int a;
			   int a=n+2;//can't be changed as n is final  
			   //n*n*n;
			   System.out.println(a);
			  
			  }  
			  public static void main(String args[])
			  {  
				  final1 b=new final1();  
			     b.cube(5);
			 }  
		}  




