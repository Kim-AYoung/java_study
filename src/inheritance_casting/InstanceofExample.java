package inheritance_casting;

public class InstanceofExample {
	
	//부모객체에는 없는 자식객체의 필드와 메소드를 사용하기 위해 부모 타입의 객체를 자식 타입으로 강제타입변환하는 메소드
	public static void castingFromParentToChild(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("Parent를 Child로 casting 가능");
			child.method1();
		} else {
			//parent가 참조하는 객체가 Child가 아니므로 ClassCastException 발생
			//Child child = (Child) parent;
		}
	}
	
	public static void main(String[] args) {
		 Parent parent1 = new Child();
		 castingFromParentToChild(parent1);
		 System.out.println("-----------------------------");
		 
		 Parent parent2 = new Parent();
		 castingFromParentToChild(parent2);

	}

}
