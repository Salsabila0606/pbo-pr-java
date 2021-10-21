package JavaAggregationComposition;

public class PersonalData {

	private String empId;
	private String firstName;
	private String lastName;
	private Address address;
	
	//composition
	public PersonalData() {
		address = new Address();
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + "]";
	}
}
