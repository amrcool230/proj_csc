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
			if (((Contact)current.data).getName().equalsIgnoreCase(s)) {
				((Contact)current.data).display();
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

			if (((Contact)current.data).getAddress().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact)current.data).display();
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

			if (((Contact)current.data).getBirthday().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact)current.data).display();
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
			if (((Contact)current.data).getPhoneNumber().equals(s)) {
				((Contact)current.data).display();
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

			if (((Contact)current.data).getEmailAddress().equalsIgnoreCase(s)) {
				if (tmp.head == null)
					tmp.head.data = current.data;

				((Contact)current.data).display();
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

	public void addContact() {
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
			if (((Contact)ComparePointer.data).getAddress().equals(e.getAddress())
					&& ((Contact)ComparePointer.data).getEmailAddress().equals(e.getEmailAddress())
					&& ((Contact)ComparePointer.data).getPhoneNumber().equals(e.getPhoneNumber())) {
				System.out.println("This contact is already entered!");
				break;
			}
			ComparePointer = ComparePointer.next;
		}

		Node<T> temp;
		if (empty())
			current = head = new Node((Contact<T>) e);

		temp = current.next;
		current.next = new Node((Contact<T>) e);
		current = current.next;
		current.next = temp;

		System.out.println("contact successuflly added!!");

	}

	public void deletecontact() {
		if (current == head)
			head = head.next;
		else {
			Node<T> tmp = head;

			while (tmp.next != current)
				tmp = tmp.next;

			tmp.next = current.next;
		}

		if (current.next == null)
			current = head;
		else
			current = current.next;
	}

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
	public boolean addEvent(Event event) {
        Node<T> newNode = new Node(event);

        if (empty()) {
            head = current = newNode;
        } else {
            current = head;
            Node<T> previous = null;

            // Traverse the list to find the correct position to insert the event
            while (current != null && ((Event) current.data).getName().compareToIgnoreCase(event.getName()) < 0) {
                previous = current;
                current = current.next;
            }

            if (previous == null) {
                newNode.next = head;
                head = newNode;
            } else {
                previous.next = newNode;
                newNode.next = current;
            }
        }

        return true;
    }
	
	public void ScheduleanEvent() {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter event title: ");
	    String eventTitle = input.next();
	    System.out.println("Enter contact name: ");
	    String contactName = input.next();
	    System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
	    String eventDateTime = input.next();
	    System.out.println("Enter event location: ");
	    String eventLocation = input.next();

	    // Check if the event already exists in the list
	    boolean eventExists = false;
	    current = head;
	    while (current != null) {
	        if (((Event) current.data).getEvent_title().equalsIgnoreCase(eventTitle)
	                && ((Event) current.data).getName().equalsIgnoreCase(contactName)
	                && ((Event) current.data).getTime().equalsIgnoreCase(eventDateTime)
	                && ((Event) current.data).getLocation().equalsIgnoreCase(eventLocation)) {
	            eventExists = true;
	            break;
	        }
	        current = current.next;
	    }

	    if (eventExists) {
	        System.out.println("Event already exists!");
	    } else {
	        Event newEvent = new Event(eventTitle, contactName, eventDateTime, eventLocation);
	        addEvent(newEvent);
	        System.out.println("Event successfully added!");
	    }
	}
        
            
	/*public void ScheduleanEvent() {
		Node<Event> list = new Node<>();
		  list =  head;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter event title");
		String s1 = input.next();
		System.out.println("Enter contact name:");
		String s2 = input.next();
		System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
		String s3 = input.next();
		System.out.println("Enter event location:");
		String s4 = input.next();

		Node<T> ComparePointer = head;
		while (ComparePointer != null) {
			if (((Contact)ComparePointer.data).getName().equals(s2)) {
				Event e = new Event(s1, s2, s3, s4);
				if (head == null)
					head = current = new Node((Event)e);
				else {
					Node<T> temp;
					temp = current.next;
					current.next = new Node((Event) e);
					current = current.next;
					current.next = temp;
				}

			}
			ComparePointer = ComparePointer.next;
		}

	**/}
		public void printEventDetails() { 
			LinkedList_ADT<Event> list = new LinkedList_ADT<Event>();
			
		}
		
	
		
		
		
		
		
}
