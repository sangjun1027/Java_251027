package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

public class EmpSalary {

	String fileName;
	List<Employee> list = new ArrayList<>();
	private long sum = 0;

	public long getSum() {
		return sum;
	}

	public EmpSalary(String fileName) {
		super();
		this.fileName = fileName;
	}

	// 초기화
	public void init() {
		try {
			Scanner sc = new Scanner(new File("c:/Temp/emp.txt"));

			while (sc.hasNext()) {
				String emp = sc.nextLine();
				String[] empInfo = sc.nextLine().split(",");
				int id = Integer.parseInt(empInfo[0]);
				String name = empInfo[2];
				long sal = Long.parseLong(empInfo[7]);
				list.add(new Employee(id, name, sal));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 급여계산
	public void cal() {
		// 명령형 프로그래밍 ( 절차지향, 객체지향 ) why이가 중요
		for (Employee e : list) {
			sum += e.getSalary();
		}
		
		// 선언형 프로그래밍 (함수형) what이 중요
		sum = list.stream().mapToLong(Employee::getSalary).sum();
	}

	// 정렬
	public void sort() {
		Comparator<Employee> compare = (o1, o2) -> (int) (o1.getSalary() - o2.getSalary());
		list.sort(compare);
	}

	// 출력
	public void print() {
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

} // end of class
