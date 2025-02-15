package mainEx12;

public class mainEmployee {
	public static void main(String[] args) {

		Employee emp = new Employee("aa", 23, 12);
		

//		emp.askData();
		emp.printToString();
		Manager man= new Manager("aaa", 12, 10, "dep", 2);
		man.printToString();
		
//		Employee [] emplo  = new Employee [2];
//		for(int i=0; i<emplo.length;i++) {
//			System.out.println("Employee "+(i+1));
//			emplo[i]=new Employee();
//			emplo[i].askData();
//		}
//		for(int i=0; i<emplo.length;i++) {
//			emplo[i].printToString();
//		}
		
	}// end public static void main(String[] args)
}// end mainEmployee
