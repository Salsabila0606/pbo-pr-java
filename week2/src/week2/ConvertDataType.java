package week2;

public class ConvertDataType
{
	 static short methodOne(long l){
		 int i = (int) l;							//int
		 return (short)i; 							//short
		 }	
	 
	 public static void main(String[] args){
		 double d = 10.25;							//double
		 float f = (float) d; 						//float
		 byte b = (byte) methodOne((long) f); 		//long & byte
		 System.out.println(b);
	 }
}