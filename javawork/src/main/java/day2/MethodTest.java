package day2;
// method 만드는 방법
public class MethodTest {
	public static void main(String[] args) {
		printHead();	// 매개변수X , return값X
		printString("menu");	// 큰 따옴표 -> String type
		printString("header");
		printString("wow");
	
		sum(5, 4);	// 매개변수가있는 method, return값X
		int num = mul(5, 4);	// 매개변수O, return값O
		
		System.out.println(total(2, 3, 4, 10));
		System.out.println(total(2, 3));
		System.out.println(total(2, 3, 1, 3, 3, 454, 4));
	}
	static int total(int ...score) {		// []매개변수
		int result = 0;	// 결과 저장 할 변수
		for( int sc : score) {			// score 배열 반복문
			result += sc;			// 합계 계산
		}
		return result;		// 결과 리턴
	}
	
	// 두 수의 곱셈
	static int mul (int x, int y) {
		// 두 수의 곱을 계산
		int num = x * y;
		System.out.println("두 수의 곱은 " + num);
		return num;
	}
	
	
	
	// 인수 2개 넘어가는 것(?)
	static void sum( int a, int b ) {
		//두 수의 합을 출력
		int tot = a + b;
		//합계출력
		System.out.println("두 수의 합은 " + tot);
	}
	
	
	
	// 중복되는 코드 => method , void:return값
	static void printHead() {		// retun값, 매개변수도 없는 가장 기본형태
		System.out.println("================");
		System.out.println("=====header=====");
		System.out.println("================");
	}
	
	static void printFooter() {
		System.out.println("================");
		System.out.println("=====footer=====");
		System.out.println("================");
	}
	
	static void printString(String str) {
		System.out.println("================");
		System.out.println("=====" + str + "=====");
		System.out.println("=======" + str + "======");
	} // return을 적지 않아도 void가 있기에 다시 돌아감, return적어도 상관없음
}
