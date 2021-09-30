package week3;

import java.util.Scanner;

public class berhitung {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);				//inisialisasi
		int A, B = 0;
		int hasil ;
		String operator;
		
		A = input.nextInt();								//scan
		operator = input.next();
		B = input.nextInt();
		
		if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {			//1 ≤ A, B ≤ 1.000
			
			switch (operator){										//switch case string
			
				case "+" : 
					hasil = A + B;
					System.out.println(hasil);
					break; 
				case "-" : 
					hasil = A - B;
					System.out.println(hasil);
					break; 
		       	case "*" : 
		       		hasil = A * B;
		       		System.out.println(hasil);
		       		break;
		       	case "/" : 
		       		hasil = A / B;
		       		System.out.println(hasil);
		       		break;
		       	case "%" : 
		       		hasil = A % B;
		       		System.out.println(hasil);
		       		break;
		       	default : System.out.println(" - ");
		       	}
			
					} else {
					  System.out.println("Batasan input 1 ≤ A, B ≤ 1.000"); 
				    }
			input.close();
		}	
}