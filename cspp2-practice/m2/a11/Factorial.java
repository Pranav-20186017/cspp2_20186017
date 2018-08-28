import java.util.Scanner;
/**
 * Class for factorial.
 */
final class Factorial {
    /**
     * Constructs the object.
     */
    private Factorial() {
        //unused
    }
/**
 * { function_description }.
 *
 * @param      n     { integer}.
 *
 * @return     { long factorial }.
 */
static long fact(final int n) {
        if (n >= 1) {
        return n * fact(n - 1);
    } else {
        return 1;
    }
}
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        System.out.println(fact(inp));
    }
}
