import java.util.Scanner;
/**
    Class to compute area of a triangle.
*/
final class Solution {
    /**
    Do not modify this main function.
    */
    private Solution() {
        //unused
    }
    /**
        Method to compute area of a Traingle.
        @param base of type int
        @param height of type int
    */
    public static void areaOfTriangle(final int base, final int height) {
        double area = (base * height) / 2;
        System.out.println(area);
    }
    /**
        Main Method.
        @param args of type string
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int height = scan.nextInt();
        areaOfTriangle(base, height);
    }
    /*
    Need to fill the areaOfTriangle function and print the output
    of fahrenheit.
    */
}