public class A{
  public  static A fact()
	{
		return new A();
	}
	void m()
	{ System.out.println("m called");}
}

class Main{
	public static void main(String args[])
	{
		A a = A.fact();
		a.m();
	}
}