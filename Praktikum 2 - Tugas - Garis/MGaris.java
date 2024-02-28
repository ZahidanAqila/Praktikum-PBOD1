public class MGaris {
    public static void main(String[] args) {
        // Buat objek Titik
        Titik a = new Titik(1, 2);
        Titik b = new Titik(4, 6);

        // Buat objek Garis
        Garis garis1 = new Garis(a, b);

        // Cetak informasi garis
        System.out.println("Titik awal: (" + garis1.getTitikAwal().getX() + ", " + garis1.getTitikAwal().getY() + ")");
        System.out.println("Titik akhir: (" + garis1.getTitikAkhir().getX() + ", " + garis1.getTitikAkhir().getY() + ")");
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());

        // Buat objek Garis baru hasil refleksi Y
        Garis garis2 = garis1.getRefleksiY();

        // Cetak informasi garis hasil refleksi Y
        System.out.println("\nGaris hasil refleksi Y:");
        System.out.println("Titik awal: (" + garis2.getTitikAwal().getX() + ", " + garis2.getTitikAwal().getY() + ")");
        System.out.println("Titik akhir: (" + garis2.getTitikAkhir().getX() + ", " + garis2.getTitikAkhir().getY() + ")");

        // Periksa apakah garis1 tegak lurus dengan garis2
        if (garis1.isTegakLurus(garis2)) {
            System.out.println("\nGaris1 tegak lurus dengan garis2");
        } else {
            System.out.println("\nGaris1 tidak tegak lurus dengan garis2");
        }
    }
}
