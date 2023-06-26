package fullstack2.langex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderExam {

	public static void main(String[] args) {
		//calendar 객체 생성함
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		now.set(Calendar.MONTH, Calendar.DECEMBER);
		//DAY_OF_YEAR
		
		
		
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

		Date dnow = now.getTime();
		System.out.println(dnow);
		
		Date dnow2 = new Date(System.currentTimeMillis());
		System.out.println(dnow2);
		
		Calendar convDnow2 = Calendar.getInstance();
		convDnow2.setTime(dnow2);
		
		System.out.println("크리스마스까지 "  + (now.get(Calendar.DAY_OF_YEAR) -  convDnow2.get(Calendar.DAY_OF_YEAR)) + "일 남음");
		
		//날짜를 특정 형식으로 포맷하는 DateFormat 을 봅니다.
		//날짜, 문자, 숫자 등 모든 형식을 format 하는 애가 있는데,
		//걔는 나중에 시간되면 보고, 날자형식만 먼저 볼게요.
		
		String format = "지금은 yyyy-MM-dd일 a HH 시 mm분 ss 초입니다";
		//format 을 SimpleDateFormat 객체의 파람으로 넘깁니다.
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//상속받은 format(Date) 을 호출해서 위 포맷대로 현재시간을 표현합니다.
		System.out.println(sdf.format(Calendar.getInstance().getTime()));
		
		
		
		
		
		
		
		
		
		
	}

}
