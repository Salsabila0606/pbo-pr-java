package GenericProgrammingLap;

import java.util.Arrays;

	class Person implements Comparable<Person> {

	  private String name;
	  private String address;

	  public Person(String name, String address) {
	    this.name = name;
	    this.address = address;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }

	  @Override
	  public int compareTo(Person o) {
	    return this.name.compareTo(o.name);
	  }

	  @Override
	  public String toString() {
	    return name + " dari kota " + address + "\n";
	  }
	}

	public class GenericInterface {
		
		  public static void main(String[] args) {
	
		    Person[] people = {
		        new Person("Salsa", "Cimahi"),
		        new Person("Putri", "Bandung"),
		        new Person("Prameswari", "Jakarta")
		    };
	
		    Arrays.sort(people);
	
		    System.out.println(Arrays.toString(people));
	
		  }
		}
