package day1;
/*
 * 관계 / 논리 연산자 ==> if조건
 * 논리 연산자에서 중요 : and		&& 
 * 					  or		||
 * 					  not		!
 */
public class 논리연산자 {
	public static void main(String[] args) {
		
		// 
		int x = 5;
		int y = 5;
		
		if ( x > 10 && y> 10) {
			System.out.println("맞아");
		} else {
			System.out.println("아냐");
		}
		
		System.out.println(x);
		System.out.println(y);
		
				
		
		
	}
}
