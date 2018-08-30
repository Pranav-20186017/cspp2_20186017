
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int val[] = new int[n];
		for(int i=0;i<n;i++)
		{
			val[i] = sc.nextInt();
		}
		Arrays.sort(val);
		System.out.println(val[val.length-1]);
	}
}
