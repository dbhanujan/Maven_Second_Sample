package mavenSecondPackage;

public class MavenSecondClass 
	{
	public void addDefault()
	{
	int a=2;
	int b=4;
	int c=a+b;
	System.out.println(c);
	}
	public int addDefaultPrint()
	{
	int a=4;
	int b=4;
	int c=a+b;
	return c;
	}
	public void addParameter(int a, int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	public int addParameterPrint(int a, int b)
	{
	int c=a+b;
	return c;
	}
	public static void main(String args[])
	{
		MavenSecondClass obj=new MavenSecondClass();
	obj.addDefault();
	System.out.println(obj.addDefaultPrint());
	obj.addParameter(4,6);
	System.out.println(obj.addParameterPrint(6,6));
	}
	}