import java.util.Scanner;
/**
 * Class for bigger equal smaller.
 */
final class BiggerEqualSmaller {
    /**
     * Constructs the object.
     */
    private BiggerEqualSmaller() {
        //unused
    }
    /**
     * @param args of type string
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varA = scanner.nextInt();
        int varB = scanner.nextInt();
        if (varA > varB) {
            System.out.println("Bigger");
        } else if (varA == varB) {
            System.out.println("Equal");
        } else {
            System.out.println("Smaller");
        }
    }
}
