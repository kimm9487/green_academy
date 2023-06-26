package fullstack2.langex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * System 클래스 : 자바가 실행되는 환경에 대한 정보를 정의한 클래스
 * 기본적으로 자바 JRE, Path, 자바 Process 등에 대한 정보를 리턴하는 메서드와
 * JRE 가 실행되는 OS 에 대한 환경 정보등을 관리 합니다.
 */
public class SystemEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("현재 시스템의 시간값 : " + System.currentTimeMillis());
		 * System.out.println(System.nanoTime());
		 */
		long startTime = System.nanoTime();
		int total = 0;
		
		for(int i =0; i<=1000000; i++) {
			total += i;
		}
		
		//루프가끝나면 끝나 시간값 측정합니다.
		long endTime = System.nanoTime();
		
		System.out.
		println("백만번 루프시 경과 시간 " + (endTime - startTime) + " 나노초");
		
		//Properties : 프로그램을 작성하는데 필요한 기초 정보를 담아놓는 파일 
		//또는 프로그램이 실행 될때 필요한 정보등을 보유하고 있는 주체등을 통틀어 말합니다.
		//이 내용을 파일로 작성해서 보관하고, 필요시 읽어들이거나 파일 수정등을 할수 있고
		//때에따라서는 자바가 실행되는 시스템 전반(OS 라던지, JRE or VM)에 설정된
		//값을 읽어 들일수도 있습니다.
		//이 프러퍼티스는 key : value 값으로 설정을 하고(작성) 필요시에
		//key 정보를 읽어서 사용하는 방식입니다.
		
		//getEnv() 를 이용해서 환경 정보(Properties) 를 얻어볼게요.
		Map<String, String> envs = new HashMap<>(System.getenv());
		System.out.println(envs.size());
		
		Set<String> keySet =  envs.keySet();
		for(String key : keySet) {
			System.out.println(key);
		}
		
		System.out.println("OS 정보 : " + System.getProperty("os.name"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
