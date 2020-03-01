package _annotation;

import java.lang.annotation.*;

	@Target({ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME) //RUNTIME을 제일 자주 사용
	public @interface PrintAnnotation { //직접 어노테이션을 만들기보다는 Document에 있는 것을 자주 사용함
		String value() default "-"; 
		int number() default 15;
	}
