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
			int u = kb.nextInt();
			System.out.println("Enter your choice : ");
			if(u==1) {
				
				e1.addContact();
	
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
					e1.SearchbyPhone(kb.next());
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
				e1.deletecontact();
			}
				
			else if(u==4) { 
				
			}
				
			//else if(u==5)
				
			//else if(u==6)
				 
			//else if(u==7)
				
			//else if(u==8)
			//	x=false;
		}
		
		
	}
}
