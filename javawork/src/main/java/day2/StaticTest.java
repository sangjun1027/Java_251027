package day2;

/*
 *  static(정적, 공통) 필드, 매서드
 *  모든 객체가 공유하는 feild
 *  공유feild, class feild라 부른다
 *  static가 없는 feild는 그냥 인스턴스 feild라 부름
 */
public class StaticTest {
	public static void main(String[] args) {
		
		// static 클래스 이름으로 바로 접근가능
		// 객체생성없이 사용가능 : 최고의 장점
		Student.schoolName = "서울대";
		
		
		Student s1 = new Student(1, "둘리");
		Student s2 = new Student(2, "고길동");
		
		
		System.out.println(s1.name);
		System.out.println(s1.schoolName);
		
		System.out.println(s2.name);
		System.out.println(s2.schoolName);
		
		
	}
}
