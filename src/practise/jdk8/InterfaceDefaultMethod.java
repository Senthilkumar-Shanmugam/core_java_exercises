package practise.jdk8;

interface Person {
	public abstract String getFirstName();

	public abstract String getLastName();

	public default String getFullName() {
		return getFirstName() + "," + getLastName();
	}

	public abstract boolean isStudent();

	public default boolean isNotStudent() {
		return !isStudent();
	}

}

class Human implements Person {

	@Override
	public String getFirstName() {
		return "I am a";
	}

	@Override
	public String getLastName() {
		return "Great";
	}

	@Override
	public boolean isStudent() {
		return false;
	}

}

public class InterfaceDefaultMethod {
	public static void main(String[] p) {
		Human human = new Human();
		System.out.println("Name>>" + human.getFullName());
	}

}
