
public class Stringstack {

	String  st[];
	int size,top;
	Stringstack(int a)
	{
		this.size=a;
		st=new String[size];
		top=-1;
	}
	void push(String a)
	{
		if(top==size-1)
		{
			System.out.println("Stack is Full.....");
		}
		else
		{
			top++;
			st[top]=a;
			System.out.print(st[top]);
		}
	}
	String pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty.....");
			return null;
		}
		else
		{
			String t=st[top];
			top--;
			return t;
		}
	}
	

}
