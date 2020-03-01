package _variable.dataType.primitiveType;

public class GarbageValue_Example {

	public static void main(String[] args) {
		/*
		 * 실행 중에 값의 범위를 초과할 경우엔 -128 ~ 127를 순회
		 * 내가 원하지 않은 값을 Garbage Value(쓰레기 값) 라고 한다.
		 */
		
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("Var1: " + var1 + "\t" + "Var2: " + var2);
		}
	}

}
