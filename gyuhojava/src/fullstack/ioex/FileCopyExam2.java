package fullstack.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일을 읽어들인 후에 카피본을 생성해서 저장할 예정입니다.
 * 일단, 한글깨지는것 감안하세요.
 * 두번째, 읽었으면, 카피하려면 새로쓴다라는 의미입니다.
 * 이 말은 파일을 읽어들인 데이터는 프로그램내부로 input 되어질거구요
 * 읽혀진 data는 파일에 output 되어질겁니다.
 * 
 * 참고로 InputStream 클래스와 OutputStream 클래스는 똑같은 구조로 상속 처리되어있습니다.
 * 즉 클래스이름이 in-->out 으로 바뀔뿐이에요.
 */
public class FileCopyExam2 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Manic-063\\git\\green_academy\\gyuhojava\\libs\\first.dat");

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		byte bArr[] = new byte[4];
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file.getName()+"_back");
			int data;
			while((data = fis.read(bArr)) != -1){
				fos.write(bArr,0,data);
			}
			
			fis.close();
			fos.close();
			System.out.println("파일 복사 끝.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
