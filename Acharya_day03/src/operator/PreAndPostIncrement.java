package operator;

public class PreAndPostIncrement {
	public static void main(String arg[])
	{
	int a = 5;
	int b = 2;
	int c;
	int d;
	c = ++b; // LINE A
	d = a++; // LINE B
	c++; // LINE C
	System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
	}
}
