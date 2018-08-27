import java.util.*;
public class degrees_to_fahrenheit
{
	public static void main(String args[])
	{
		Scanner scanner =  new Scanner(System.in);
		float celcius = scanner.nextFloat();
		double fahrenheit = ((celcius/5.0)*9.0)+32;
		System.out.println("Fahrenheit = "+fahrenheit);
	}
}