package project1;
import project1.Node;

public class Link {
	
	Node head;
	
	public Link(int first) {
		head=new Node(first,null);
	}
	
	public boolean add (int newValue){
		Node p=head;
		while (p.next!=null) {
			p=p.next;
		}
		p.next=new Node(newValue,null);
		return true;
		
	}
	

	
	public int getValueFromBack(int k) {
		Node p=head;
		Node p2=head;
		int stepsAhead=k-1;
		//construct 2 flags,let one of flag ahead of the other. 
		//When the pre-flag get to end point, the other one is the result.
		while (stepsAhead!=0) {
			if (p.next!=null) {
				p=p.next;
				stepsAhead--;
			}else {
				System.out.println("The value k is out of the boundary.");
				System.exit(1);
			}	
		}
		
		while (p.next!=null) {
			p=p.next;
			p2=p2.next;
		}
		
		return p2.elem;
		
		
	}
	
	public void printList() {
		Node p =head.next;
		while (p!=null) {
			System.out.println(p.elem);
			p=p.next;
		}
		
		
	}
}
