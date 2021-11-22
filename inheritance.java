//inheritance in java which is most important topic for software industry due to its reusability 
class A
{
	private int a,b;
	public void putdata()
	{
	a=5;
	b=6;
	}
	public void display()
	{
	System.out.println("a="+a+"b="+b);
	}
}
class B extends A
{
	private int c;
	public void putdata()
	{
	super.putdata();
	c=7;
	}
	public void display()
	{
	super.display();
	System.out.println("c="+c);
	}
}
class C extends A
{
	private int d;
	public void putdata()
	{
	d=9;
	}
	public void display()
	{
	System.out.println("d="+d);
	}

}
Class D extends B
{
	private int e;
	public void putdata()
	{
	e=9;
	}
	public void display()
	{
	System.out.println("e="+e);
	}
}
class inheritance
{
	public static void main(String[] args)
	{
	C ob1=new C();
	D ob2=new D();
	C.putdata();
	C.display();
        D.putdata();
	D.display();
}
}
	