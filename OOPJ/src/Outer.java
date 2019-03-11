        public class Outer {

	private int x;
	Outer (int value)
	{
		x = value;
		
	}
	void test()
	{
		Inner inObj = new Inner();
		inObj.display();
		
	}
	class Inner {
		int y; Inner()
		{
			y =10;
			
		}
		void display()
		{
			System.out.println("Value of  out class x is " +x);
			System.out.println("Value of inner class y is " +y);
			
		}
		
	}
public static  void main(String[] args )
	{
		Outer obj = new Outer(200);
		obj.test();
	}
}
