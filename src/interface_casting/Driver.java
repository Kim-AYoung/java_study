package interface_casting;

public class Driver {
	
	//Vehicle인터페이스에는 없는 Bus구현클래스의 메소드를 사용하기 위해 Vehicle인터페이스 타입을 Bus타입으로 강제타입변환해주는 메소드
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //vehicle이 참조하는 구현객체가 Bus객체인지 확인
			Bus bus = (Bus) vehicle; 
			bus.checkFare();
		} else {
			//vehicle이 참조하는 객체가 Bus객체가 아니므로 ClassCastException 발생
			//Bus bus = (Bus) vehicle;
		}
		
		vehicle.run();
	}
}
