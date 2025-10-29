package day1;

/*
 * Wrapper클래스(포장클래스) 기본타입들을 감싸서... 어쩌고저쩌고 ... 
 * char 		int			long		float		double		<-8
 * character	Integer		Long		Float
 * 1. 객체화	-> null값 가능	파라미터		?age=		--> Integer age ( int는 에러, integer는 가능 )
 * 2. 형변환
 * 3. 박싱 / 언박싱
 */

public class 문자열형변환 {
	public static void main(String[] args) {
		
		String strAge = "40";
		// String -> int로 변환
		int age = Integer.parseInt(strAge);
		
		// int -> String로 변환
		strAge = Integer.toString(age);
		
		// true, false 묻는거 : isDigit 
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
		
		
		String sosuAge = "9.99";
		double age2 = Double.parseDouble(sosuAge);
	}
}
