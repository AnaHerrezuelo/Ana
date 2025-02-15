package mainEx12;

public class Manager extends Employee{
	private String department;
	private double bonus;
	
	public Manager() {
		super();
	}
	public Manager(String department, double bonus) {
		super();
		this.department = department;
		this.bonus = bonus;
	}
	
	public Manager(String name, int age, double salaryInc, String department, double bonus) {
		super(name, age, salaryInc);
		this.department = department;
		this.bonus = bonus;
	}
	public void askData() {
		super.askData();
		System.out.println("give me the department: ");
		this.department=keyboard.next();
		
		System.out.println("Give me the Salary Increase");
		this.bonus=keyboard.nextDouble();
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return "\n"+super.toString() + "\nManager [department=" + department + ", bonus=" + bonus + "]";
	}
	
	
	
	
	
	
}
