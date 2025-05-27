package eksepsi;
import java.io.*;

public class CheckingAccount {
	private double saldo;
	private int rekening;
	
	public CheckingAccount(int rekening) {
		this.rekening = rekening;
	}
	
	public void simpanUang(double jumlahsetor) {
		saldo += jumlahsetor;
	}
	
	public void tarikUang(double jumlahtarik) throws InsufficientFundsException
	{
		if(jumlahtarik <= saldo) 
		{
			saldo -= jumlahtarik;
		}
		else
		{
			double kebutuhan = jumlahtarik - saldo;
			throw new InsufficientFundsException(kebutuhan);
		}
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public int getAngka()
	{
		return rekening;
	}

	public void cetakPecahanUang(double jumlah) {
    int sisa = (int) jumlah;
    int seratus = sisa / 100000;
    sisa %= 100000;

    int limaPuluh = sisa / 50000;
    sisa %= 50000;

    int duaPuluh = sisa / 20000;
    sisa %= 20000;

    System.out.println("Uang Anda terdiri dari:");
    if (seratus > 0) System.out.println(seratus + " lembar Rp 100.000");
    if (limaPuluh > 0) System.out.println(limaPuluh + " lembar Rp 50.000");
    if (duaPuluh > 0) System.out.println(duaPuluh + " lembar Rp 20.000");
	}

	public void prosesPenarikan(double jumlah) {
    try {
        tarikUang(jumlah);
        System.out.println("Penarikan berhasil.");
        cetakPecahanUang(jumlah);
    } catch (InsufficientFundsException e) {
        System.out.println("Maaf saldo yang akan Anda ambil kurang Rp " + e.getAmount() + " dari total permintaan Anda");
    }
	}
}