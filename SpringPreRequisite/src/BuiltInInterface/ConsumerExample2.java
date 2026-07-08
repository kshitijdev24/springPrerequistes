package BuiltInInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Employee{
	double salary;
	String name;
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}
public class ConsumerExample2 {

	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(
				new Employee("Kshitij",55000),
				new Employee("Hridya",65000),
				new Employee("Avaan",75000)
				);
		Consumer<Employee>printEmployee=e->System.out.println(e.name+" earns: "+e.salary);
		
		employees.forEach(printEmployee);

	}

}
