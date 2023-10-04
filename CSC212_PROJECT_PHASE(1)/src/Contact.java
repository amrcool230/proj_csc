
public class Contact<T> implements Comparable<T> {
	private String nameC;
	private String emailAddress;
	private int PhoneNumber;
	private String address;
	private String birthday;
	private String notes;
	public Contact(String s) {
		this.nameC=s;
	}
	public Contact(int i) {
		this.PhoneNumber=i;
	}

	public Contact() { 
		
	}
	
	public Contact(String name, int phoneNumber, String emailAddress, String address, String birthday,
			String notes) {
		
		this.nameC = name;
		this.emailAddress = emailAddress;
		this.PhoneNumber = phoneNumber;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}

	

	public void display() {
		System.out.println("contact found");
		System.out.println("Name: "+nameC);
		System.out.println("EmailAddress "+emailAddress);
		System.out.println("PhoneNumber: "+PhoneNumber);
		System.out.println("address: "+address);
		System.out.println("birthday: "+birthday);
		System.out.println("notes: "+notes);
	}
	
	
	

	public int compareTo(Contact c) {

		return nameC.compareTo(c.nameC);

	}

	// public boolean isEmpty() {
	//
	// }

	public int compareTo(String s) {

		return nameC.compareTo(s);

	}

	public String getName() {
		return nameC;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public int getPhoneNumber() {
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
