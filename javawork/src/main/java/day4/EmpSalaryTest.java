package day4;

public class EmpSalaryTest {
	
	public static void main(String[] args) {
		
		EmpSalary empSalary = new EmpSalary("c:/Temp/emp.txt");
		empSalary.init();
		empSalary.cal();
		empSalary.sort();
		empSalary.print();
		System.out.println("급여합계 = " + empSalary.getSum());
	
	} // end of main
} // end of class
