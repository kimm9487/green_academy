package com.pack1.pack2;



import com.pack1.HisClass;
import com.pack1.MyClass1;

//import 구문을 이용해서 MyClass1 을 import 합니다
//반드시 패키지 선언문 다음에 나와야합니다.


//MyClass1 만 import 함


public class URClass extends MyClass1 {
	
	MyClass1 mycls;
	HisClass hiscls;
	
	
	public URClass() {
		super("경기 의정부",'m');
	}
	
	@Override
	protected void b() {
		// TODO Auto-generated method stub
		super.b();
		System.out.println("여긴 자식의 메서드의 다른 내용..");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
