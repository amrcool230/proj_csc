
public class Node<T> {
	

	public T data;
	public Node<T> next;
	
	
	public Node() { 
		next=null;
		data=null;
		
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node(T d) { 
		data =  d;
		next= null;
		
	}
	
	
} 
