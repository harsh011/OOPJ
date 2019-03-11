
public class Testarg {
int i;
Testarg()
{
	i=20;
}
void increment(int a)
{
a=a+1;
System.out.println("Incremented values are :"+a);
}
void referance(Testarg c)
{
	System.out.println("Referance value of object is"+c);
	System.out.println("Previous value of i : "+c.i);
	c.i=c.i+1;
	System.out.println("new value of i : "+c.i);
}
	public static void main(String[] args) {
Testarg t=new Testarg();
Testarg t1=new Testarg();
System.out.println("Referance value of object t"+t);
System.out.println("Referance value of object t1"+t1);
t.increment(10);
t.referance(t1);
Testarg t2=t1;
System.out.println("Referance value of object t1"+t2);
System.out.println("Referance value of object t1"+t1);



	}

}
