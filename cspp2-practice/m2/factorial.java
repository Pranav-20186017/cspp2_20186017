import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		int fact = 1;
		for(int i=1;i<=inp;i++)
		{
			fact *= i;
		}
		System.out.println("Factorial :" + fact);
	}
}