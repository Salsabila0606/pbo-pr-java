package no3;

public class OperasiPembagian {
	
	public static void main (String[] args) {
	try {
		int angka = 7;
		int hasil = angka/0;
		System.out.println(hasil);
	} catch (ArithmeticException ex) {
		System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
	}
 }
}
