package day1;

public class 배열과반복문 {
	public static void main(String[] args) {
		/* 교재 page.200
		* int[] arr = {1,2,3};
		* String[] arr = 
		* 배열길이가 고정이기에 정확하게 지정해줘야 한다.
		*/
		
		// ex) 성적 5개
		int[] score = { 5, 4, 3, 2, 1 };
		// 통과된 건수를 저장할 변수를 선언하고 0으로 초기화
		int ea = 0;
		
		// 성적 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "점");

			// 통과여부 (3점이상이면 통과)
			if (score[i] >= 3) {

				// 통과건수 ++
				System.out.println("통과");
				ea++;
			} else {
				System.out.println("꼬죠!!!!");
			}

		}
		// 통과건수 출력
		System.out.println("통과건수는" + ea + "건 입니다");
	} //end main
} //end class



