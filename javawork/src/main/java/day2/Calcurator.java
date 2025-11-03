package day2;
// 요구사항 : 덧셈, 곱셈, 계산기
public class Calcurator {
	
	// feild
	int n1;
	int n2;
	int result;
		
	// 기본생성자
	public Calcurator() {}
	
	public Calcurator (int n1) {
		this.n1 = n1;
	}
	
	// 생성자
	public Calcurator (int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// method
	public void add() {
		result = n1 + n2;
	}
	
	public void mul() {
		result = n1 * n2;
	}
	
}
	
