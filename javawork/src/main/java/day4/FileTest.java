package day4;
/*
 *  폴더 = 파일 시스템 API (폴더 생성, 삭제, 이름변경, 정보...)
 */

import java.io.File;

// jupiter가 5버전
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	@DisplayName("폴더목록조회")
	public void test1() {
		File file = new File("c:/Temp");
		String[] files = file.list();
		for (String fL : files) {
			System.out.println(fL);
		}
	}

	@Test
	@DisplayName("파일삭제")
	public void test2() {
		File file = new File("c:/Temp", "copy3.txt");
		file.delete();
	}

	@Test
	@DisplayName("파일정보")
	public void test3() {
		File file = new File("c:/Temp", "emp.txt");
		// 파일크기 : 첨부파일업로드 table을 따로 설계했을 때, 필요
		System.out.println("파일크기 : " + file.length());
		System.out.println("파일이름 : " + file.getName());
		
		// 파일확장자출력 -> txt
		// .의 위치 : indexOf
		int idx = file.getName().indexOf(".");
		String ext = file.getName().substring(idx);
		System.out.println(ext);
		
	}
}