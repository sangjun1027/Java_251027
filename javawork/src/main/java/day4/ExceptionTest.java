package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	
	public static int menuInput() throws InputMismatchException, MenuException {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3), 종료(0): ");
		
		int user;
		
		user = sc.nextInt();
		
		//프로르램 상 업무규칙위배
		if( user > 3 ) {
			throw new MenuException("입력범위오류");	
		}
		return user;
	 }	
	
	public static void main(String[] args) {
		
		int menu = 0;
		try {
			menu = menuInput();
		} catch (InputMismatchException e) {
			//	e.printStackTrace();
				System.out.println(e.getMessage());
				menu = 0;
		}catch (MenuException e) {
			System.out.println(e.getMessage());
			
		//	e.printStackTrace();
		} catch (Exception e) {
	
	    }
		System.out.println(menu);
		System.out.println("게임종료");
	}
}
