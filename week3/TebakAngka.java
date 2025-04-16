package week3;
import java.util.Scanner;

class TebakAngka {
    public static void main(String[] aaa) {
        Scanner sc = new Scanner(System.in);
        Angka game = new Angka();
        
        System.out.println("=======================");
        System.out.println("    TEBAK ANGKA GAME   ");
        System.out.println("=======================");
        
        int tebakan;
        do {
            System.out.print("Masukkan angka: ");
            tebakan = sc.nextInt();

            System.out.println("Angka yang dimasukkan adalah " + tebakan);

            String hasil = game.cekAngka(tebakan);
            System.out.println(hasil);
        } while (!game.isTebakanBenar(tebakan));
    }
}