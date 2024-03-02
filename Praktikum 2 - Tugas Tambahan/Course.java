import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(Student s) {
        studentsEnrolled.add(s);
    }

    public void removeStudent(Student s) {
        studentsEnrolled.remove(s);
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : studentsEnrolled) {
            System.out.println(student.getName());
        }
    }
}
