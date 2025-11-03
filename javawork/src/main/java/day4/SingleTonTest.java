package day4;

// 객체를 하나 생성하고 돌려쓴다.
// private!가 핵심!

public class SingleTonTest {
	
	public static void main(String[] args) {
		// dept의 class 유일한 인스턴스를 얻는다(항상 같은 객체를 돌려줌)
		Dept dept1 = Dept.getInstance();
		Dept dept2 = Dept.getInstance();
		// " == "는 두 참조가 같은객체(같은주소)를 가르키는지 비교
		System.out.println(dept1 == dept2);
		
	} // end of main
} // end of class

class Dept {
	
	// class가 로딩될 때 단 한 번 생성되는 유일한 인스턴스
	
	private static Dept instance = new Dept();
	// 외부에서 호출 못하도록 private로 막음
	private Dept() {}
	
	// getter
	public static Dept getInstance() {
		// 항상 같은 인스턴스를 반환
		return instance;

} //  end of class
	
	
}
