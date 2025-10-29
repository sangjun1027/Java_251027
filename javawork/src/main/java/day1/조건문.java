package day1;

/*
 * 근무 시간(9시~18시) 맞으면 Y 아니면 N
 */
public class 조건문 {
	public static void main(String[] args) {
		
		int workTime = 10;
		
		if( workTime >= 9 && workTime <= 18) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		int sTime = 10;
		int eTime = 20;		//점심시간 1시간 빼고
		
		//총 근무시간이 8시간이상이면 "초과근무"로 출력
		if( eTime - sTime -1 >= 8 ) {
			System.out.println("초과근무 / 헬조선의 도비로구나 !!!");
		} else {
			System.out.println("넌 개꿀빠는구나");
		}
		
		if ( eTime - sTime -1 >= 8 ) {
			System.out.println(eTime - sTime -9 + " 시간 초과근무/돈 더 받으셈" );
		}
		
	}
}
