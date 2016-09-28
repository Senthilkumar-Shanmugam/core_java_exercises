package exchange.interview;

import java.util.ArrayList;
import java.util.Collection;

public class StackImplInheritance<E> extends ArrayList<E> {

	public StackImplInheritance() {
		super();
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E obj = peek();
		remove(size() - 1);
		return obj;
	}

	public boolean empty() {
		return isEmpty();
	}

	public E peek() {
		if (empty())
			throw new RuntimeException("Stack is empty");
		return get(size() - 1);
	}


	
	public int search(Object obj) {
		int loc = lastIndexOf(obj); 
		if(loc >= 0){
			return size() - loc;
		}
		return -1;
	}
	
	public boolean contains(Object o) {
		throw new UnsupportedOperationException();
		
	}

	public static void main(String[] args) {
		StackImplInheritance<String> stack = new StackImplInheritance<String>();
		
		System.out.println("Is empty"+stack.empty());
		stack.push("senthil");
		stack.push("d");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		stack.push("g");
		
		System.out.println("search:"+stack.search("h"));
		System.out.println("Peek:"+stack.peek());
		
		System.out.println("Pop:"+stack.pop());
		System.out.println("Peek:"+stack.peek());
		

	}

}
