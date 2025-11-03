package day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
 *	File --> Path, Files 
 */

public class PathFilesTest {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("c:/Temp");	
		
		// 파일목록
		Files.walk(path)
			//.forEach(System.out:println);
			.forEach(s -> System.out.println(s));
		
		// 파일 읽기
		Path file = Paths.get("c:/Temp", "data.txt");
		List<String> lines = Files.readAllLines(file);
		for( String s : lines ) {
			System.out.println(s);
		}
	
		// 파일정보 읽기 ( 파일 크기, 생성(변경)시간))
		System.out.println(file);
		System.out.println(Files.getLastModifiedTime(file));
		
		// 파일저장
		Path newFile = Paths.get("c:/Temp", "path.txt");
		Files.write(newFile, Arrays.asList("Hello", "Java"));
		
		// 파일명 변경
		
		
		// 파일 삭제
		
		
		
	}
}
