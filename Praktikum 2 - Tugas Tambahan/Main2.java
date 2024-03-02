public class Main2 {
    public static void main(String[] args) {
        // Lecture (Dosen)
        Lecture lecture1 = new Lecture("Agus", 35, "Tembalang", "EMP001");
        Lecture lecture2 = new Lecture("Bambang", 50, "Banyumanik", "EMP002");
        Lecture lecture3 = new Lecture("Susilo", 39, "Karanganyar", "EMP003");

        // Students (Mahasiswa)
        Student student1 = new Student("Cahyo", 20, "Tembalang", "S001");
        Student student2 = new Student("Dani", 22, "Tembalang", "S002");
        Student student3 = new Student("Edi", 23, "Banyumanik", "S003");

        // Courses (Mata Kuliah)
        Course course1 = new Course("CSE101", "Introduction to Computer Science", lecture1);
        Course course2 = new Course("CSE202", "Data Structures", lecture2);
        Course course3 = new Course("CSE202", "Algorithms", lecture3);

        // Method enrollCourse
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student3.enrollCourse(course3);

        // Method addStudent
        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);
        course3.addStudent(student3);

        // Method getDetails
        student1.getDetails();
        student1.viewEnrolledCourses();

        lecture1.getDetails();
        lecture1.viewTaughtCourses();

        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();
    }
}
