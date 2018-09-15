import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Quiz {
    public Quiz() {
        //unused.
    }
    ArrayList<String> Questions = new ArrayList<>();
    ArrayList<String> Choices = new ArrayList<>();

    public String toString() {
        return "";
    }
    public void add(String s) {
        Questions.add(s);
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        String string;
        String[] tokens;
        int err;
        int error;
        if (questionCount == 0 ) {
            System.out.println("Quiz does not have questions");
            return;
        }
        for(int i = 0;i<questionCount;i++) { 
            string = s.nextLine();
            if(string.charAt(0) == ':') {
                System.out.println("Error! Malformed question");
                return;
            }
            tokens = string.split(":");
            try {
            err = Integer.parseInt(tokens[4]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error! Malformed question");
                return;
            }
            if (err > 0) {
                System.out.println("Invalid penalty for question about sony");
                return;
            }
            error = Integer.parseInt(tokens[3]);
            if (error < 0) {
                System.out.println("Invalid max marks for question about sony");
                return;
            }

        }
        System.out.println(questionCount + " are added to the quiz");
    }
    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
    }
    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report


    }
}
