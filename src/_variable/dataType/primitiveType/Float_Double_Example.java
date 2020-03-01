package _variable.dataType.primitiveType;

public class Float_Double_Example {

	public static void main(String[] args) {
		//실수는 지수와 가수를 이용하기때문에 동일한 메모리 크기를 가지는 int, long보다 더 큰 수를 저장   
		//예) 3000000 → 0.3 * 10^7 (0.3: 가수, 7: 지수)
		
		double var1 = 3.14;		//실수는 기본적으로 8byte(double)로 인식
		//float var2 = 3.14;	//float(4byte)에 8byte를 저장하려고 하므로 컴파일 오류
		float var3 = 3.14F;		//float리터럴은 끝에 F를 붙임
		
		//정밀도 검사
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;	//double이 float보다 더 정밀하다.
		System.out.println(var4);
		System.out.println(var5);
	
	}

}
