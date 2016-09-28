package exchange.interview;

import java.util.ArrayList;
import java.util.List;

/*
 * This is a custom stack implementation using List data structure
 * using composition
 */

public class StackImplComposition<E> {

	protected List<E> contents;

	public StackImplComposition() {
		contents = new ArrayList<E>();
	}

	public E push(E item) {
		contents.add(item);
		return item;
	}

	public synchronized E pop()  {
         E obj = peek();
		 contents.remove(contents.size()-1);
		return obj;
	}

	public synchronized E peek()  {
		if(contents.size() < 1)
				throw new RuntimeException("Stack is empty");
		return contents.get(contents.size()-1);
	}

	public boolean empty() {
		return contents.isEmpty();
	}

	public synchronized int search(Object o) {
		
		int loc = contents.lastIndexOf(o);
		
		if(loc >= 0){
			return contents.size() - loc;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		StackImplComposition<String> stack = new StackImplComposition<String>();
		StackImplInheritance test  = new StackImplInheritance();
		test.contains("");
		System.out.println("Is empty"+stack.empty());
		stack.push("senthil");
		stack.push("d");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		stack.push("g");
		
		System.out.println("search:"+stack.search("g"));
		System.out.println("Peek:"+stack.peek());
		System.out.println("Pop:"+stack.pop());
		System.out.println("Peek:"+stack.peek());
		
	}

}
