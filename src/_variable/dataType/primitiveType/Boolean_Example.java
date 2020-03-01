package _variable.dataType.primitiveType;

public class Boolean_Example {

	public static void main(String[] args) {
		//boolean은 1byte의 크기를 가짐
		
		/* <이용하는 경우> 
		 * 두가지 상태값을 따라 조건문(if문), 제어문(for, while문)의 실행 흐름 조절할 경우
		 */
		boolean[] stopArr = new boolean[2];
		stopArr[0] = true;
		stopArr[1] = false;		
		int stopArrIndex = (int)(Math.random()*2);
		boolean stop = stopArr[stopArrIndex];
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

	}

}
