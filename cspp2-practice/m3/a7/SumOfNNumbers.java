import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
final class SumOfNNumbers {
    /**
     * Constructs the object.
     */
    private SumOfNNumbers() {
        //unused.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(
            "Sum of" + " " + n + " " + "natural numbers is" + " " + sum);
    }

}
