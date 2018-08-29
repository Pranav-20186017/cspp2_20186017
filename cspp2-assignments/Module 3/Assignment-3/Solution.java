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
        int gcd = 1;
    	for (int i=1; i<=a && i<=b;i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd; 

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
