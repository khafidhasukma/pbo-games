package week3;
import java.util.Random;

class Angka {
    private int angka;

    // angka
    public Angka() {
        Random r = new Random();
        this.angka = r.nextInt(10);
    }

    // cek angka
    public String cekAngka(int tebakan) {
        if (tebakan < angka) {
            return "Angka yang dimasukkan terlalu kecil";
        } else if (tebakan > angka) {
            return "Angka yang dimasukkan terlalu besar";
        } else {
            return "Selamat, angka yang dimasukkan benar";
        }
    }

    // is tebakan benar
    public boolean isTebakanBenar(int tebakan) {
        return tebakan == angka;
    }
}