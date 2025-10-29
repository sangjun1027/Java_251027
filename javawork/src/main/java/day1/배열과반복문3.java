package day1;

public class 배열과반복문3 {
	public static void main(String[] args) {
		/*
		 * 			js							java
		 *	for ( item of list )	=> 	for ( int item : list )
		 *	for ( item in list )	=> 	java에는 X
		 *	list.foreach
		 */
		
		// ex) 성적 5개
				int[] score = { 5, 4, 3, 2, 1 };
				int ea = 0;
				
				// 성적 출력
				for ( int sc : score) {
					System.out.println( sc + "점");

					// 통과여부 (3점이상이면 통과)
					if ( sc >= 3 ) {

						// 통과건수 ++
						System.out.println("통과");
						ea++;
					} else {
						System.out.println("꼬죠!!!!");
					}
				}
				// 통과건수 출력
				System.out.println("통과건수는" + ea + "건 입니다");
		
	}

}
