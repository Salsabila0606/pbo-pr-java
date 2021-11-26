package no3;

import java.io.File;
import java.util.Scanner;

public class OperasiFile {

	public static void main (String[] args) {
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occured.");
		}
	}
	
}
