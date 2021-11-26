package no3;

import java.util.Scanner;

public class TextField {

	public static void main (String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input : ");
			int i = sc.nextInt();
			System.out.println("Nilai Input adalah : " + i);
			sc.close();
		} catch (Exception i) {
			System.out.println("Nilai input error : " + i);
		}
	}
	
}
