package week8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangunDatar bangunDatar;
        
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Exit");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = sc.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                int sisi = sc.nextInt();
                bangunDatar = new BangunDatar(sisi);
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                int panjang = sc.nextInt();
                System.out.print("Masukkan lebar persegi panjang: ");
                int lebar = sc.nextInt();
                bangunDatar = new BangunDatar(panjang, lebar);
                break;
            case 3:
                System.out.print("Masukkan alas segitiga: ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = sc.nextDouble();
                bangunDatar = new BangunDatar(alas, tinggi);
                break;
            case 4:
                System.out.print("Masukkan radius lingkaran: ");
                double radius = sc.nextDouble();
                bangunDatar = new BangunDatar(radius);
                break;
            case 5:
                System.out.println("Keluar dari program.");
                sc.close();
                return;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        
        bangunDatar.luas();
    }
}