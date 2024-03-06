class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "Jari-jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

// Kurang tepat terkait dengan tindakan jika Asersi Gagal: Ketika asersi gagal (ketika `jariJari` adalah 0), program akan melempar `AssertionError`. Namun, program tidak memiliki mekanisme untuk menangani atau memberikan tanggapan yang sesuai terhadap kegagalan asersi.