package _variable.dataType.referenceType;

public class EnumExample {

	public static void main(String[] args) {
		Week today = Week.THURSDAY;
		System.out.println(today);
		System.out.println("today객체 안에 있는 문자열: " + today.name());
		System.out.println(today.name() + "의 순번(0부터 시작): " + today.ordinal());
	}

}
