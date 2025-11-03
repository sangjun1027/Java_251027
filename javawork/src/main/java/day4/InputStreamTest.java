package day4;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  InputStream, OutputStream
 */
public class InputStreamTest {
		// 왜 IOException?
	public static void main(String[] args) throws IOException {
		// try catch(예외처리)
		// FileNotFoundExeption error => 예외처리 하라는 오류
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		
		int readByte;
		// 더이상 읽을내용이 없으면 "-1"을 넘겨준다
		// read() => 한 번에 읽을 수 있는 bite가 있음 
		while ((readByte = System.in.read()) != -1 ) {		//Ctrl + z
			fw.write(readByte);
		}
		fw.close();
		
	} //end main
} // end class
