package _annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//(Class명).class에는 해당 Class의 정보가 저장된 객체가 있음
		Method[] declaredMethods = Service.class.getDeclaredMethods(); 
		
		for(Method method : declaredMethods) {
			
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				//구분선 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}		
				System.out.println();
				//메소드 호출
				try {
					method.invoke(new Service()); //Service service = new Service(); service.method();
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}

}
