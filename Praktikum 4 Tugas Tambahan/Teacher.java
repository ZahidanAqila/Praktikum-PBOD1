import java.util.ArrayList;
import java.util.List;


class Teacher extends Person {
    private String employeeID;
    private List<Course> coursesTaught;

    public Teacher(String name, int age, String address, String employeeID) {
        super(name, age, address); // Panggil konstruktor kelas induk
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void teachCourse(Course c) {
        coursesTaught.add(c);
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public void getDetails() {
        super.getDetails(); // Panggil metode getDetails() dari kelas Person
        System.out.println("Employee ID: " + employeeID);
    }
}