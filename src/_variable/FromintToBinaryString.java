package _variable;

public class FromintToBinaryString {
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value); //앞의 비트가 0이면 생략하므로 아래와 같은 식을 추가해줌
		while(str.length() < 32) { str = "0" + str; }
		return str;
	}
}
