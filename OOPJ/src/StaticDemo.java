
public class StaticDemo
{
	static int count=0;
	int srno;
	StaticDemo()
	{
		count++;
		srno = count;
	}
	static void displayCount()
	{
		System.out.println("total no of object creat="+count);
	}
	void display()
	{
		System.out.println("sr. no. of object= "+srno);
	}
	public static void main(String[] args)
	{
		
	    StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
	    obj1.display();
	    StaticDemo obj3 = new StaticDemo();
	    obj2.display();
	    obj3.display();
	    System.out.print("total no of object creat="+count);
	}

}

