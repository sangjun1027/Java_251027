package day1;

public class 반복문 {
	public static void main(String[] args) {
		
		// for문
		// A ~ Z까지 출력
		// 65 ~ 91

		for (int i = 0; i<26 ; i++) {
			System.err.print(i + " " + (char)('A' + i));
		}
		
		for (int i=48; i<=57; i++) {
			System.out.println(i + " " + (char)i);
		}
	}
}
