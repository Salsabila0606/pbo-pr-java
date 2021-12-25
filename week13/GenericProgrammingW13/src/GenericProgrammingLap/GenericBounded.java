package GenericProgrammingLap;

public class GenericBounded {
	   
	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;
	      
	      if(y.compareTo(max) > 0) {
	         max = y;
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;                
	      }
	      return max;
	   }
	   
	   public static void main(String args[]) {
	      System.out.printf("Nilai Tertinggi of %d, %d, dan %d = %d\n\n", 102, 728, 101, maximum( 102, 728, 101 ));

	      System.out.printf("Nilai Tertinggi of %.1f ,%.1f, dan %.1f = %.1f\n\n", 28.5, 84.8, 72.7, maximum( 28.5, 84.8, 72.7 ));

	      System.out.printf("Nilai Tertinggi of %s, %s dan %s = %s\n","bawang merah", "bawang putih", "kemiri", maximum("bawang merah", "bawang putih", "kemiri"));
	   }
	}