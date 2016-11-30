package project2;

import java.util.Stack;

public class BracketMatch {

    public static boolean match(String str) {
        Stack stack = new Stack();
        char[] array = str.toCharArray();
        stack.push((char) array[0]);//add the first element from string array

        for (int index = 1; index < array.length; ++index) {
        	//if the stack is empty,push a new element from array.
        	if (stack.isEmpty()) {
        		stack.push(array[index]);
			}else{
	            char c1 = (char) stack.peek();
	            char c2 = array[index];
	        	//verify if the top of stack and first value in the array can be a pair of Bracket
	        	//if yes,pop out the element from stack
	            //if no,push new element from array
	            if (c1=='(' && c2==')') {
	                stack.pop();
	            } else {
	                stack.push(c2);
	            }
            
			}
        }
        return stack.isEmpty();
    }
    
	public static void main(String[] args) {
		
		System.out.println((Boolean)match("(()"));
		System.out.println((Boolean)match("())"));
		System.out.println((Boolean)match("()()"));
		System.out.println((Boolean)match("(()()"));
		System.out.println((Boolean)match("())(()"));
		System.out.println((Boolean)match("(())"));
		
//		        (() - > wrong
//				()) -> wrong
//				()() -> right
//				(()() -> wrong
//				())(() -> wrong
//				(()) -> right 

	}
}
