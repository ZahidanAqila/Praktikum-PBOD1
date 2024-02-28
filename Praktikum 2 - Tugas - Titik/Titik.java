 public class Titik {
    public double x,y;
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void refleksiX() {
        this.y = -this.y;
    }

    public void refleksiY() {
        this.x = -this.x;
    }

    public Titik getRefleksiX() {
        Titik refleksiX = new Titik();
        refleksiX.x = this.x;
        refleksiX.y = -this.y;
        return refleksiX;
    }

    public Titik getRefleksiY() {
        Titik refleksiY = new Titik();
        refleksiY.x = -this.x;
        refleksiY.y = this.y;
        return refleksiY;
    }


    public static void main(String args[]) {
        Titik t1 = new Titik();
        t1.x = 3;
        t1.y = 4;
        System.out.println("Titik("+ t1.x + ", " + t1.y + ")");
    }
}   


