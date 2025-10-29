package day1;

import java.util.HashSet;
import java.util.Set;

public class 로또번호 {
	public static void main(String[] args) {
		// 리스트 변수 선언 ==> 중복값 제거하려면 Set를 이용
		// ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		// while(list.size() < 6
		while (lotto.size() < 6 ) {
			// 난수생성 ( 1 ~ 45 )
			int num = (int)(Math.random() * 45 ) + 1;
			// 리스트에 추가 ( add() )
			lotto.add(num);
		}
		// 결과출력
		for(int luck : lotto ) {
			System.out.println(luck);
		}
	}
}
