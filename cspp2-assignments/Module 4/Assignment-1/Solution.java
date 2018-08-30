import java.util.Arrays;
import java.util.Scanner;
//max
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
 * @param      args  The arguments
 */
public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        Arrays.sort(val);
        System.out.println(val[val.length - 1]);
    }
}

