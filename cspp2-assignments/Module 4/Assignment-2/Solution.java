import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row1 = s.nextInt();
		int col1 = s.nextInt();
		int[][] mat1 = new int[row1][col1];
		for(int i=0;i<row1;i++)
		{
			for(int j = 0;j<col1;j++)
			{
				mat1[i][j] = s.nextInt();
			}
		}
		int row2 = s.nextInt();
		int col2 = s.nextInt();
		int[][] mat2 = new int[row2][col2];
		for(int i=0;i<row2;i++)
		{
			for(int j=0;i<col2;j++)
			{
				mat2[i][j] = s.nextInt();
			}
		}
		if(row1==row2 && col1==col2)
		{
			int[][] c = new int[row2][col2];
			String res="";
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					c[i][j] = mat1[i][j] + mat2[i][j];
					res += c[i][j] + " ";
				}
				res = res.trim() + "\n";
			}
			System.out.println(res);
		} else {
			System.out.println("not possible");
		}
		
	}
}