public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        // Menyimpan objek Ulat
        anu.setIsi(K);
        anu.getIsi().gerak();

        // Menyimpan objek Kepompong
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        // Menyimpan objek KupuDewasa
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
