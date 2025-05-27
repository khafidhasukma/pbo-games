package abstrak;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Truk trukku = new Truk();
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Truk");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan merk mobil: ");
            String merk = sc.nextLine();
            mobilku.setMerk(merk);

            System.out.print("Masukkan jumlah roda untuk mobil: ");
            int jumlahRoda = sc.nextInt();
            mobilku.setJumlahRoda(jumlahRoda);

            System.out.println("Merk mobil: " + mobilku.getMerk());
            System.out.println("Jumlah roda mobil: " + mobilku.getJumlahRoda());

            mobilku.nyalakan();
        } else if (pilihan == 2) {
            System.out.print("Masukkan merk truk: ");
            String merk = sc.nextLine();
            trukku.setMerk(merk);

            System.out.print("Masukkan jumlah roda untuk truk: ");
            int jumlahRoda = sc.nextInt();
            trukku.setJumlahRoda(jumlahRoda);

            System.out.println("Merk truk: " + trukku.getMerk());
            System.out.println("Jumlah roda truk: " + trukku.getJumlahRoda());
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        sc.close();
    }
}