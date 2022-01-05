package javaThread;

public class TiketThread extends Thread {

	private Tiket tiket;
	private String name;
	private int noTiket;

	public TiketThread(Tiket tiket ,String name, int noTiket) {
		this.tiket = tiket;
		this.name = name;
		this.noTiket = noTiket;
	}
	
	public void run() {
		tiket.pesan (name, noTiket);
	}
}
