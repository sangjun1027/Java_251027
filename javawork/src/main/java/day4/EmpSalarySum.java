package day4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

/*
 *  예제) 사원 급여 합계 계산
 *  
 *  class
 *  
 *  data(feild)
 *  	 List
 *  	filename
 *  
 *  기능(method)
 *      List 초기화
 *      급여계산
 *      정렬
 *      출력
 */

public class EmpSalarySum {

	public static void main(String[] args) throws IOException {

		// temp 폴더 안에 emp.txt 파일이 있음!
		// 1. scanner로 파일을 연다
		// 2. for문을 활용해서 line만큼 for문 실행
		// 3. 사원, 이름, 급여를 read
		// 4. 급여 합계 계산, 출력

		// 1. Scanner로 파일열기
		Scanner sc = new Scanner(new File("c:/Temp/emp.txt"));
		long sumSalary = 0;
		List<Employee> list = new ArrayList<>();

		// 2. line만큼 반복문
		while (sc.hasNext()) {
			String emp = sc.nextLine();
			// System.out.println(emp);

			/*
			 * // 3. 사원, 이름, 급여를 read String[] empInfo = emp.split(",");
			 * 
			 * /* System.out.print("사번 : " + empInfo[0] + " | "); System.out.print("사원이름 : "
			 * + empInfo[2] + " | "); System.out.println("급여 : " + empInfo[7]); sumSalary +=
			 * Integer.parseInt(empInfo[7]); }
			 */ // end of while

			// 3. 사번,이름, 급여 출력

			String[] empInfo = sc.nextLine().split(",");
			int id = Integer.parseInt(empInfo[0]);
			String name = empInfo[2];
			long sal = Long.parseLong(empInfo[7]);
			list.add(new Employee(id, name, sal));
			sumSalary += sal;
		}

			// 4. 급여 합계 계산, 출력
			System.out.println(" 급여합계는 " + sumSalary);

		// 5. 급여순으로 정렬해서 출력
			// 오름차순정렬
			// o1, o2가 employee 객체
			list.sort((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
			for ( Employee e : list) {
				System.out.println(e);
			}
			
			System.out.println("===========================");
			
		// 5번을 stream을 이용해서 한 줄로
			list.stream()
				.sorted((a, b) -> (int)(a.getSalary() - b.getSalary()))
				.forEach(e -> System.out.println(e));
			//stream 중 comparator 활용 ↑와 같음
			// list.stream()
			//	   .sorted(compare)
			//     .forEach(e -> System.out.println(e));
			
		// 4. 급여 합계 계산, 출력
		System.out.println(" 급여합계는 " + sumSalary);
			
	} // end of main
} // end of class
