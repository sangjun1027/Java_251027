package day2;

public class Proffessor {
	
	// static : 공통사용, 모든학생은 같은학교 소속!즉, 학생 전부에게 포함되는
	
	int no;
	String name;
	String addr;
	int roomNo;

	// 기본생성자(매개변수가 없는)
	// 생성자가 하나도 선언된게 없으면 컴파일러가 자동으로 추가해줌
	// 생성자를 하나라도 만들면 추가되지 않음
	
	public Proffessor() {
		this(0, "무명");	// this() : 다른 생성자를 호출 가능
	}
	public Proffessor(int no, String name) {
		this.no = no;	// this가 자기자신을 가리킨다.
		this.name = name;
	}	
}
