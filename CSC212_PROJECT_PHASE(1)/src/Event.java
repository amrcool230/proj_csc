import java.util.Scanner;

public class Event {
	
	private String location,date,title,name;
	public Event(String title,String name,String date,String location) {
		
		this.name=name;
		this.date=date;
		this.title=title;
		this.location=location;
	}
	
	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public String getTime() {
		return date;
	}

	public String getEvent_title() {
		return title;
	}

	
	public void display() {
		//System.out.println("contact found");
		System.out.println("Name: "+name);
		System.out.println("PhoneNumber: "+date);
		System.out.println("address: "+title);
		System.out.println("birthday: "+location);
	}

	

	

	
	/*public void ScheduleanEvent() {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter event title");
		String s1=input.next();
        System.out.println("Enter contact name:");
        String s2=input.next();
        System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
        String s3=input.next();
        System.out.println("Enter event location:");
        String s4=input.next();
        
       
       Node<T> ComparePointer = head;
   	while (ComparePointer != null) {
		if (ComparePointer.data.getName().equals(s1)&& !sea) {
			Event<T> e = new Event<T>(s1, s2, s3, s4);
		 			if (head==null)
		 				head=current= new Node<T>((Event<T>)e);
		 			else {
		 				Node<T> temp;
		 				temp = current.next;
		 				current.next = new Node<T>((Event<T>) e);
		 				current = current.next;
		 				current.next = temp;
		 			}
			
		}
		ComparePointer = ComparePointer.next;
	}
	**/}
