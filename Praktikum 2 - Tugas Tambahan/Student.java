import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
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

    public String getStudentID() {
        return studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : coursesEnrolled) {
            System.out.println(course.getCourseName());
        }
    }

    public void getDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Student ID: " + studentID);
    }
}
