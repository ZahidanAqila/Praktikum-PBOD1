import java.util.ArrayList;
import java.util.List;

class Participant extends Person {
    private String participantID;
    private List<Course> coursesEnrolled;

    public Participant(String name, int age, String address, String participantID) {
        super(name, age, address); // Panggil konstruktor kelas induk
        this.participantID = participantID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getParticipantID() {
        return participantID;
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

    @Override
    public void getDetails() {
        super.getDetails(); // Panggil metode getDetails() dari kelas Person
        System.out.println("Participant ID: " + participantID);
    }
}