package javatest;

class Animal
{
	void walk()
	{
		System.out.println("I am walking");
	}
}

class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}

    void sing()
    {
        System.out.println("I am singing");
    }

	void walk()
	{
		System.out.println("I am walking1");
	}
}

public class inheritance {
	
	public static void main(String args[])
	   {
		  Bird bird = new Bird();
		  Animal animal = new Animal();
		  bird.walk();
		  bird.fly();
	      bird.sing();
	      animal.walk();
		
	   }
}