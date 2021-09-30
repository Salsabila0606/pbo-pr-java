package week3;

import java.util.Scanner;		//method untuk scanner

public class inputoutput {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);					//scan
		String s = input.nextLine();								//string s
		input.close();											//close scan
		
		//code cari token
		if (s.length() == 0) {									//s length = 0 maka print 0
			System.out.println(0);								
		} else {
			String[] n = s.trim().split("['!?,._@ ]+");			//cari token
			int size = n.length;								//jumlah token
			System.out.println(size);							//print int untuk token (baris paling atas)
			
			for(int i=0; i<size; i++){
	            System.out.println(n[i]);						//print sesuai token (baris kedua - akhir)
	        }     
		
	}
	}
}
