package _variable.dataType.changeType;

public class Promotion_Example {

	public static void main(String[] args) {
		//byte(1) < short(2) = char(2) < int(4) < long(8) < float(4) < double(8)
		
		char charValue = '가';
		int intValue = charValue;
		System.out.println(intValue);	//'가'의 유니코드
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);	//소수점(.0)이 붙음
		
		long longValue = 10000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		//*예외
		byte byteValue = 65;
		//char charValue = byteValue; //char타입은 Promotion도 Casting이용
		charValue = (char)byteValue;
		System.out.println(charValue);
		
		/* <promotion in 연산식>
		 * 두 피연산자(operand) 중 크기가 큰 타입으로 자동 변환
		 * int 이하의 타입 연산 : 기본적으로 int 타입으로 자동 변환 
		 * float 연산 : double로 자동 변환이 안됨
		 */
		byte num1 = 40;
		short num2 = 60;
		//short num3 = num1 + num2;
		int num3 = num1 + num2;
		
		float f1 = 3.5f;
		float f2 = 4.5f;
		float f3 = f1 + f2;
		float f4 = f1 + num3; 
		
		//*나눗셈 연산
		double int1 = 10 / 4; //실제로 계산은 2.5지만 double이 아닌 2로 int타입에 저장한다.
		System.out.println("10 / 4 : " + int1);
		
		double double1 = 10 / 4.0;
		 
		
	}

}
