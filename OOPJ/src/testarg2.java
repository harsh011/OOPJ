
public class testarg2 {
	int i;
	testarg2()
	{
		i=20;
	}
void increaseVariable(int val)
{
	val = val + 1;
	System.out.println("Vaues inside increaseVariable() method is"+val);
}
void increaseobj(testarg2 obj)
{
	System.out.println("refrence value of obj"+obj.i);
	obj.i++;
	System.out.println("refrence value of obj"+obj.i);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testarg2 t1 = new testarg2();
		testarg2 t2 = new testarg2();
		
		System.out.println("refrence value of t1 = "+t1);
		System.out.println("refrence value of t2 = "+t2);
		System.out.println("value before increment "+t2.i);
		t1.increaseobj(t2);
		System.out.println("value after increment ny refresence "+t2.i);
		t1.increaseVariable(t2.i);
		

	}

}
