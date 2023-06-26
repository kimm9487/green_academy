package fullstack2.langex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.naming.spi.DirStateFactory.Result;

public class ExceptionExam {

	
	//계산기의 결과를 담는 변수 하나 선언할게요.
	static double result;
	
	
	
	static boolean devide(int a, int b) {
		try {//예외가 발생할 수 있는 코드를 이 블럭내에 위치합니다.
		 result = a/b;
		 return true;
		}catch (ArithmeticException ae) {
			result = 0;
			return false;
		}
		 
		 
		 
		//두 수를 입력받아서 /(나누기) 하는 메서드 정의합니다.
		
		/*
		 * 예외를 핸들링하는 방법.
		 * 
		 * 1. throws 를 선언해서 예외를 전가하는 방법.
		 * throws 키워드는 두가지의 의미를 가지고 있는데, 하나는 내 코드(메서드 or 생성자)에
		 * 로직에는 예외가 발생 할 수 있는 로직이 있어 라고 선언하는 동시에, 만약 그런데도
		 * 불구하고 너가 나를 호출해서 사용하다가 예외가 발생하면 난 예외 객체를 생성해서 
		 * 너에게 전가(전달) 할거야 라는 의미가 있습니다.
		 * 
		 * 2. try/catch : 이 의미는 예외가 발생할 코드를try{}로 감싸고,
		 * 만약 예외가 발생하면 해당 예외객체를 받아서(catch) 올바르게 다음
		 * 로직으로 흐름을 이어가게 하는 방법입니다.
		 */
		
		
	}
	
	//properties 파일에 접금하도록 하는 메서드를 정의 할게요.
	static void getProp(String fName) throws Exception{
		Properties prop = new Properties();
			prop.load(new FileInputStream(new File("D:\\full_stack_2nd\\gyuhojava\\src\\fullstack2\\langex\\sleep\\test.properties" + fName)));
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Exception : 프로그램이 실행중에 발생하는 모든 에러 상황을 예외하고 합니다.
		 * 이렇게 예외가 발생하면 프로그램은 즉시 싱행을 멈추고 예외의 내용을 담은
		 * 예외객체(Exception 타입의 객체) 를 던지게(throw) 되어있습니다.
		 * 그래서 자바에서는 예외는 던져진다라고 표현을 합니다.
		 * 
		 * 실행중에 발생하는 에러 사항이기에 컴파일러는 관여를 못합니다.(순서 때문에...)
		 * 단 알려진 예외(Known Exception : RuntimeException 하위타입이 아닌애들) 인 경우엔 컴파일시 컴파일러가
		 * 예외를 핸들링 했는지는 검사하게 됩니다.
		 * 
		 * 
		 */
		//int a = 10, b = 0;
		/*
		while(true) {
			
			System.out.println("값 두개와 연산자 입력하세요");
			
			if(!devide(a, b)){
				System.out.println("0 으로 나눌 수 없음..");
				break;
			}
			System.out.println("결과 : ");
			System.out.println("계속 하시겠습니까?");
			break;
		}
		*/
		//devide(a, b);
		
		//System.out.println(10/b);//예외
		
		System.out.println("AAA");//앞에서 예외객체(Exception 객체)가 발생하면 앞에서 던져지기때문에 프로그램이 정지함./ (by zero)
		
		//찾으려는 파일명 넣어주세요..라고 띄웁니다.
		String fName = "test.properties";
		int a = 0;
		try {
			a=0;
			getProp(fName);
			a=10;
			System.out.println("게임결과는 당신 승");
		}catch(Exception e){
			System.out.println(("예외 발생"));
			System.out.println("예외 내용 : " + e.getMessage());
			e.printStackTrace();
			a=-1;
		}finally {
			//이 블락은 예외 여부와 상관없이 무조건 실행되는 블락입니다.
			//보통 여기에는 파일을 접근했을때 파일의 접근을 해제하거나,
			//DB 등에 연결했을때 DB 연결 해제하는 등의 자원에 대한
			//맨 마지막 처리를 할때 사용되는 블락입니다.
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		//Properties prop = new Properties();
		
		/*
		prop.load(
				new FileInputStream(
						new File
						("D:\\full_stack_2nd_노쌤\\ayeonJava\\src\\fullstack2\\langex\\sleep\\test.properties")));
		*/
		
		
		
		
		
		
	}

}
