package assignment;

import java.util.Stack;

public class ObjectStack {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack<Comparable> stk = new Stack<Comparable>();
		
		System.out.println("Creating Stack...");
		stk.push("Hallo");
		stk.push(10);
		stk.push('c');
		stk.push(10.1f);
		
		System.out.println("Displaying Stack : "+stk);
		
		//delete last element(stack pop)
		stk.pop();
		System.out.println("After pop: "+stk);
		

	}

}
