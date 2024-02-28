class Titik {

    private double x;
    private double y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getX() - titikAwal.getX(), 2) + Math.pow(titikAkhir.getY() - titikAwal.getY(), 2));
    }

    public double getGradien() {
        return (titikAkhir.getY() - titikAwal.getY()) / (titikAkhir.getX() - titikAwal.getX());
    }

    public Garis getRefleksiY() {
        return new Garis(new Titik(-titikAwal.getX(), titikAwal.getY()), new Titik(-titikAkhir.getX(), titikAkhir.getY()));
    }

    public boolean isTegakLurus(Garis g) {
        return Math.abs(this.getGradien() * g.getGradien()) == 1;
    }
}

