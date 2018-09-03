import java.util.Scanner;
/**
 * Class for input validator.
 */
final class InputValidator {
    /**
     * Constructs the object.
     */
    private InputValidator() {

    }
    /**
     * { var_description }.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    InputValidator(final String input) {
        this.input = input;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        final int val = 6;
        if (input.length() >= val) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * { item_description }.
     * @param args of type string
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}