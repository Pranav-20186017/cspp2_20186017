import java.util.Scanner;
//class to check seven
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
    /**
     * { function_description }.
     *
     * @param      val   The value
     *
     * @return     { description_of_the_return_value }
     */
    public static int checkSeven(final int val) {
        int flag = 0;
        int n = val;
        final int ten = 10;
        final int seven = 7;
        while (n != 0) {
            int rem = n % ten;
            if (rem == seven) {
                flag++;
            }
            n = n / ten;
        }
        return flag;
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int flag;
        for (int i = 1; i <= n; i++) {
            flag = checkSeven(i);
            count += flag;
        }
        System.out.println(count);
    }
}
