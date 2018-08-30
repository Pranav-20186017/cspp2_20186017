
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
import java.lang.Math;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static String binaryToDecimal(final String s)
	{
		double val = 0;
		int power = 0;
		for(int i=s.length()-1;i>0;i--)
		{
			char ch = s.charAt(i);
			int temp = Character.getNumericValue(ch);
			val = val + (temp * Math.pow(2,power));
			power++;
		}
		String string = Double.toString(Math.round(val));
		return string;
	}

}
