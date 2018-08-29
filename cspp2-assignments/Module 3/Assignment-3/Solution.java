import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		//unused.
	}
    public static int gcd(int a, int b) {
    	if (b==0) {
            return a;
        } 
        else {
            return gcd(b, b%a);
        }

    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
}
