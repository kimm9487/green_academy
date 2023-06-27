package fullstack.ioex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InpuStreamEx1 {

	public static void main(String[] args) throws Exception {
		// 표준 입력스트림(콘솔로부터 입력)을 이용해서 여러분의 키보드값 받아볼게요.
		/*
		 * System.out.println("첫수 입력 : "); int su = System.in.read(); //아래 두개는 엔터 처리용.
		 * System.out.println(System.in.read()); System.out.println(System.in.read());
		 * System.out.println("두번째수 입력 : "); int su2 = System.in.read();
		 * 
		 * System.out.println((char)su + " : " + (char)su2);
		 */

		// byte 로 쓰여진 파일로 부터 읽어들일게요.
		/*
		 * 스트림 사용하는 방법 1. 대상에 스트림 연결 2. 읽거나 쓴다(write()) 3. 할일다했으면 반드시 닫는다(close());
		 */
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("first.dat");

			/*
			 * for(int i = 0; i<=14; i++) { int data = fileInputStream.read();
			 * System.out.println("읽은 데이터 " + data); }
			 */

			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
