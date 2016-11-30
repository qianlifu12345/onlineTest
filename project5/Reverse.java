package project5;

import java.util.Stack;

public class Reverse {
	
	public static String reverse(String line) {
		Stack stack = new Stack(); 
		String[] wordArray=line.split(" ");
		StringBuffer result=new StringBuffer();
		//push the words into stack
		for (int i = 0; i < wordArray.length; i++) {
			stack.push(wordArray[i]);
		}
		//pop the element from stack
		while (!stack.isEmpty()) {
			result.append(stack.peek().toString()+" ");
			stack.pop();
		}
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		System.out.println(reverse("This is a computer"));

	}

}
