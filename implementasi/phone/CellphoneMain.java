package implementasi.phone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();

        while (cp.status == 1) {
            try {
                System.out.println("\n=== MENU HP ===");
                System.out.println("1. Lihat Kontak");
                System.out.println("2. Tambah Kontak");
                System.out.println("3. Hapus Kontak");
                System.out.println("4. Cari Kontak");
                System.out.println("5. Cek Pulsa");
                System.out.println("6. Top Up Pulsa");
                System.out.println("7. Telepon");
                System.out.println("8. Beli Paket Internet");
                System.out.println("9. Info HP");
                System.out.println("10. Cek Baterai");
                System.out.println("11. Naikkan Volume");
                System.out.println("12. Turunkan Volume");
                System.out.println("13. Cek Volume");
                System.out.println("0. Matikan HP");
                System.out.print("Pilih menu: ");

                int pilihan = input.nextInt();
                input.nextLine(); // clear buffer

                switch (pilihan) {
                    case 1:
                        cp.listContact();
                        break;
                    case 2:
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan nomor: ");
                        String nomor = input.nextLine();
                        cp.insertContact(nama, nomor);
                        break;
                    case 3:
                        System.out.print("Masukkan nama kontak yang ingin dihapus: ");
                        String hapus = input.nextLine();
                        cp.hapusContact(hapus);
                        break;
                    case 4:
                        System.out.print("Masukkan nama kontak yang dicari: ");
                        String cari = input.nextLine();
                        cp.getContact(cari);
                        break;
                    case 5:
                        System.out.println("Sisa pulsa: " + cp.getBalance());
                        break;
                    case 6:
                        System.out.print("Masukkan jumlah pulsa: ");
                        int jumlah = input.nextInt();
                        input.nextLine(); // clear buffer
                        cp.topUpBalance(jumlah);
                        break;
                    case 7:
                        System.out.print("Masukkan nama kontak yang ingin ditelepon: ");
                        String tujuan = input.nextLine();
                        cp.getContact(tujuan);
                        cp.kurangiPulsa(5000);
                        System.out.println("Sedang menelepon " + tujuan + "...");
                        break;
                    case 8:
                      System.out.print("Beli paket internet 10.000? (y/n): ");
                      String konfirmasi = input.nextLine().trim().toLowerCase();
                      if (konfirmasi.equals("y")) {
                          cp.kurangiPulsa(10000);
                          System.out.println("Paket berhasil dibeli.");
                      } else if (konfirmasi.equals("n")) {
                          System.out.println("Pembelian paket dibatalkan.");
                      } else {
                          throw new IllegalArgumentException("Input harus 'y' atau 'n' saja!");
                      }
                      break;
                    case 9:
                        cp.phoneInfo();
                        break;
                    case 10:
                        cp.getBatteryLevel();
                        break;
                    case 11:
                        cp.volumeUp();
                        System.out.println("Volume sekarang: " + cp.getVolume());
                        break;
                    case 12:
                        cp.volumeDown();
                        System.out.println("Volume sekarang: " + cp.getVolume());
                        break;
                    case 13:
                        System.out.println("Volume saat ini: " + cp.getVolume());
                        break;
                    case 0:
                        cp.powerOff();
                        break;
                    default:
                        System.out.println("Menu tidak tersedia.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harus berupa angka.");
                input.nextLine(); // bersihkan input yang salah
            } catch (PulsaHabisException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("HP dimatikan. Terima kasih.");
        input.close();
    }
}
