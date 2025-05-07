package week8;

public class BangunDatar {
    protected int sisi;
    protected int panjang;
    protected int lebar;
    protected double alas;
    protected double tinggi;
    protected double radius;
    protected double luas;
    protected String stat;
    protected final double PHI = 3.14;

    // Konstruktor untuk persegi
    public BangunDatar(int sisi) {
        this.sisi = sisi;
        this.stat = "square";
    }

    // Konstruktor untuk persegi panjang
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.stat = "rectangle";
    }

    // Konstruktor untuk segitiga
    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.stat = "triangle";
    }

    // Konstruktor untuk lingkaran
    public BangunDatar(double radius) {
        this.radius = radius;
        this.stat = "circle";
    }

    // Metode untuk menghitung luas
    public void luas() {
        if (this.stat.equals("square")) {
            this.luas = this.sisi * this.sisi;
            System.out.println("Luas Persegi: " + this.luas);
        } else if (this.stat.equals("rectangle")) {
            this.luas = this.panjang * this.lebar;
            System.out.println("Luas Persegi Panjang: " + this.luas);
        } else if (this.stat.equals("triangle")) {
            this.luas = 0.5 * this.alas * this.tinggi;
            System.out.println("Luas Segitiga: " + this.luas);
        } else if (this.stat.equals("circle")) {
            this.luas = PHI * this.radius * this.radius;
            System.out.println("Luas Lingkaran: " + this.luas);
        } else {
            System.out.println("Tipe bangun datar tidak dikenal.");
        }
    }
}