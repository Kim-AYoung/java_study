package _variable.dataType.primitiveType;

public class Byte_Example {

	public static void main(String[] args) {
		//값의 범위: -128 ~ 127
		//byte b = 128; 		//컴파일 에러
		
		byte b = 65;
		//b = b + 1;				// byte, short 타입을 +연산하면 int타입으로 변환되는데 byte타입에 저장했으므로 컴파일 오류
		b++;
	}

}
