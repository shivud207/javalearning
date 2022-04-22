package javatest;

		// TODO Auto-generated method stub
		class Animal2 
		{  
			void eat(){System.out.println("eating...");}  
		}  
			class Dog extends Animal2
			{  
				void eat(){System.out.println("eating bread...");}  
				void bark(){System.out.println("barking...");}  
				void work()
				{  
					super.eat();  
					bark();  
				}  
			}  
			public class testsuper2
			{

				public static void main(String[] args) 
				{
					Dog d=new Dog();  
					d.work();  
				}	 

			}


