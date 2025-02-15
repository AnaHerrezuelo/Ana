package mainEx12;

import java.util.Scanner;

public class Employee {
	Scanner keyboard= new Scanner(System.in);
	
	private String name;
	private final String COMPANYNAME = "Michelin";
	private static int salaryBase=1200;
	int age, salary;
	double salaryInc;

	public Employee() {
	}

	public Employee(String name, int age, double salaryInc) {
		super();
		this.name = name;
		this.age = age;
//		this.salaryInc = salaryInc;
		this.setSalaryInc(salaryInc);
		//this.setSalary();
	}

//	public Employee(String name, int age, double salaryInc, int salaryBase) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.salaryInc = salaryInc;
//		this.salaryBase = salaryBase;
//	}
	
	public void askData() {
		System.out.println("give me the name: ");
		this.name=keyboard.next();
		
		System.out.println("Give me the age");
		this.age=keyboard.nextInt();
		
		System.out.println("Give me the Salary Increase");
		setSalaryInc(keyboard.nextDouble());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public static int getSalaryBase() {
		return salaryBase;
	}

	public static void setSalaryBase(int salaryBase) {
		Employee.salaryBase = salaryBase;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalaryInc() {
		return salaryInc;
	}

	public void setSalaryInc(double salaryInc) {
		//this.salaryInc = salaryInc;
		this.salaryInc= (salaryInc*0.01);
		setSalary();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary() {
		//this.salary = salary;
		this.salary= (int) (Employee.salaryBase + (Employee.salaryBase*this.salaryInc));
	}

	// PRINTTERS
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", COMPANYNAME=" + COMPANYNAME + ", age=" + age + ", salaryInc=" + salaryInc
				+ ", salary=" + salary + "]";
	}

}
