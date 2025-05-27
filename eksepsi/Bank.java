package eksepsi;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Bank {

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(101);
        Scanner sc = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Setor Uang");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            try {
                pilihan = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine(); // membersihkan buffer
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah yang akan disetor: ");
                    try {
                        double setor = sc.nextDouble();
                        ca.simpanUang(setor);
                        System.out.println("Saldo berhasil ditambah.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang akan ditarik: ");
                    try {
                        double tarik = sc.nextDouble();

                        if (tarik < 20000) {
                            System.out.println("Penarikan minimal adalah Rp 20.000!");
                            break;
                        }

                        if (tarik % 10000 != 0) {
                            System.out.println("Penarikan harus kelipatan Rp 10.000!");
                            break;
                        }

                        ca.prosesPenarikan(tarik);

                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Saldo Anda saat ini: Rp " + ca.getSaldo());
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}