package GenericProgrammingLap;

import java.util. * ;

public class GenericWildcard {
	
  public static void main(String[] args) {
	 
    List < Integer > intList = Arrays.asList(1, 2, 3, 4);

    printOnlyIntegerClassorSuperClass(intList);

    List < Number > numberList = Arrays.asList(1, 2, 3, 4);

    printOnlyIntegerClassorSuperClass(numberList);
  }
  
  public static void printOnlyIntegerClassorSuperClass(List < ?super Integer > list) {
    System.out.println(list);
  }
}