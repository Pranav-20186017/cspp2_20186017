import java.util.Scanner;
import java.lang.Math;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			long res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static long binaryToDecimal(String s)
	{
		int max_pow = s.length()-1;
		double val = 0;
		for(int i=0;i<s.length();i++) {
			char k = s.charAt(i);
			int temp = Character.getNumericValue(k);
			val = val + (temp * Math.pow(2,max_pow));
			max_pow--;
		}
		// System.out.println(val);
		long final_val = Math.round(val);
		return final_val;
	}

}
