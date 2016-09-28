package generics;


class OldWrapper{
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class Wrapper<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
}
public class ParameterizedClass {

	public static void main(String[] args) {
		
		// using old
		
		OldWrapper wrp = new OldWrapper();
		wrp.setItem(new Integer(12));
		
	
		 Wrapper newW = new Wrapper();
		 
		 newW.setItem("sds");

	}

}
