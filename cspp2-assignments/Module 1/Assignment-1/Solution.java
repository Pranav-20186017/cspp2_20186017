import java.util.Scanner;
/**
    Class to print out text onto the console.
*/
final class Solution {
    /**
        Solution Class Constructor.
    */
    private Solution() {
        //unused
    }
    /**
        Main Method.
        @param args of type string
    */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String roll = scanner.nextLine();
        System.out.println("Name : " + name + " , Roll Number : " + roll);
    }
}
