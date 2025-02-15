package mainEx12;

public class Employee {
	private String name;
	private final String COMPANYNAME="Michelin";
	private final int SALARYBASE=1200;
	int age, salaryInc;
	
	public Employee(String name, int age, int salaryInc) {
		super();
		this.name = name;
		this.age = age;
		this.salaryInc = salaryInc;
	}
	
	
}
