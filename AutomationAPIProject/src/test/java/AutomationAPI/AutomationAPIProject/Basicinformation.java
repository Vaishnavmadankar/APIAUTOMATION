package AutomationAPI.AutomationAPIProject;

public class Basicinformation {
	
	private String Firstname;
	private String Lastname;
	private String Designation;
	private String id;
	private AddressInformation[] address;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AddressInformation[] getAddress() {
		return address;
	}
	public void setAddress(AddressInformation[] address) {
		this.address = address;
	}

}
