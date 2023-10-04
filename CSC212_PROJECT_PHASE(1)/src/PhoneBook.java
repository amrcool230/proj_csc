import java.util.Scanner;

public class PhoneBook {
	
	private LinkedList_ADT<Contact> contact ; 
	private LinkedList_ADT<Event> events;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String [] args) { 
		LinkedList_ADT e1 = new  LinkedList_ADT();
		Scanner kb = new Scanner(System.in);
		boolean x= true;
		
		
		while (x) { 
			System.out.println("Welcome to the Linked Tree Phonebook!\r\n"
								+ "Please choose an option:\r\n"
								+ "1. Add a contact\r\n"
								+ "2. Search for a contact\r\n"
								+ "3. Delete a contact\r\n"
								+ "4. Schedule an event\r\n"
								+ "5. Print event details\r\n"
								+ "6. Print contacts by first name\r\n"
								+ "7. Print all events alphabetically\r\n"
								+ "8. Exit");
			System.out.println("Enter your choice : ");
			int u = kb.nextInt();
			
			if(u==1) {
				System.out.println("Enter the Contact's Name : ");
				String s1 = kb.next();
				System.out.println("Enter the Contact's Phone number: : ");
				int s2 = kb.nextInt();
				System.out.println("Enter the Contact's Email address : ");
				String s3 = kb.next();
				System.out.println("Enter the Contact's Address: : ");
				String s4 = kb.next();
				System.out.println("Enter the Contact's Birthday : ");
				String s5 = kb.next();
				System.out.println("Enter any notes : ");
				String s6 = kb.next();
				Contact c1=new Contact(s1,s2,s3,s4,s5,s6);
				e1.add(c1);
				
				
				
				
	
			}
				
			else if(u==2) { 
				System.out.println("Enter search criteria");
				System.out.println("1. Name\r\n"
						+ "2. Phone Number\r\n"
						+ "3. Email Address\r\n"
						+ "4. Address\r\n"
						+ "5. Birthday");
				int i = kb.nextInt();
				 while(i>5 && i<1 ) {
					System.out.println("wrong input,try again");
					  i = kb.nextInt();
				 }
					 switch(i) { 
				case 1 : 
					System.out.println("Enter contact's Name");
					e1.SearchbyName(kb.next());
					break;
				case 2 : 
					System.out.println("Enter contact's PhoneNumber");
					int ss=kb.nextInt();
					e1.SearchbyPhone(ss);
					break;
				case 3 : 
					System.out.println("Enter contact's Email address");
					e1.SearchbyEmailaddress(kb.next());
					break;
				case 4 : 
					System.out.println("Enter contact's Address");
					e1.SearchbyAddress(kb.next());
					break;
				case 5 : 
					System.out.println("Enter contact's Birthday");
					e1.SearchbyBirthday(kb.next());
					break;
					
				} 
			}				
			else if(u==3) { 
				System.out.println("Choose how to delete:");
				System.out.println("1-By Name:");
				System.out.println("2-By PhoneNumber:");
			int i=kb.nextInt();
			while(i>2 && i<1 ) {
				System.out.println("Wrong input!");
			}
			if(i==1) {
				System.out.println("Enter contact's Name:");
			 String s=kb.next();
				e1.delete(new Contact(s));
			}
			else {
				System.out.println("Enter contact PhoneNumber:");
				int ii=kb.nextInt();
				
				e1.delete(new Contact(ii));
			}
			}
				
			else if(u==4) { 
				
				System.out.println("Enter the Event's Title : ");
				String s1 = kb.next();
				System.out.println("Enter the Event's Name : ");
				String s2 = kb.next();
				System.out.println("Enter the Event's Date : ");
				String s3 = kb.next();
				System.out.println("Enter the Event's Location : : ");
				String s4 = kb.next();
				
				Event e = new Event(s1,s2,s3,s4);
				e1.add(e);
				
			}
				
			else if(u==5) { 
				System.out.println("Enter the Event's Title : ");
				String s1 = kb.next();
				System.out.println("Enter the Event's Name : ");
				String s2 = kb.next();
				System.out.println("Enter the Event's Date : ");
				String s3 = kb.next();
				System.out.println("Enter the Event's Location : : ");
				String s4 = kb.next();
				e1.printEventDetails(kb);
			}
				
			else if(u==6) { 
				e1.ContactsByFirstName(kb.nextLine());
			}
				 
			else if(u==7) { 
				System.out.println("GOODBYE");
			}
				
			else if(u==8) {
				System.out.println("GOODBYE");

				x=false;
			}
			
		}
		
		
	}
}
