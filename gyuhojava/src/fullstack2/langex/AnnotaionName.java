package fullstack2.langex;

public @interface AnnotaionName {
	String prop1();//속성1 선언
	int prop2() default 1;//속성 및 기본값 초기화
	String value();
	
}
