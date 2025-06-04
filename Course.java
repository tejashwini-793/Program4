public class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }

    // You can also add a main() here to test Course alone if needed.
}

