
public class stringstack2 {
	String  st[];
	int size,top;
	stringstack2(int a)
	{
		this.size=a;
		st=new String[size];
		top=-1;
	}
	void push(String a)
	{
		if(top==size-1)
		{
			System.out.println("Stack is Full");
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
			System.out.println("Stack is Empty");
			return null;
		}
		else
		{
			String t=st[top];
			top--;
			return t;
		}
	}
	public static void main(String[] args) {
		
		stringstack2 s1 = new stringstack2(3);
		s1.push("a");
		s1.push("b");
		s1.push("c");
		s1.push("d");
		
		System.out.println("Stack value = "+s1.pop());
		System.out.println("Stack value = "+s1.pop());
		System.out.println("Stack value = "+s1.pop());
		System.out.println("Stack value = "+s1.pop());
		

	}

}
