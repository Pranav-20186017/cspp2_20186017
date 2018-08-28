import java.util.*;
class area_of_Circle
{
	public double pi()
	{
		return 3.14159265;
	}
	public double area(int radius)
	{
		return pi() * radius * radius;
	}

	public static void main(String args[])
	{
		area_of_Circle a = new area_of_Circle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int radius = scanner.nextInt();
		System.out.println(a.area(radius));
	}
}