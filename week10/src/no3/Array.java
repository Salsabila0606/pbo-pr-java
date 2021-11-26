package no3;

public class Array {
	
	public static void main (String[] args) {
		try {
			int[] siswa = new int[2];
			siswa[0] = 1;
			siswa[1] = 2;
			siswa[2] = 3;
			System.out.println(siswa[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
		}
	}
}
