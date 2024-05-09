class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu {
    void gerak() {
        System.out.println("kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("kupu terbang");
    }
}

class Data<T extends Kupu> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

