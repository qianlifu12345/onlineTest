package project6;

import java.util.*;

import javax.xml.transform.Templates;

public class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int v){
		value=v;
		left=null;
		right=null;
		
	}
	
	public void addLeft(Node child) {
		this.left=child;
	}
	
	public void addRight(Node child) {
		this.right=child;
	}
	
	public static String levelTravel(Node root) {
		
		StringBuffer result=new StringBuffer();
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp =queue.poll();
			result.append((int)temp.value+" ");
			//if the node have child, add child into the queue
			if (temp.left!=null) {
				queue.add(temp.left);
			}
			if (temp.right!=null) {
				queue.add(temp.right);
			}
		}
		
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		
		//Create tree
		Node root=new Node(8);
		root.addLeft(new Node(6));
		root.addRight(new Node(10));
		root.left.addLeft(new Node(5));
		root.left.addRight(new Node(7));
		root.right.addLeft(new Node(9));
		root.right.addRight(new Node(11));
		//levelTravel
		String result=levelTravel(root);
		System.out.println(result);
		
	//
		
		// TODO Auto-generated method stub

	}

}
