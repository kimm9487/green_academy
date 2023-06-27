package fullstack.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		int data;
		
		try {
			fis = new FileInputStream("InputStreamEx1.java");
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
