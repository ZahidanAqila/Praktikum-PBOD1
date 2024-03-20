import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar hs = new BujurSangkar();
        System.out.print("Masukkan sisi: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " +hs.hitungLuas(sisi));
        scan.close(); // Close the Scanner object
    }
}

// Jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak hitungLuas yang dideklarasikan di kelas BangunDatar, maka akan terjadi kesalahan kompilasi (compile error).