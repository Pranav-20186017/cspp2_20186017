import java.util.Scanner;
/**
 * Class for area of circle.
 */
final class AreaOfCircle {
    /**
     * Constructs the object.
     */
    private AreaOfCircle() {
        //unused
    }
    /**
     * { function_description }.
     *
     * @return  pi   { returns the value of pi }
     */
    public double pi() {
        final double p = 3.14159265;
        return p;
    }
    /**
     * { function_description }.
     *
     * @param      radius  The radius
     *
     * @return     { compute the area of a circle }
     */
    public double area(final int radius) {
        return pi() * radius * radius;
    }
    /**
     * @param args of type String.
     */

    public static void main(final String[] args) {
        AreaOfCircle a = new AreaOfCircle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radius = scanner.nextInt();
        System.out.println(a.area(radius));
    }
}
