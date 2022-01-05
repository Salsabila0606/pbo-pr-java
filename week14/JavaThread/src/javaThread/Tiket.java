package javaThread;

public class Tiket {

	private int tiketTersedia = 20;

	public synchronized void pesan (String name, int jmlTiket) { //sychronized untuk sinkronasi objek saat dilakukan proses yg sama 
		if ((tiketTersedia >= jmlTiket) && (jmlTiket > 0)) {
			System.out.println("Selamat! Tiket atas nama " + name + " dengan jumlah tiket " + jmlTiket+ " berhasil dipesan!");
			tiketTersedia = tiketTersedia- jmlTiket;
		} else
			System.out.println("Maaf " + name + ", tiket sudah habis!");
	}
	
}
