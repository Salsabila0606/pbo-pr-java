package JavaAggregationComposition;

public class MainProgram {

	public static void main(String[] args) {
		aggregationDemo();
		//compositionDemo();
	}

	@SuppressWarnings("unused")
	private static void compositionDemo() {
		PersonalData person = new PersonalData();
		
		person.setEmpId("001");
		person.setFirstName("Salsa");
		person.setLastName("Jean");
		person.getAddress().setCity("Cimahi");
		person.getAddress().setAddressLine1("address Line1");
		person.getAddress().setAddressLine2("address Line2");
		person.getAddress().setStreet("Komplek Dustira");
		
		System.out.println(person);
		person = null;
		System.out.println("------------------------------------------");
		System.out.println(person);
		if(person !=null)
		System.out.println(person.getAddress());
		else
			System.out.println("Address does not exist..");
		
		
		
	}

	private static void aggregationDemo() {
		Address address = new Address();
		address.setAddressLine1("address Line1");
		address.setAddressLine2("address Line2");
		address.setCity("Cimahi");
		address.setStreet("Komplek Dustira");
		
		Employee employee = new Employee();
		employee.setAddress(address);
		employee.setAge(30);
		employee.setFirstName("Salsa");
		employee.setLastName("Jean");
		
		System.out.println(employee);
		employee = null;
		System.out.println("-------------------------------------------");
		System.out.println(employee);
		System.out.println(address);
	}
}