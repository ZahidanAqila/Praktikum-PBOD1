import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void getDetails() {
        System.out.println("Lecture Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
    }
}
