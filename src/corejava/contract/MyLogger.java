package common;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("test");
			fos.write(17);
		}catch(IOException ioe){
			System.out.println("s");
		}finally{
			//fos.close();
		}

	}

}
