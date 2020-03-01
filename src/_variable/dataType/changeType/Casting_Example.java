package _variable.dataType.changeType;

public class Casting_Example {

	public static void main(String[] args) {
		//byte(1) < short(2) = char(2) < int(4) < long(8) < float(4) < double(8)
		
		/* <Casting>
		 * 방법: 작은 타입 = (작은 타입) 큰 타입
		 * 큰타입을 작은타입단위로 쪼개고 끝 한부분만 작은 타입으로 강제변환 
		 * 원래값이 보존되는것이 중요하다.
		 */
		
		int intValue = 44032; //손실X
		//int intValue = 77778; //손실O
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);	//정수부분만 저장
		
		//* int → 실수 : 정밀도 손실을 피하기위해 float대신  double을 이용하자
		int num1 = 123456780;
		int num2 = 123456780;
		
		//float num3 = num1; //가수부분이 32비트를 초과했으므로 손실 발생
		double num3 = num1; //double은 float보다 더 큰 비트의 가수를 저장할 수 있다.
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}
	
}
