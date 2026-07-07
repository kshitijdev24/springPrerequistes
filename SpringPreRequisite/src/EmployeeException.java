import java.util.Scanner;

class Employee1{
	String name;
	double salary;
	
	Employee1(String name,double salary){
		if(name==null) {
			throw new NullPointerException("Employee name cannot be null");
		}
		if(salary<0) {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee{name="+name+", salary="+salary+"}";
	}
}
public class EmployeeException {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter employee name:");
			String name=sc.nextLine();
			
			System.out.println("Enter salary:");
			double salary=Double.parseDouble(sc.nextLine());
			
			Employee1 emp=new Employee1(name,salary);
			System.out.println("Employee created:"+emp);
		}
		catch(NullPointerException | IllegalArgumentException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}
		System.out.println("Program continues..........");

	}

}
