import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Teacher lecture;
    private List<Participant> studentsEnrolled;

    public Course(String courseCode, String courseName, Teacher lecture) {
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

    public Teacher getLecture() {
        return lecture;
    }

    public void setLecture(Teacher lecture) {
        this.lecture = lecture;
    }

    public List<Participant> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(Participant s) {
        studentsEnrolled.add(s);
    }

    public void removeStudent(Participant s) {
        studentsEnrolled.remove(s);
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Participant student : studentsEnrolled) {
            System.out.println(student.getName());
        }
    }
}
