package _variable;

public class SafeOperation {
	public static void main(String[] args) {
		
		try {

		int result = safeAdd(2000000000, 2000000000);
		System.out.println(result);
		
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확한 계산을 할 수 없음"); 
		}
		
		//이외에도 부동소수점 타입(실수)으로 계산을 할 경우 정확도가 떨어지므로 정수로 계산한 후 마지막에 실수로 변환해주자
	}

	public static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if (left < Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
