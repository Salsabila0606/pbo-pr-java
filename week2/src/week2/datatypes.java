package week2;

import java.util.Scanner; //paket Scanner

	public class datatypes {
		
		public static void main(String []argh) {
			
	        Scanner input = new Scanner(System.in);
	        
	        int T = input.nextInt();
	        
	        for(int i = 0; i < T; i++) {
	            	
	        	try {
	        		
	        		long N = input.nextLong();
	                  System.out.println(N+ "can be fitted in :");
	                  
	                  if (N>=Byte.MIN_VALUE && N<=Byte.MAX_VALUE) {
	                	  System.out.println(" * byte");
	                  }
	                	  
	                  if(N>=Short.MIN_VALUE && N<=Short.MAX_VALUE){
	                	  System.out.println(" * short");
	                  }
	                	  
	                  if(N>=Integer.MIN_VALUE && N<=Integer.MAX_VALUE) {
	                	  System.out.println(" * int");
	                  }
	                	 
	                  if(N>=Long.MIN_VALUE && N<=Long.MAX_VALUE) {
	                	  System.out.println(" * long");
	                  }
	        		}
	        	
	                   catch(Exception e) {
	                	  System.out.println(input.next()+ "can't be fitted anywhere");
	                  }			
	        	}	
	        input.close(); //warning! close Scanner
		}
}