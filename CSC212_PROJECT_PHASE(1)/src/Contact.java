
public class Contact<T> implements Comparable<T> {
	private String name;
	private String emailAddress;
	private String PhoneNumber;
	private String address;
	private String birthday;
	private String notes;

	public Contact() { 
		
	}
	
	public Contact(String name, String emailAddress, String phoneNumber, String address, String birthday,
			String notes) {
		
		this.name = name;
		this.emailAddress = emailAddress;
		PhoneNumber = phoneNumber;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}

	

	public void display() {
		System.out.println("contact found");
		System.out.println("Name: "+name);
		System.out.println("EmailAddress "+emailAddress);
		System.out.println("PhoneNumber: "+PhoneNumber);
		System.out.println("address: "+address);
		System.out.println("birthday: "+birthday);
		System.out.println("notes: "+notes);
	}
	
	
	

	public int compareTo(Contact c) {

		return name.compareTo(c.name);

	}

	// public boolean isEmpty() {
	//
	// }

	public int compareTo(String s) {

		return name.compareTo(s);

	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getNotes() {
		return notes;
	}



	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
