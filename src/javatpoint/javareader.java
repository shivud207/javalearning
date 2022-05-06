package javatest;
import java.io.*; 

public class javareader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {  
	            Reader reader = new FileReader("file.txt");  
	            int data = reader.read();  
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	            }  
	            reader.close();  
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage());  
	        }  
	}

}
