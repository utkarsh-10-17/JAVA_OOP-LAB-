package helloworl;

class A
{
	A()
	{
		System.out.println("This is A's contructor");
	}
}

class B extends A
{
	B()
	{
		System.out.println("This is B's contructor");
	}
}
 
public class hellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("hellow");
     // A A1 = new A();
     A A1 = new B();
	}

}
