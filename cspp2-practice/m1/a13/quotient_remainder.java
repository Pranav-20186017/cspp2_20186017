import java.util.*;
public class quotient_remainder
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Quotient: "+ (float)a/b);
		System.out.println("Remainder: "+ a%b);

	}
}