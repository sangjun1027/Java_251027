package day2;

//원을 면적을 계산하는 클래스
public class CircleArea {
	
	//필드
	private int radius;		// read, writer 둘 다 가능
	private double area;	// 캡슐화, read only
	
	//생성자
	public CircleArea() {}
	public CircleArea(int radius) {
		this.radius = radius;
	}
	
	public static double calArea(int r) {
		return r * r * Math.PI;
	}
	
	public static double rArea(int r) {
		return Math.PI * r * r ;
	}
	
	//메서드 오버로딩(중복선언 : 같은이름가능, 매개변수타입, 갯수가 달라야함)
	public void calArea(){
		area = radius * radius * Math.PI;
	}

	// setter, getter : 접근권한 관련 개념
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
}

