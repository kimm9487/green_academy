package fullstack.ioex;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/*
 * Filter In/Out Stream : 기존 스트림에 특정 기능을 추가한 메서드를 보유한
 * 기능 클래스 입니다. 대부분이 IO 할때 이 필터클래스를 이용해서 효율성을 높이거나
 * 객체를 통째로 쓰거나, 자바 Data 를 쓰거나 읽거나 하는 기능을 구현합니다.
 * 
 * 대표적인 Filter 로는 BufferedIn/OutputStream 이 있고, 모든 스트림은 
 * 1:1로 in/out 이 구성되어 있습니다.
 */
public class FilterStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("first.dat");
			//스트임원형을 버퍼에 꼽습니다.
			bis = new BufferedInputStream(fis);
			
			BufferedInputStream bs = 
					new BufferedInputStream(new FileInputStream(new File("test.dat")));
			bs.close();
			
			int data;
			while((data = bis.read()) != -1) {
				System.out.print((char)data);
			}
			//위 두개이상이 연결된 경우엔 반드시 마지막 스트림을 닫아햐 하거나
			//모두 순차적으로 닫아야합니다.
			//일반적으로는 마지막 스트림을 close() 하게 되면 내부에서
			//super.close() 를 호출해서 순차적으로 모두 닫게됩니다.
			bis.close();//버퍼스트림만 close() 하면 됩니다.
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}








