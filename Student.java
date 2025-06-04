
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public void displayCoursesWithLowMarks() {
        System.out.println("\nCourses with marks < 40 for " + name + ":");
        boolean found = false;
        for (Course c : courses) {
            if (c.getMarks() < 40) {
                System.out.println(c.getCourseName() + " - " + c.getMarks() + " marks");
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    // Test main
    public static void main(String[] args) {
        Student s = new Student("Ravi Kumar", "B.Tech", 3);
        s.registerCourse(new Course("Mathematics", 38));
        s.registerCourse(new Course("Physics", 72));
        s.registerCourse(new Course("Data Structures", 33));

        s.displayStudentInfo();
        s.displayCoursesWithLowMarks();
    }
}
