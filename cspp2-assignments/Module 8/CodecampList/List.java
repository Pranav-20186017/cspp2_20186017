import java.io.BufferedInputStream;
import java.util.Scanner;
public class List {
    private int[] arr;
    private int size;
    public List() {
        size = 0;
        final int ten=10;
        arr = new int[ten];
    }
    public void add(final int item) {
        //Inserts the specified element at the end of the list.
        arr[size++] = item;
    }
    public int size() {
        // replace the code below to implement the size method
        return size;
    }
    public void remove(final int index) {
        // write the logic for remove here.
        // Think about what to do to the size variable.
        if(index > size)
        {
            System.out.println("Invalid Position Exception");
            return;
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    public int get(final int index) {
        // Replace the code below to write the code for get
        return arr[index];
    }
    public String toString() {
        // Replace the code below
        String str_arr = "[";
        for (int i = 0; i < size - 1; i++)
        {
            str_arr = str_arr + arr[i] +",";
        }
        str_arr = str_arr + arr[size - 1] +"]";
        return str_arr;
    }
    /*
     * Contains return true if the list has
     * the item passed as an argument to the method
     * So, iterate through the list and return true if
     * the item exists and otherwise false
     */
    public boolean contains(final int item) {
        // Replace the code below
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == item) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(final int item) {
        // Replace the code below
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();

        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "add":
                l.add(Integer.parseInt(tokens[1]));
                break;
                case "size":
                // invoke size method and print the list size
                // BTW, list size is not the array size
                // it is the number of items in the list
                System.out.println(l.size());
                break;
                case "print":
                // print the list (implement toString for this to work)
                // expected format is [item-1,item-2,...,item-n]
                // review the output testcase file
                System.out.println(l);
                break;
                case "remove":
                l.remove(Integer.parseInt(tokens[1]));
                break;
                case "indexOf":
                System.out.println(l.indexOf(Integer.parseInt(tokens[1])));
                break;
                case "get":
                    if (Integer.parseInt(tokens[1]) < l.size()) {
                    System.out.println(l.get(Integer.parseInt(tokens[1])));
                }
                break;
                case "contains":
                System.out.println(l.contains(Integer.parseInt(tokens[1])));
                break;
                default:
                System.out.println("Error Pick Something else");
            }
        }
    }
}
