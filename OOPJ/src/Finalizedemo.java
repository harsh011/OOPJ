
public class Finalizedemo {

	int i,j,k;
	Finalizedemo()
	{
		System.out.println("Constructor Called");
		
	}
	public static void main(String[] args) 
	{
		for(;;)
			{new Finalizedemo();}
	}
	protected void finalize()
	{
		System.out.println(" Final method called");		
	}
	}


