public class Main {
    public static void main(String[] args) {
        // Membuat objek Lecture
        Lecture agus = new Lecture("Agus", 35, "Tembalang", "177013");
        Lecture bambang = new Lecture("Bambang", 39, "Banyumanik", "412873");
        Lecture budi = new Lecture("Budi", 50, "Karanganyar", "123987");

        // Membuat objek Student
        Student cahyo = new Student("Cahyo", 20, "456 Elm St", "723751");
        Student dani = new Student("Dani", 20, "123 Oak St", "734621");
        Student edi = new Student("Edi", 20, "789 Pine St", "733451");
        
        // Membuat objek Course
        Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
        Course cs102 = new Course("CS102", "Data Structures", bambang);
        Course cs103 = new Course("CS103", "Algorithms", budi);
        
        // Mengaitkan Lecture dengan Course yang diajarkan
        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);
    
        // Menambahkan Student ke Course
        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);
    
        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
    
        cs103.addStudent(cahyo);
    
        // Menampilkan mata kuliah yang diambil oleh mahasiswa
        cahyo.viewEnrolledCourses();
        
        // Menampilkan mata kuliah yang diajar oleh dosen
        agus.viewTaughtCourses();
        
        // Menampilkan mahasiswa yang terdaftar pada suatu mata kuliah
        cs101.viewEnrolledStudents();
    }
}
