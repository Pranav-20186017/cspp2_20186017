/**
 * Class for pattern.
 */
final class Pattern {
    /**
     * Constructs the object.
     */
    private Pattern() {
        //unused.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        final int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
