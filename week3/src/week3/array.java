package week3;

public class array {
	
	 public static void main(String[] args) {
		 
	 //One Dimensional Arrays
	 int[] fisrtArray = {2, 5, 3}; 
	 int[] secondArray = {9, 5, 3}; 
	 int[] thirdArray = {2, 4, 9}; 
	 int[] fourthArray = {10, 11, 12}; 
	 int[] fifthArray = {13, 14, 15}; 
	 int[] sixthArray = {16, 17, 18}; 
	 int[] seventhArray = {19, 20, 21}; 
	 int[] eighthArray = {22, 23, 24}; 
	 int[] ninthArray = {25, 26, 27}; 
	 //Two Dimensional Arrays
	 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, 
	thirdArray}; 
	 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
	sixthArray};
	 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, 
	ninthArray};
	 //Three Dimensional Array
	 int[][][] threeDimensionalArray = {twoDimensionalArray1, 
	twoDimensionalArray2, twoDimensionalArray3};
	 
	 //output
	 for(int i = 0; i < threeDimensionalArray.length; i++) {
			System.out.print("{");
			for(int j = 0; j < threeDimensionalArray.length; j++) {
				System.out.printf("{");
				for(int k = 0; k < threeDimensionalArray.length; k++) {
					System.out.printf("" + threeDimensionalArray[i][j][k] + " ");
				}
				System.out.printf("} ");
			}
			System.out.println("} ");
		}
	 }
}
