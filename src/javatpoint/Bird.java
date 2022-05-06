package javatest;



class animal1
{
	void walk()
	{
		System.out.println("I am walking");
	}
}

class bird1 extends animal1
{
	void fly()
	{
		System.out.println("I am flying");
	}

    void sing()
    {
        System.out.println("I am singing");
    }

	public static void main(String args[])
	   {
		  bird1 b = new bird1();
		  b.walk();
		  b.fly();
	      b.sing();
		
	   }
   
}

