package game;

import java.util.Scanner;

public class GuessNum {
	public void start() {
		
Scanner sc = new Scanner(System.in);
		
		int target = (int)(Math.random() * 100 ) + 1;
		int count = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int userN = Integer.parseInt(sc.nextLine());
			
			if ( userN > 100 || userN < 0) {
				System.out.println("범위를 벗어났습니다.");
				continue;
			} 
			
			if ( userN > target ) {
				System.out.println("Down");
				count++;
			} else if ( userN < target ) {
				System.out.println("Up!");
				count++;
			} else {
				System.out.println("딩!동!댕!");
				System.out.println("수고욤!!!");
				break;
			}
				System.out.println(count + "회");
		}// end while
	}
}
