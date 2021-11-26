package no2;

import java.util.Scanner;

public class main {
	   
	public static int hexdec(String s) {
	      return Integer.parseInt(s, 16);
	   }
	
	   public static void main (String args[]) {
		  try {
			  String hex;
		      int dec;
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Input bilangan hexadesimal: ");
		      hex = sc.nextLine();
		      dec = hexdec (hex);
		      System.out.print("Bilangan desimal: " + dec + "\n");
		      sc.close();
		  }
	      catch (Exception e) {
	    	  System.out.println("Input harus hexadesimal");
	      }
	   }
	}