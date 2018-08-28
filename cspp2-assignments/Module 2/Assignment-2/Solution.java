import java.util.Scanner;
import java.lang.Math;

public class Solution {
	/*
	Do not modify this main function.
	*/
	void rootsOfQuadraticEquation(int a, int b, int c)
	{
		double d = (b*b)-(4*a*c);
		double x1 = ((-1*b) + (Math.sqrt(d))) / (2 * a);
		double x2 = ((-1*b) - (Math.sqrt(d))) / (2 * a);
		System.out.println(x1 + " " + x2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		Solution s = new Solution();
		s.rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}
