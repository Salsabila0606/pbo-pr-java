package week3;

import java.util.Scanner;

public class gajiagent {
	
	public static void main(String[] args) {
		
//		agent = 500rb
//				+ 25% total jika minim 40 item
//				+ 35% total jika diatas 80
//				- 15 % jika dibawah 15 total minus penjualan
//				x bonus 10% /item
//				item 50k
				
		final int gaji_pokok = 500000, harga_item = 50000;
		int item_terjual;
		int gaji_diterima;
		
		Scanner input = new Scanner(System.in);
		item_terjual = input.nextInt();
		
		if (item_terjual > 80) {
			gaji_diterima = (int)(gaji_pokok + ((item_terjual * harga_item)*0.35));
			System.out.println(gaji_diterima);
		} else if (item_terjual >= 40 && item_terjual < 80) {
			gaji_diterima = (int)(gaji_pokok + ((item_terjual * harga_item)*0.25));
			System.out.println(gaji_diterima);
		} else if (item_terjual <= 15 && item_terjual > 0) {
			gaji_diterima = (int)(gaji_pokok - (((15 - item_terjual)*harga_item)*0.15));
			System.out.println(gaji_diterima);
		} else {
			gaji_diterima = (int)(gaji_pokok + (item_terjual * harga_item * 0.10));
			System.out.println(gaji_diterima);
		}
		input.close();
	}
	
}
