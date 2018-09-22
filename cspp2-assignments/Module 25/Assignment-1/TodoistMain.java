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
        for (int i = 0; i< getSize(); i++) {
        String imp = "Not Important";
        String urg = "Not Urgent";
        if (taskList[i].important == true) {
            imp = "Important";
        } 
        if (taskList[i].urgent == true) {
         urg = "Urgent";
        }
        display += taskList[i].title + ", " + taskList[i].assign
        + ", "+ taskList[i].time+", "+ imp + ", " + urg +", "
        + taskList[i].status + "\n";
        }
        return display;
    }
}
class Task {
    String title;
    String assign;
    int time;
    boolean important;
    boolean urgent;
    String status;

    Task(String title, String assign, int time, boolean important,
         boolean urgent, String status) throws Exception {
        if (title.equals("")) {
            throw new Exception("Title not provided");
        }
        if (time < 0) {
            throw new Exception("Invalid timeToComplete " + time);
        }
        if (!status.equals("todo") && !status.equals("done")) {
            throw new Exception("Invalid status " + status);
        }
        this.title = title;
        this.assign = assign;
        this.time = time;
        this.important = important;
        this.urgent = urgent;
        this.status = status;
    }
    public String toString() {
        String imp = "Not Important";
        String urg = "Not Urgent";
        if (important == true) {
            imp = "Important";
        }
        if(urgent == true) {
            urg = "Urgent";
        }
        String display = title + ", " + assign + ", " + time + ", " + imp + ", " + urg + ", " + status;
        return display;
    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {

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
        String title = tokens[1];
        String assign = tokens[2];
        int time = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
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