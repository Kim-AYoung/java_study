package _annotation;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}	
	
	@PrintAnnotation(value="#", number=20) //엘리먼트를 2개 이상 적용할 떄는 value를 명확하게 밝힘
	public void method3() {
		System.out.println("실행 내용3");
	}	
}
