package week3;

import java.util.Scanner;

public class bukatutupjalan {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int moa, mob, moc, mod;
		String gabung;
		long gabungan;
		
		moa = input.nextInt();
		mob = input.nextInt();
		moc = input.nextInt();
		mod = input.nextInt();
		gabung = String.valueOf(moa) + String.valueOf(mob) + String.valueOf(moc) + String.valueOf(mod);
		
		gabungan = Long.parseLong(gabung);								//convert string ke long
		
		if((gabungan - 999999) %5 ==0){
			System.out.println("Berhenti");
		}else{
			System.out.println("Jalan");
		}
		input.close();
	}
}
	
	
		

