import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for todoist.
 */
class Todoist {
    /**
     * array of task objects.
     */
    private Task[] taskList;
    /**
     * size of the array.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Todoist() {
        final int ten = 10;
        taskList = new Task[ten];
        size = 0;
    }
    /**
     * Gets the size.
     *
     * @return     The size.
     */
    public int getSize() {
        return size;
    }
    /**
     * Adds a task.
     *
     * @param      task  The task
     */
    public void addTask(final Task task) {
        try {
            taskList[size] = task;
            size++;
        } catch (Exception e) {
            resize();
            addTask(task);
        }
    }
    /**
     * resizes the array of task objects.
     */
    void resize() {
        taskList = Arrays.copyOf(taskList, 2 * size);
    }
    /**
     * Gets the next task.
     *
     * @param      name  The name
     *
     * @return     The next task.
     */
    public Task getNextTask(final String name) {
        for (int i = 0; i < getSize(); i++) {
            if (taskList[i].assign.equals(name)
            && taskList[i].status.equals("todo")) {
                if (taskList[i].important && !taskList[i].urgent) {
                    return taskList[i];
                }
            }
        }
        return null;
    }
    /**
     * Gets the next task.
     *
     * @param      pname  The pname
     * @param      count  The count
     *
     * @return     The next task.
     */
    public Task[] getNextTask(final String pname, final int count) {
        Task[] taskCount = new Task[count];
        int itr = 0;
        for (int i = 0; i < size; i++) {
            if (taskList[i].assign.equals(pname)
            && taskList[i].status.equals("todo")) {
                if (taskList[i].important && !taskList[i].urgent) {
                    taskCount[itr] = taskList[i];
                    itr++;
                    if (itr == count) {
                      break;
                    }
                }
            }
        }
        return taskCount;
    }
    /**
     * calculates total time for completion of tasks.
     *
     * @return     {returns an integer}.
     */
    public int totalTime4Completion() {
        int total = 0;
        for (int i = 0; i < getSize(); i++) {
            if (taskList[i].status.equals("todo")) {
                total += taskList[i].time;
            }
        }
        return total;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String display = "";
        for (int i = 0; i < getSize(); i++) {
        String imp = "Not Important";
        String urg = "Not Urgent";
        if (taskList[i].important) {
            imp = "Important";
        }
        if (taskList[i].urgent) {
         urg = "Urgent";
        }
        display += taskList[i].title + ", " + taskList[i].assign
        + ", " + taskList[i].time + ", " + imp + ", " + urg + ", "
        + taskList[i].status + "\n";
        }
        return display;
    }
}
// For the Class Task plese refer Task.java
/**
 * Class for todoist main.
 */
final class TodoistMain {
   /**
    * Constructs the object.
    */
    private TodoistMain() {
        //unused
    }

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            case "add-task":
                testAddTask(todo, tokens);
                break;
            case "print-todoist":
                System.out.println(todo);
                break;
            case "get-next":
                System.out.println(todo.getNextTask(tokens[1]));
                break;
            case "get-next-n":
                int n = Integer.parseInt(tokens[2]);
                Task[] taskList = todo.getNextTask(tokens[1], n);
                System.out.println(Arrays.deepToString(taskList));
                break;
            case "total-time":
                System.out.println(todo.totalTime4Completion());
                break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        String title = tokens[1];
        String assign = tokens[2];
        int time = Integer.parseInt(tokens[three]);
        boolean important = tokens[four].equals("y");
        boolean urgent = tokens[five].equals("y");
        String status = tokens[six];
        return new Task(
                   title, assign, time, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
