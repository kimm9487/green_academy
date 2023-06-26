package fullstack2.langex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExam {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Method[] declarMethods = Service.class.getDeclaredMethods();
		for(Method method : declarMethods) {
			//PrintAnnotaion 얻기
			PrintAnontaion printAnontaion = method.getAnnotation(PrintAnontaion.class);
			
			printLine(printAnontaion);
			
			method.invoke(new Service());
			
			printLine(printAnontaion);
		}
	}
	private static void printLine(PrintAnontaion printannotation) {
		if(printannotation != null) {
			int number = printannotation.number();
			for(int i = 0; i<number; i++) {
				String value = printannotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
