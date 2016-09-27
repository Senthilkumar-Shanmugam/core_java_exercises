package corejava.contract;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String name = null;
		File file = new File(name);
		System.out.println(file.getName()); 
	}

}
