package _class;

public class DiffOfInstanceAndStatic {
	//인스턴스 필드와 정적 필드
	String color; //객체마다 가지고 있어야할 데이터(계산기 별로 색이 다름)
	static double pi = 3.14159; //객체들이 동일하게 사용하는 데이터(계산기에서 사용하는 파이값은 동일)
	
	//인스턴스 메소드와 정적 메소드
	void setColor(String color) { //인스턴스 필드로 작업해야할 매소드
		this.color = color;
	}
	
	static int plus(int x, int y) { //인스턴스 필드로 작업하지 않는 메소드
		return x + y;
	}
}
