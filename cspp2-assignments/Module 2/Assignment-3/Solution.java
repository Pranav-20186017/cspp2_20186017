import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	static long power(int base, int exponent)
	{
		long ans=1;
		if(exponent==0)
			return 1;
		for(int i=1;i<=exponent;i++)
		{
			ans = ans * base;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
}
