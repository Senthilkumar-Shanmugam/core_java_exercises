package concurrency;

import java.util.concurrent.atomic.AtomicReference;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
}
public class AtomicExample {

	public static void main(String[] args) {
		Person person = new Person("Galahar",40);
		Person newPerson = new Person("Galahar2",40);
		
		AtomicReference<Person> ref = new AtomicReference<Person>(person);
		
		//boolean exchange = ref.compareAndSet(person, newPerson);
		boolean exchange = ref.compareAndSet(newPerson,person);
		System.out.println(" exchanged>>"+exchange);
		
		System.out.println(" new object>>"+ref.get().getName());
		

	}

}
