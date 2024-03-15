public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Agus", 35, "Tembalang", "EMP001");
        Teacher teacher2 = new Teacher("Bambang", 50, "Banyumanik", "EMP002");
        Teacher teacher3 = new Teacher("Susilo", 39, "Karanganyar", "EMP003");

        Participant student1 = new Participant("Cahyo", 20, "Tembalang", "S001");
        Participant student2 = new Participant("Dani", 22, "Tembalang", "S002");
        Participant student3 = new Participant("Edi", 23, "Banyumanik", "S003");

        Course course1 = new Course("CSE101", "Introduction to Computer Science", teacher1);
        Course course2 = new Course("CSE202", "Data Structures", teacher2);
        Course course3 = new Course("CSE202", "Algorithms", teacher3);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student3.enrollCourse(course3);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);
        course3.addStudent(student3);

        student1.getDetails();
        student1.viewEnrolledCourses();

        teacher1.getDetails();
        teacher1.viewTaughtCourses();

        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();
    }
}
