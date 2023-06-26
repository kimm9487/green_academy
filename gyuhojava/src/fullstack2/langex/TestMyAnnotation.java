package fullstack2.langex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyAnnotation {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//annotaion 이 적용된 클래스를 객체로 만들어, 어떻게 적용되는지 알아봅니다.
		Method[] methods =  UseMyAnnotaion.class.getDeclaredMethods();
		
		for(Method me : methods) {
			MyAnnotaion2 myAnnotaion2 = me.getAnnotation(MyAnnotaion2.class);
			printLine(myAnnotaion2);
			
			me.invoke(new UseMyAnnotaion());
			
			printLine(myAnnotaion2);
			
		}
	}
	//출력문을 메서드로 정의해서 이용할수 있도록 하게요.
	private static void printLine(MyAnnotaion2 myAnnotaion2) {
		int num = myAnnotaion2.number();
		for(int i = 0; i<num; i++) {
			String val = myAnnotaion2.value();
			System.out.print(val);
		}
		System.out.println();
	}
}
