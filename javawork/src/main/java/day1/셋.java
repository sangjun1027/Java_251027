package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class 셋 {	//중복값 허용 X / 순서가 마음대로
	public static void main(String[] args) {
		
		Set<String> score = new HashSet<>();
		
		score.add("사과");
		score.add("사과");
		score.add("바나나");
		score.add("수박");
		
		System.out.println(score);
		
		// 전체조회 : index 없음, 순서없음 ( 주머니 => 일렬로 줄을 세우고 )
		Iterator<String> iter = score.iterator();
		while(iter.hasNext()) {	// 다음요소가 있는지 검사
			String item = iter.next();	// 있으면 조회
			System.out.println(item);
		}
		
		// List를 Set에 넣어버리면 중복값 제거
		List<String> names = (List<String>)Arrays.asList("사과", "사과", "포도"); 
		Set distinctName = new HashSet(names);
		System.out.println(distinctName);
		
	}
}
