package project1;

public class Node {
	int elem;
	Node next;
	public Node (Node nextval){
		next=nextval;
	}
	public Node (int elem,Node nextval){
		this.elem=elem;
		this.next=nextval;
	}

}
