package _variable.dataType.changeType;

public class CheckValue_BeforeCasting_FromIntToByte_Example {	
	//Casting은 원래 값을 보존하는 것이 중요하다.
	//다음은 int를 byte로의 Casting 손실유무를 검사하는 코드이다.
	
	public static void isKeepValue(int i) {	
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 경우 손실이 발생합니다.");
			System.out.println("손실을 발생시키지 않으려면" + Byte.MIN_VALUE + "이상 " + Byte.MAX_VALUE + "이하의 값을 입력해주세요.");
		} else {
			System.out.println("byte타입으로 손실없이 변환가능합니다.");
		}
	}
	
	public static void main(String[] args) {
		int i=100;	
		isKeepValue(i);
		byte byteValue = (byte) i;
		System.out.println(byteValue);
	}
}
