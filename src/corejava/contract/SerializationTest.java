package corejava.contract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent2 implements Serializable {
	protected transient String hello = "Hello!";
}

class Child2 extends Parent2 {
	int age = 11;

	public String toString() {
		return "age=" + age+ "hello="+hello;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object"));
		out.writeObject(new Child2());

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object"));
		System.out.print(in.readObject());

	}

}
