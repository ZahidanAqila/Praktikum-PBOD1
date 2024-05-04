class KontrolSenjata {
    Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        if (isAdaPeluru()) {
            System.out.println(">> Siap menembak " + jumlah + " kali");
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                    break;
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }
}
