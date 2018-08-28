import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructor.
     */
    private Solution() {
        //unused
    }
    /**
     * { function_description }.
     *
     * @param      a     { first coefficient of the quadratic }
     * @param      b     { Second coefficient of the quadratic  }
     * @param      c     { Second coefficient of the quadratic  }
     */
    void rootsOfQuadraticEquation(final int a, final int b, final int c) {
        final int f = 4;
        double d = (b * b) - (f * a * c);
        double x1 = ((-1 * b) + (Math.sqrt(d))) / (2 * a);
        double x2 = ((-1 * b) - (Math.sqrt(d))) / (2 * a);
        System.out.println(x1 + " " + x2);
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Solution s = new Solution();
        s.rootsOfQuadraticEquation(a, b, c);
    }
}