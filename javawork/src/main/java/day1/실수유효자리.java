package day1;

public class 실수유효자리 {
	public static void main(String[] args) {
	
		// float형
		// 접미에 'f'를 붙여 float형임을 알려줘야함
		// 기본값은 double기에 값의 범위가 달라 오류발생 ( 큰 -> 작 )
		float f = 0.123456789f;		//유효자릿수 7자리
		float f2 = (float)0.123456789;		//강제 형변환
		
		System.out.println(f);
		System.out.println(f2);
		
		// double형
		double d = 0.12345678987654321;		// 유효자릿수 15자리
		double d2 = 0.12f;					// 강제 형변환 ( 작 -> 큰 )
		
		System.out.println(d);
		System.out.println(d2);				// float의 근사값을 담아서 표현
		
	}
}
