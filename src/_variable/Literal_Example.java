package _variable;

public class Literal_Example {

	public static void main(String[] args) {
		// <정수 리터럴>
		int var1 = 10;		//10진수
		int var2 = 010; 	//8진수: 0으로 시작하는 리터럴  ( 1 * 8^1 + 0 * 8^0 )
		int var3 = 0x10;	//16진수: 0x 또는 0X로 시작하는 리터럴 ( 1 * 16^1 + 0 * 16^0 )
		
		// <실수 리터럴>
		//실수는 부동 소수점(floating-point)방식으로 저장
		//(부호+,-) 가수 * 10^지수 (이때, 가수는 0 <= m < 1) 
		//예) 1.2345 → 0.12345 * 10^1
		
		double var4 = 0.25;		//10진수
		double var5 = 5E3;		//지수와 가수: 10의 지수를 나타내는 E 또는 e를 포함하는 리터럴 ( 가수 * 10^지수 )
		double var6 = 5E-3;
		//int g = 2E5;			//실제로는 정수이지만 지수와 가수를 사용하므로 실수에 저장한다.
		
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var5);
		System.out.println(var6);
		
		// <문자 리터럴>
		char var7 = 'A';
		System.out.println(var7);
		char var8 = '한';
		
		//이스케이프 문자
		char var9 = '\t'; 
		
		System.out.println("탭 만큼\t들여쓰기");
		System.out.println("한 줄\n내려쓰기");		//라인피드 : 다음 줄로 이동
		System.out.println("한 줄\r내려쓰기");		//케리지리턴 : 원래는 커서를 멘 앞으로 이동 시키는 역할이지만 현운영체제는 줄을 바꾸는 역할로 쓰임
		System.out.println("This\'s java");		// \ + ",',/ 를 해야지 제대로 나옴
		System.out.println("이것은 \"중요\"하다" );
		System.out.println("사과 한개당 \\500원 입니다");
		
		char var10 = '\u0041';					// \ + u + 16진수 유니코드 (10진수 : 4 * 16^1 + 1 * 16^0 = 65)
		System.out.println(var10);
		
		// <문자열 리터럴>
		System.out.println("대한" + 8); 			// +: 문자열 결합 문자 
		
		// <논리 리터럴>
		boolean var11 = true;
		boolean var12 = false;
		System.out.println("논리 리터럴: " + var11 + ", "+ var12);
		
		//변수는 선언된 블록 내에서만 사용이 가능하다.
		//메소드 블록 내에서 선언된 변수를 로컬 변수라 한다.
		int var_1 = 10;
		
		for(int i=0; i<10; i++) {
			int var_2 = 10;
		}
		
		//int var_3 = var_1 + var_2;
	}

}
