package day2;

public class CalcTest {
	public static void main(String[] args) {
		
		// 계산기 테스트
		Calcurator cal = new Calcurator(6, 9);
		
		cal.add();
		System.out.println(cal.result);
		
		cal.mul();
		System.out.println(cal.result);
		
		// 원 면적
		CircleArea circleArea = new CircleArea();
		circleArea.calArea();
		// circleArea.area = 10;
		System.out.println(circleArea.getArea());
		
		// 정적메서드(static) 호출
		double result = CircleArea.calArea(5);
		System.out.println(result);
		
		
	}
	
}
