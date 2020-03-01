package _variable.dataType.primitiveType;

public class Char_Example {

	public static void main(String[] args) {
		/*
		 * 한 문자를 10진수 유니코드(0~65535)로 저장 
		 * 아스키 문자(특수기호, 숫자, 영어): 0 ~ 127 
		 * 한글 문자: 44032 ~ 55203 
		 * 작은 따옴표로 감싸야 한다.
		 */
		
		//char c = '';		//컴파일 에러 : 빈 문자를 표현하는 유니코드가 없음
		char c = ' ';		//따라서 공백으로 초기화
		
		char c1 = 'A';
		char c2 = 65;		//10진수 유니코드
		char c3 = '\u0041';	//16진수 유니코드
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		int uniCode = c1;
		System.out.println(uniCode);
	}

}
