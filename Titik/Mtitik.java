public class Mtitik{

    public static void main(String args[]) {
        Titik t1 = new Titik();
        t1.x = 3;
        t1.y = 4;
        System.out.println("  ("+ t1.x + ", " + t1.y + ")");

        // Fungsi getAbsis dan getOrdinat
        System.out.println("Titik Awal: (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        // Memanggil setAbsis dan setOrdinat
        t1.setAbsis(1);
        t1.setOrdinat(3);
        System.out.println("Titik Setelah Di-set: (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        // Mencari Jarak Pusat Titik
        t1.getJarakPusat();
        System.out.println("Jarak Titik : " + t1.getJarakPusat());

        // Refleksi Sumbu X
        t1.refleksiX();
        System.out.println("Refleksi sumbu X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        
        // Contoh pencerminan terhadap sumbu Y
        t1.refleksiY();
        System.out.println("Refleksi sumbu Y: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // Contoh mendapatkan titik hasil pencerminan terhadap sumbu X dan Y
        Titik refleksiX = t1.getRefleksiX();
        Titik refleksiY = t1.getRefleksiY();
        System.out.println("Titik hasil pencerminan terhadap sumbu X: (" + refleksiX.getAbsis() + ", " + refleksiX.getOrdinat() + ")");
        System.out.println("Titik hasil pencerminan terhadap sumbu Y: (" + refleksiY.getAbsis() + ", " + refleksiY.getOrdinat() + ")");


    }
}