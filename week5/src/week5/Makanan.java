package week5;

public class Makanan {
	
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Makanan(String namaMakanan, double hargaMakanan, int stokMakanan) {
		this.nama_makanan = namaMakanan;
		this.harga_makanan = hargaMakanan;
		this.stok = stokMakanan;
	}

	//Encapsulation
	public String getNama_makanan() {
		return nama_makanan;
	}

	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public double getHarga_makanan() {
		return harga_makanan;
	}

	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}

	public void pMakanan() {
		System.out.println(nama_makanan + "[" + stok + "]" + "=" + harga_makanan);
	}
	
	//Stok berkurang
	public void berkurang (int jml) {
		stok -= jml;
	}

	
}
