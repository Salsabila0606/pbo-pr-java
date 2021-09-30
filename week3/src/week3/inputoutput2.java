package week3;

import java.util.Scanner;

public class inputoutput2 {
        
	public static void main(String[] args) {
		
        String[] inString = new String[3];				//array string indeks 3
		int[] inInt = new int[3];						//array integer indeks 3

        Scanner input = new Scanner(System.in);				//scan
 
        for(int i=0; i<3; i++) {
            inString[i] = input.next();						//isi array
            inInt[i] = input.nextInt();
        }

        System.out.printf("================================%n");
        System.out.printf("%-15s%03d%n", inString[0], inInt[0]);		//print 
        System.out.printf("%-15s%03d%n", inString[1], inInt[1]);
        System.out.printf("%-15s%03d%n", inString[2], inInt[2]);
        System.out.printf("================================%n");
        
        input.close();
    }
}