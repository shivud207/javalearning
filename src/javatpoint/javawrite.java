package javatest;
import java.io.*; 

public class javawrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {  
	            Writer w = new FileWriter("output.txt");  
	            String content = "I love my country";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	}

}
