package week3;

import java.util.Scanner;
import java.math.*;

public class bignumber {
	
	    public static void main(String[] args) {
	    	
	    	int a,b, digit_a, digit_b;
	        Scanner input = new Scanner(System.in);
	        a = input.nextInt();
	        b = input.nextInt();
	        	
	        digit_a = jumlahDigit(a);								//hitung digit
	        digit_b = jumlahDigit(b);
	        
	        if ((digit_a > 0 && digit_a <= 200 && digit_b > 0 && digit_b <= 200)) {			// 0 < a,b <= 200
	        	BigInteger A = BigInteger.valueOf(a);										//convert int ke BigInteger
		        BigInteger B = BigInteger.valueOf(b);
		        System.out.println(A.add(B));												//	tambah
	        	System.out.println(A.multiply(B));											//	kali
			 }     
	        
	       input.close();
	    }
	    
	    public static int jumlahDigit (int angka) {											//hitung digit angka
																							// https://www.okedroid.com/2018/04/contoh-program-menghitung-jumlah-digit-angka-integer-java.html
			int jumlah = 0;
			
			while (angka != 0) {
				angka = angka / 10;
				jumlah++;
			}
			return jumlah;
		}
}
