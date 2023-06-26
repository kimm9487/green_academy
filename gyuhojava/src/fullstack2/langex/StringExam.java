package fullstack2.langex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;

public class StringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String sayHello = "안녕 아현";
		String sayHello2 = "안녕 아현";
		String sayHello3 = new String("안녕 아현");
		
		if(sayHello.equals(sayHello3)) {
			System.out.println("값 같음");
		}else {
			System.out.println("값 틀림");
		}
		String a = "A";
		String b = "a";
		
		System.out.println(a.equals(b));
		
		String emptyStr = new String(" ");
		System.out.println(emptyStr.length());
		if(emptyStr.isBlank()) {
			System.out.println("공백문자열임");
		}else {
			System.out.println("값있음");
		}
		
		
		
		byte[] bArr = {48,49,50,51,-10};
		
		//byte[] 파라미터로 받아 그 값을 문자열로 생성하는 생성자 호출함
		String bString = new String(bArr);
		System.out.println(bString);
		
		//여러분의 이름을 java에 기본 세팅된 문자셋(character set) 으로
		//encoding 후 바이트배열로 리턴하는 메서드를 이용해볼게요.
		bArr = "노재현".getBytes();
		
		System.out.println(Arrays.toString(bArr));
		System.out.println(new String(bArr,0,3));
		
		int unicode = "노재현".codePointAt(0);
		
		System.out.println(unicode);
		
		String msg = "Hello World";
		
		if(msg.contains("Hello")) {
			System.out.println("포함됨");
		}
		
		
		
		char[] name = {'노','재','현'};
		String copyVal = String.copyValueOf(name);
		System.out.println(copyVal);
		
		
		
		
		String value  = String.join(":", "a","b","c","d");
		System.out.println(value);
		
		
		
		//Charset 클래스를 이용해서 자바에서 이용 가능한 문자셋(character set)
		//정보를 얻어볼게요.
		//나중에 배우는 Map 타입으로 리턴되는 available....() 을 이용합니다.
		
		SortedMap charsets = Charset.availableCharsets();
		System.out.
		println("지원되는 문자set 수 : " + charsets.size());
		
		Set key = charsets.keySet();
		for(Object obj : key) {
			System.out.println(obj);
		}
		
		
		byte eucKR[] = "노재현".getBytes("EUC-KR");
		byte utf8[] = "노재현".getBytes("UTF-8");
		
		System.out.println(Arrays.toString(eucKR));
		System.out.println(Arrays.toString(utf8));
		
		String newName = new String(eucKR, "UTF-8");
		System.out.println(newName);
		
		
		
		
		/*
		 * StringQuiz 클래스를 생성해서 다음처럼 작성하세요.
		 * 
		 * 프로그램 시작하면, 이메일 입력 하라고 띄우고, 값 받으세요.
		 * @ 없으면, 없다고 메세지 후 종료
		 * 있다면, id 와 서버 분리하세요.
		 * id 검증하세요. 8 ~ 12 사이여야하고, 반드시 첫자는 대문자여야하고,
		 * 값중에 하나는 반드시 숫자가 포함 되어 있어야합니다.
		 * 
		 * 위 검증로직을 완성후, 모두 올바르면 마지막으로 입력된 서버값을 
		 * .을 기준(ex : no777@abc.com or .net 입력시..)으로 
		 * 메일서버명을 fullstack.com 으로 모두 변경해서
		 * 변경된 이메일값을 축 회원 가입 aabc@fullstack.com 님 으로 출력시키세요
		 * 만약 위 조건중 하나라도 어긋나면 뭐가 문제인지 출력시키세요.
		 */
		
		
		
		String msg2 = "오늘은 수요일 입니다.";
		
		StringBuilder sb = new StringBuilder(msg2);
		
		//delete 를 이용해서 수요일을 삭제 해보세요.
		
		sb.delete(sb.indexOf("수"), sb.lastIndexOf(" "));
		System.err.println(sb);
		
		System.out.println(sb);
		
		//sb 의 값을 가진 문자열 객체로 리턴하도록 해보세요.
		//ex> String theDay = ??;
		
		
		StringTokenizer st = new StringTokenizer("월/화/수/목","/");
		System.out.println(st.countTokens());
		
		
		System.err.println("Hello");
		
		
		
		
		

	}

}
