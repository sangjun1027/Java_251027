package day1;

import java.util.ArrayList;

public class 리스트 {
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
		
	//추가 : add
	list.add("사과");
	list.add("망고");
	list.add("키위");
	list.add("딸기");
	
	// 삽입 : add
	list.add(0,"수박");
	System.out.println(list);
	
	// 삭제 : remove
	list.remove(1);
	System.out.println(list);
	
	// 변경 : set
	list.set(0, "바나나");
	System.out.println(list);
	
	// 조회 : get
	System.out.println("첫 번째 과일은 : " + list.get(0));
	
	// 전체조회 1. for
	String temp = null;
	for (int i = 0; i < list.size(); i++) {
		temp = list.get(i);
		System.out.println( i + " : " + temp );	
	}
	
	// 2. 확장 for
	System.out.println("확장 for ================= ");
	for (String f : list ) {
		System.out.println(f);
	}
  }
}

