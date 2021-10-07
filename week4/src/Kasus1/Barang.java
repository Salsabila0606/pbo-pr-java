package Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stk) { 
	kode_barang = kode;
	nama_barang = nama;
	tambahStok(stk);
	}
	
	public void tambahStok(int st) {
		this.stok = stok + st;
	}
	
	public int getStok() {
		return stok;
	}
}