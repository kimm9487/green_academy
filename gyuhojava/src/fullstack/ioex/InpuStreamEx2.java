package fullstack.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class InpuStreamEx2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		int data;
		
		byte[] rByte = new byte[4];//파일을 읽어서 읽은 데이터를 담는 배열 선언
		//새롭게 읽은 byte 갯수를 int 로 리턴하고, 새롭게 읽히지 않은 배열의 인덱스
		//값은 이전값으로 유지 됩니다. 파일의 끝에 다다르면 -1 리턴합니다.
		try {
			fis = new FileInputStream("InpuStreamEx1.java");
			//fis = new FileInputStream("first.dat");
			//바이트배열을 이용한 파일 읽기
			while((data = fis.read(rByte)) != -1) {
				System.out.print("읽은 데이터 수 : " + data);
				System.out.print("----");
				System.out.println(new String(rByte,0,data));
			}
			
			/*
			 * while((data = fis.read()) != -1) { System.out.print((char)data); }
			 */
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
