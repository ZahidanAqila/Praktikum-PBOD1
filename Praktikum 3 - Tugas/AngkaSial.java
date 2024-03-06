public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

//Baris 12 : Baris 12 tidak akan dieksekusi setelah eksepsi terjadi jika kondisi angka = 13. Ketika eksepsi AngkaSialException dilempar, eksekusi program akan langsung beralih ke blok catch pada metode main tanpa menyelesaikan eksekusi dari baris 12.
//Baris 21 : Baris 21 akan dieksekusi setelah eksepsi ditangkap di dalam blok catch. program akan mencetak pesan kesalahan dari eksepsi dan pesan peringatan, yang akan dieksekusi setelah eksepsi dilempar dan ditangkap.