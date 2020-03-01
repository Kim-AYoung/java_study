package _variable.dataType.primitiveType;

public class Long_Example {

	public static void main(String[] args) {
		//int범위의 리터럴은 상관이 없지만 초과하는 리터럴은 반드시 L를 붙여야 된다.
		
		long l1 = 10;
		
		//long l2 = 100000000000000;	//정수는 기본적으로 4byte(int)로 인식하고 있으므로 컴파일 오류
		long l3 = 100000000000000L;
		
	}

}
