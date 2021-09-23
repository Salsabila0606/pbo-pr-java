package week2;

import java.util.Scanner; //paket Scanner

public class strings {
	
	public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String A = word.next();
        String B = word.next();
        word.close();
        	
        System.out.println( A.length() + B.length() );							//length
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");				//compare
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +			//kapital
            B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}
