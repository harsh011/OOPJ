
public class Box
{
	int w,h,d;
	Box()
	{
		w=10;
		h=20;
		d=30;
		
	}
	Box(int i,int j,int k)
	{
		w=i;
		h=j;
		d=k;
	}
	Box(Box o)
	{
		w=o.w;
		h=o.h;
		d=o.d;
	}
	int getvolume()
	{
		return w*h*d;
	}
	
public static void main(String[] args) 
{
	Box a= new Box(5,6,9);
	System.out.println(" Your Volume is"+a.getvolume());
	Box b=a;
	System.out.println(" Your Volume is"+b.getvolume());
	Box c= new Box(a);
	System.out.println(" Your Volume is"+c.getvolume());
	System.out.println(" Your address for a is"+a);
	System.out.println(" Your address for b is"+b);
	System.out.println(" Your address for c is"+c);
	
	
		
}

}
