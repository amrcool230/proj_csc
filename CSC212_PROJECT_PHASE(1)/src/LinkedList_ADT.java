import java.util.Scanner;

public class LinkedList_ADT<T> {
	private Node head;
	private Node current;

	public LinkedList_ADT() {
		head = null;
		current = null;
	}

	public void findfirst() {
		current = head;
	}

	public void findnext() {
		current = current.next;
	}

	public boolean full() {
		return false;
	}

	public void SearchbyName(String s) {

		current = head;
		while (current != null) {
			if (((Contact) current.data).getName().equalsIgnoreCase(s)) {
				((Contact) current.data).display();
				return;
			} else
				current = current.next;
		}
		System.out.println("This contact is Not Found!");

	}

	public LinkedList_ADT<T> SearchbyAddress(String s) {
		LinkedList_ADT<T> tmp = new LinkedList_ADT<T>();

		tmp.current = tmp.head;

		current = head;

		while (current != null) {

			if (((Contact) current.data).getAddress().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact) current.data).display();
				tmp.current.data = current.data;
				tmp.current = tmp.current.next;
			} else
				current = current.next;
		}

		if (tmp.head == null)
			System.out.println("This contact is Not Found!");
		else
			return tmp;

		return null;
	}

	public LinkedList_ADT<T> SearchbyBirthday(String s) {
		LinkedList_ADT<T> tmp = new LinkedList_ADT<T>();

		tmp.current = tmp.head;

		current = head;

		while (current != null) {

			if (((Contact) current.data).getBirthday().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact) current.data).display();
				tmp.current.data = current.data;
				tmp.current = tmp.current.next;
			} else
				current = current.next;
		}

		if (tmp.head == null)
			System.out.println("This contact is Not Found!");
		else
			return tmp;

		return null;

	}

	public void SearchbyPhone(String s) {

		current = head;
		while (current != null) {
			if (((Contact) current.data).getPhoneNumber().equals(s)) {
				((Contact) current.data).display();
				return;
			} else
				current = current.next;
		}
		System.out.println("This contact is Not Found!");

	}

	public LinkedList_ADT<T> SearchbyEmailaddress(String s) {
		LinkedList_ADT<T> tmp = new LinkedList_ADT<T>();

		tmp.current = tmp.head;

		current = head;

		while (current != null) {

			if (((Contact) current.data).getEmailAddress().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact) current.data).display();
				tmp.current.data = current.data;
				tmp.current = tmp.current.next;
			} else
				current = current.next;
		}

		if (tmp.head == null)
			System.out.println("This contact is Not Found!");
		else
			return tmp;

		return null;
	}

	public void sort() {

	}

	public boolean empty() {
		return head == null;
	}
	/*
	 * public void addContact() { Scanner kb = new Scanner(System.in);
	 * System.out.println("Enter the Contact's Name : "); String s1 = kb.next();
	 * System.out.println("Enter the Contact's Phone number: : "); String s2 =
	 * kb.next(); System.out.println("Enter the Contact's Email address : "); String
	 * s3 = kb.next(); System.out.println("Enter the Contact's Address: : "); String
	 * s4 = kb.next(); System.out.println("Enter the Contact's Birthday : "); String
	 * s5 = kb.next(); System.out.println("Enter any notes : "); String s6 =
	 * kb.next();
	 * 
	 * Contact<T> e = new Contact<T>(s1, s2, s3, s4, s5, s6); Node<T> ComparePointer
	 * = head; // this temporairly ComparePointer is a pointer we are using it
	 * instead of using // the current so we keep adding // after the current
	 * 
	 * while (ComparePointer != null) { if (((Contact)
	 * ComparePointer.data).getAddress().equals(e.getAddress()) && ((Contact)
	 * ComparePointer.data).getEmailAddress().equals(e.getEmailAddress()) &&
	 * ((Contact) ComparePointer.data).getPhoneNumber().equals(e.getPhoneNumber()))
	 * { System.out.println("This contact is already entered!"); break; }
	 * ComparePointer = ComparePointer.next; }
	 * 
	 * Node<T> temp; if (empty()) current = head = new Node((Contact<T>) e);
	 * 
	 * temp = current.next; current.next = new Node((Contact<T>) e); current =
	 * current.next; current.next = temp;
	 * 
	 * System.out.println("contact successuflly added!!"); }
	 **/

	public void delete(T t) {
		if (empty()) {
			System.out.println("The list is empty!");
			return;}
		
			
	
		
		else {
			
		 if (t instanceof Contact) { 
			 
			 Node<Contact> current=head ; 
			 
			 while(current!=null) {
		if (current.next.data.equals(t)) {
			current = current.next.next;
			System.out.println("Contact deleted.");}
		else if (current.next==null) {
			System.out.println("Contact not found!");}
			 }
	
		 }else  {
			 Node<Event> current=head;
			 while(current!=null) {
					if (current.next.data.equals(t)) {
						current = current.next.next;
						System.out.println("Event deleted.");}
					else if (current.next==null) {
						System.out.println("Event not found!");}
			 
		 }
	
		
		 }}}

	/*
	 * public void ScheduleanEvent() {
	 * 
	 * Scanner input= new Scanner(System.in);
	 * System.out.println("Enter event title"); String s1=input.next();
	 * System.out.println("Enter contact name:"); String s2=input.next();
	 * System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):"); String
	 * s3=input.next(); System.out.println("Enter event location:"); String
	 * s4=input.next();
	 * 
	 * 
	 * Node<T> ComparePointer = head; while (ComparePointer != null) { if
	 * (ComparePointer.data.getName().equals(s1)) { Event<T> e = new Event<T>(s1,
	 * s2, s3, s4);
	 * 
	 * 
	 * } ComparePointer = ComparePointer.next;}
	 **/

	public boolean isConflict(String DateTime) {
		while (current != null) {
			if (((Event) (current.data)).getTime().equalsIgnoreCase(DateTime))
				return true;

			findnext();
		}
		return false;

	}

	public boolean add(T t) {
		if (t instanceof Contact) {

			Scanner kb = new Scanner(System.in);
			System.out.println("Enter the Contact's Name : ");
			String s1 = kb.next();
			System.out.println("Enter the Contact's Phone number: : ");
			String s2 = kb.next();
			System.out.println("Enter the Contact's Email address : ");
			String s3 = kb.next();
			System.out.println("Enter the Contact's Address: : ");
			String s4 = kb.next();
			System.out.println("Enter the Contact's Birthday : ");
			String s5 = kb.next();
			System.out.println("Enter any notes : ");
			String s6 = kb.next();

			Contact<T> e = new Contact<T>(s1, s2, s3, s4, s5, s6);
			Node<T> ComparePointer = head;
			// this temporairly ComparePointer is a pointer we are using it instead of using
			// the current so we keep adding
			// after the current

			while (ComparePointer != null) {
				if (((Contact) ComparePointer.data).getAddress().equals(e.getAddress())
						&& ((Contact) ComparePointer.data).getEmailAddress().equals(e.getEmailAddress())
						&& ((Contact) ComparePointer.data).getPhoneNumber().equals(e.getPhoneNumber())) {
					System.out.println("This contact is already entered!");
					break;
				}
				ComparePointer = ComparePointer.next;
			}

			Node<T> temp;

			if (empty())
				current = head = new Node((Contact<T>) e);
			else {
				temp = current.next;
				current.next = new Node((Contact<T>) e);
				current = current.next;
				current.next = temp;

				System.out.println("contact successuflly added!!");
				return true;
			}
		} else {
			Node<T> newNode = new Node(t);

			if (empty()) {
				head = current = newNode;
			} else {
				current = head;
				Node<T> tmp = null;

				// Traverse the list to find the correct position to insert the event , but
				// first we need to check if the event is existed
				if (isConflict(((Event) t).getTime())) {
					System.out.println("event is already exist !!!");
					return false;
				}

				while (current != null
						&& ((Event) current.data).getName().compareToIgnoreCase(((Event) t).getName()) < 0) {
					tmp = current;
					current = current.next;
				}

				if (tmp == null) {
					newNode.next = head;
					head = newNode;
				} else {
					tmp.next = newNode;
					newNode.next = current;
				}
			}

			return true;
		}
		return false;
	}

	// public void ScheduleanEvent() {
//	Scanner input = new Scanner(System.in);
//	System.out.println("Enter event title: ");
////	String eventTitle = input.next();
//	System.out.println("Enter contact name: ");
//	String contactName = input.next();
//	System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
//	String eventDateTime = input.next();
//	System.out.println("Enter event location: ");
//	String eventLocation = input.next();

	// Check if the event already exists in the list

	/*
	 * current = head; while (current != null) { if (((Event)
	 * current.data).getEvent_title().equalsIgnoreCase(eventTitle) && ((Event)
	 * current.data).getName().equalsIgnoreCase(contactName) && !((Event)
	 * current.data).getTime().equalsIgnoreCase(eventDateTime)) {
	 * System.out.println("event already exist"); break; } current = current.next; }
	 * 
	 * //Event newEvent = new Event(eventTitle, contactName, eventDateTime,
	 * eventLocation); add(newEvent);
	 * System.out.println("Event successfully added!"); }
	 * 
	 * /* public void ScheduleanEvent() { Node<Event> list = new Node<>(); list =
	 * head;
	 * 
	 * 
	 * Scanner input = new Scanner(System.in);
	 * System.out.println("Enter event title"); String s1 = input.next();
	 * System.out.println("Enter contact name:"); String s2 = input.next();
	 * System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):"); String
	 * s3 = input.next(); System.out.println("Enter event location:"); String s4 =
	 * input.next();
	 * 
	 * Node<T> ComparePointer = head; while (ComparePointer != null) { if
	 * (((Contact)ComparePointer.data).getName().equals(s2)) { Event e = new
	 * Event(s1, s2, s3, s4); if (head == null) head = current = new Node((Event)e);
	 * else { Node<T> temp; temp = current.next; current.next = new Node((Event) e);
	 * current = current.next; current.next = temp; }
	 * 
	 * } ComparePointer = ComparePointer.next; }
	 * 
	 * }
	 **/
	public void printEventDetails(T t) {
		Node<Event> currnet=head;

		while (current != null) {
			if (currnet.data.getName().equalsIgnoreCase(((Event)t).getName()))
			((Event) (current.data)).display();
			findnext();
		}

	}

}
