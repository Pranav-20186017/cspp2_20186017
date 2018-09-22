/**
 * Class for task.
 */
class Task {
    /**
     * title of the job.
     */
    String title;
    /**
     * name of the person for the task.
     */
    String assign;
    /**
     * time required for completion.
     */
    int time;
    /**
     * important yes/no.
     */
    boolean important;
    /**
     * urgent yes/no.
     */
    boolean urgent;
    /**
     * status of the task.
     */
    String status;
    /**
     * Constructs the object.
     *
     * @param      title      The title
     * @param      assign     The assign
     * @param      time       The time
     * @param      important  The important
     * @param      urgent     The urgent
     * @param      status     The status
     * @throws     Exception  throws an exceptiuon.
     */
    Task(final String title, final String assign, final int time,
        final boolean important,
        final boolean urgent, final String status) throws Exception {
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
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String imp = "Not Important";
        String urg = "Not Urgent";
        if (important) {
            imp = "Important";
        }
        if (urgent) {
            urg = "Urgent";
        }
        String display = title + ", " + assign + ", " + time
        + ", " + imp + ", " + urg + ", " + status;
        return display;
    }
}