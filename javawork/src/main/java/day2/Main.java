package day2;
/*
 *  인스턴스 파악을 위한 test
 */
public class Main {
	public static void main(String[] args) {
		// 2단계) 객체생성
			// 참조변수↓	 // ↓인스턴스(힙(메모리)영역에 저장공간이 할당)
		Student student = new Student();	// 인스턴스는 하나만 생성되었다.
											// 인스턴스는 하나지만 변수2개가 참조
		
		student.no = 2006;
		student.name = "고길동";
		student.addr = "대구";
		
		Student s3 = new Student(2001, "둘리");
		
		Student s4 = new Student(2001, "또치", "서울");
		
		Proffessor prof = new Proffessor();
		
		// 3단계) 사용
		student.addLecture();
		
		// 얕은복사(주소만 복사, 같은 인스턴스를 참조)
		Student student2 = student;
		student2.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student == student2);
	}
}
