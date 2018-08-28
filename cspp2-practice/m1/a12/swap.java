import java.util.Scanner;
public final class swap
{
	void swap_vals(int a,int b)
	{
		int temp=0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = "  + a + " " + "b = " + b);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); 
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		swap obj = new swap();
		obj.swap_vals(a,b);
	}
}
