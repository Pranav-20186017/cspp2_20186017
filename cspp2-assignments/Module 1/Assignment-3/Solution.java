import java.util.Scanner;

public class Solution {
	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
	public static void calculateFromDegreesToFarenheit(double degreesCelsius)
	{
		double degreesFarenheit = (((degreesCelsius/5.0)*9)+32);
		System.out.println(degreesFarenheit);
	}
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double degreesCelsius = scan.nextDouble();
		calculateFromDegreesToFarenheit(degreesCelsius);
	}
	
}